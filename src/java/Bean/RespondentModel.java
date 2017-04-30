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
public class RespondentModel {
    private int respondent_type_id, enumerator_id, lang_id, province_id, barangay_id, age;
    private String code, gender, birthdate, timestart, timefinish;

    /**
     * @return the respondent_type_id
     */
    public int getRespondent_type_id() {
        return respondent_type_id;
    }

    /**
     * @param respondent_type_id the respondent_type_id to set
     */
    public void setRespondent_type_id(int respondent_type_id) {
        this.respondent_type_id = respondent_type_id;
    }

    /**
     * @return the enumerator_id
     */
    public int getEnumerator_id() {
        return enumerator_id;
    }

    /**
     * @param enumerator_id the enumerator_id to set
     */
    public void setEnumerator_id(int enumerator_id) {
        this.enumerator_id = enumerator_id;
    }

    /**
     * @return the lang_id
     */
    public int getLang_id() {
        return lang_id;
    }

    /**
     * @param lang_id the lang_id to set
     */
    public void setLang_id(int lang_id) {
        this.lang_id = lang_id;
    }

    /**
     * @return the province_id
     */
    public int getProvince_id() {
        return province_id;
    }

    /**
     * @param province_id the province_id to set
     */
    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    /**
     * @return the barangay_id
     */
    public int getBarangay_id() {
        return barangay_id;
    }

    /**
     * @param barangay_id the barangay_id to set
     */
    public void setBarangay_id(int barangay_id) {
        this.barangay_id = barangay_id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the timestart
     */
    public String getTimestart() {
        return timestart;
    }

    /**
     * @param timestart the timestart to set
     */
    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    /**
     * @return the timefinish
     */
    public String getTimefinish() {
        return timefinish;
    }

    /**
     * @param timefinish the timefinish to set
     */
    public void setTimefinish(String timefinish) {
        this.timefinish = timefinish;
    }
}