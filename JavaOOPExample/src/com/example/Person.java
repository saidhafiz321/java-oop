package com.example;

public class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
	//Construktur Default
	Person(){
		
	}
	
	//constructor dengan satu parameter
	Person(String paraName){
		name = paraName;
	}
	
	//counstructor denga parameter
	Person(String name, String address){
		//penamaan nama parameter dan anam filed sama ,sehingga  terjadi shadowing variable
		
		this.name = name;//field tidak akan berubah datanya
		this.address  = address;//this. ini ,enunjukkan filed addres adalah dari class person itu sendiri 
	}
	//Method Void
	void sayHello(String paraName){
		System.out.println("Helloo" + paraName + "My Name is " + name +".");
	}
	
	//metod return value(mengembalkan nilai)
	String sayAddress() {
		return "I' come from " + address + ".";
	}
}
