package com.example.mvpapp.Login.model;

public class UserData {

public  String username;
public  String password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}