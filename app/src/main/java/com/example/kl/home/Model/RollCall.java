package com.example.kl.home.Model;

public class RollCall {

    public RollCall(String student_name, String student_id, String student_school, String student_department, String student_email, String image_url){
        this.student_name  = student_name;
        this.student_id = student_id;
        this.student_school = student_school;
        this.student_department = student_department;
        this.student_email = student_email;
        this.image_url = image_url;
    }

    String student_name;
    String student_id;
    String student_school;
    String student_department;
    String student_email;
    String image_url;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_school() {
        return student_school;
    }

    public void setStudent_school(String student_school) {
        this.student_school = student_school;
    }

    public String getStudent_department() {
        return student_department;
    }

    public void setStudent_department(String student_department) {
        this.student_department = student_department;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
}
