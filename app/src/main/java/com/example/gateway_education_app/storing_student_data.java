package com.example.gateway_education_app;

public class storing_student_data {
    //create string to get data
    String name,father_name,email,phone_no,password,roll_no;




    //create a empty constructor

    public storing_student_data() {


    }
    //create constructor for the given strings//

    public storing_student_data(String name, String father_name, String email, String phone_no, String password, String roll_no) {
        this.name = name;
        this.father_name = father_name;
        this.email = email;
        this.phone_no = phone_no;
        this.password = password;
        this.roll_no = roll_no;
    }

    //use getter and setter method to get and set data //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
}

