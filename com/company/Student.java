package com.company;

public class Student {

    private String name;
    private String city;
    private String state;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student(String name, String city, String state, String phoneNumber) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    public void printMessage() {
        System.out.println("My name is " + name + " and I moved to the city of " + city + " and new state of " + state + ". My new phone number is " + phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}