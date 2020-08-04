package com.tomin.jenkinstest.Pojo;

public class User {
    private int id;
    private String name;
    private String country;
    private String sex;

    public User(int id, String name, String country, String sex) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.sex = sex;
    }
    public User(){

    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
