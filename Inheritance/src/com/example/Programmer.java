package com.example;

public class Programmer extends Person{
	String technology;
	
	public Programmer() {
		
	}
	
	public Programmer(String name, String address, String technology) {
		super(name, address);
		this.technology = technology;
	}

	void hacking() {
		System.out.println("I can hacking the wesbite");
	}
	
	void coding() {
		System.out.println("I can create application using technology :" + technology + "."); 
	}
	
	void greeting() {
		super.gretting();
		System.out.println("My job is a" + technology + " programmer");
	}	
}
