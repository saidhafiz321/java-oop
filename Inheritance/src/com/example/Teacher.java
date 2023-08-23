package com.example;

public class Teacher extends Person {
    String subject;

    public Teacher() {
    	
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("I can teach " + subject + " so anyone who wants to learn can talk to me.");
    }

    void greeting() {
        System.out.println("Hello, my name is " + super.name + ".");
        System.out.println("I come from " + super.address + ".");
        System.out.println("My job is a " + subject + " teacher.");
    }
}