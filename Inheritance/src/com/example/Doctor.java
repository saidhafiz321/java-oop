package com.example;

public class Doctor extends Person{
	String specialist;
	
	public Doctor() {
	
	}
	
	public Doctor(String name, String address, String specialist) {
		super(name, address);
		this.specialist = specialist;
	}

	void surgery() {
		System.out.println("i can surgery operation patients");

	}
	
	void greeting() {
	System.out.println("Hello my name is " + name + "."); 
	System.out.println("I, come from " + address + "."); 
	System.out.println("My occupation is a " + specialist + "doctor.");
	}
}
