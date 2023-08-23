package com.example;

public class MainApp {

	public static void main(String[] args) {
		//membuat object dari class person dengna menggunakan constructor berparameter
		Person person1 = new Person("eko","Tegal");
		person1.sayHello("Padepokan 79");
		System.out.println(person1.sayAddress()); 
		
		//membuat oject dari class person menggunakn construktor default
		Person person2 = new Person();
		person2.name = "joko";
		person2.address = "surabaya";
		person2.sayHello("pedepokan 79");
		System.out.println(person2.sayAddress());
		
		//membuat object dari classs person dengan satu paramenter
		Person person3 = new Person("Budi");
		person3.address = "Bandung";
		person3.sayHello("Perpokan 79");
		System.out.println(person3.sayAddress());
	}

}
