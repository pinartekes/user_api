package com.bcfm_academy_2020.case_api;


public class User {

    private final String firstname;
    private final String lastname;

    public User(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

}
