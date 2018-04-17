package com.example.android.recyclerviewproject;

public class Students {                                     //Creates the model, with constructor & getters/setters

    private String name;
    private int age;
    private String phoneType;
    private String summary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Students(String name, int age, String phoneType, String summary) {
        this.name = name;
        this.age = age;
        this.phoneType = phoneType;
        this.summary = summary;


    }
}
