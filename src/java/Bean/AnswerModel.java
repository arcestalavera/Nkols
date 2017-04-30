/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Arces
 */
public class AnswerModel {
    private int question_id, respondent_id;
    private String username, password, choice_id, user_input, respondent_code;

    /**
     * @return the question_id
     */
    public int getQuestion_id() {
        return question_id;
    }

    /**
     * @param question_id the question_id to set
     */
    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    /**
     * @return the respondent_id
     */
    public int getRespondent_id() {
        return respondent_id;
    }

    /**
     * @param respondent_id the respondent_id to set
     */
    public void setRespondent_id(int respondent_id) {
        this.respondent_id = respondent_id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the choice_id
     */
    public String getChoice_id() {
        return choice_id;
    }

    /**
     * @param choice_id the choice_id to set
     */
    public void setChoice_id(String choice_id) {
        this.choice_id = choice_id;
    }

    /**
     * @return the user_input
     */
    public String getUser_input() {
        return user_input;
    }

    /**
     * @param user_input the user_input to set
     */
    public void setUser_input(String user_input) {
        this.user_input = user_input;
    }

    /**
     * @return the respondent_code
     */
    public String getRespondent_code() {
        return respondent_code;
    }

    /**
     * @param respondent_code the respondent_code to set
     */
    public void setRespondent_code(String respondent_code) {
        this.respondent_code = respondent_code;
    }
}
