/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Bean.AnswerModel;
import Bean.RespondentModel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arces
 */
public class Database {

    private Connection con;
    private String sql;
    private static Database databaseInstance = new Database();

    private Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://127.0.0.1:3306/nkols_db?user=root";
            String uUser = "root";
            String uPass = "te3dhousenkols";

            con = DriverManager.getConnection(host, uUser, uPass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return databaseInstance;
    }

    public String addAnswer(AnswerModel ans) {
        String isSuccess = "true";
        //if (validateUser(ans)) {
        PreparedStatement ps;
        sql = "INSERT INTO answer (question_id, respondent_id, choice_id, respondent_code, user_input) "
                + "VALUES(?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);

            //set question_id
            ps.setInt(1, ans.getQuestion_id());

            //set respondent_id
            ps.setInt(2, ans.getRespondent_id());

            //set choice_id
            if (!ans.getChoice_id().equals("null")) {
                ps.setInt(3, Integer.parseInt(ans.getChoice_id()));
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }

            //set respondent_code
            if (!ans.getRespondent_code().equals("null")) {
                ps.setString(4, ans.getRespondent_code());
            } else {
                ps.setNull(4, java.sql.Types.VARCHAR);
            }

            //set user_input
            if (!ans.getUser_input().equals("null")) {
                ps.setFloat(5, Float.parseFloat(ans.getUser_input()));
            } else {
                ps.setNull(5, java.sql.Types.FLOAT);
            }

            ps.execute();
        } catch (SQLException e) {
            isSuccess = "false";
        }
        //}

        return isSuccess;
    }

    public void addRespondent(RespondentModel respondent) {
        PreparedStatement ps;

        sql = "INSERT INTO respondent (respondent_type_id, code, enumerator_id, lang_id,"
                + " province_id, barangay_id, gender, birthdate, age, timestart, timefinish)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, respondent.getRespondent_type_id());
            ps.setString(2, respondent.getCode());
            ps.setInt(3, respondent.getEnumerator_id());
            ps.setInt(4, respondent.getLang_id());
            ps.setInt(5, respondent.getProvince_id());
            ps.setInt(6, respondent.getBarangay_id());
            ps.setString(7, respondent.getGender());

            //set birthdate
            if (!respondent.getBirthdate().equals("null")) {
                try {
                    java.sql.Date birthDate;
                    Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(respondent.getBirthdate());
                    birthDate = new java.sql.Date(birth.getTime());

                    ps.setDate(8, birthDate);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            } else {
                ps.setNull(8, java.sql.Types.DATE);
            }

            ps.setInt(9, respondent.getAge());

            //set timestart
            if (!respondent.getTimestart().equals("null")) {
                ps.setTimestamp(10, Timestamp.valueOf(respondent.getTimestart()));
            } else {
                ps.setNull(10, java.sql.Types.TIMESTAMP);
            }

            //set timefinish
            if (!respondent.getTimefinish().equals("null")) {
                ps.setTimestamp(11, Timestamp.valueOf(respondent.getTimefinish()));
            } else {
                ps.setNull(11, java.sql.Types.TIMESTAMP);
            }
            
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validateUser(AnswerModel ans) {
        boolean canExecute = false;
        PreparedStatement ps;
        ResultSet rs;
        sql = "SELECT * FROM enumerator WHERE username = ? AND password = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, ans.getUsername());
            ps.setString(2, ans.getPassword());

            rs = ps.executeQuery();

            if (rs.next()) {
                canExecute = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return canExecute;
    }
}
