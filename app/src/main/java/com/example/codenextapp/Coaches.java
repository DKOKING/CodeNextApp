package com.example.codenextapp;

public class Coaches {

    String name;
    String email;


    public Coaches(String name, String email){
        this.name = name;
        this.email = email;

    }

    public void setNames(String names) {
        this.name = names;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNames() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
