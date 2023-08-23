package com.example;

public class AppMain {

	public static void main(String[] args) {
		 Person person1 = new Person();
		 person1.name = "Hendra";
		 person1.address = "Garut";
		 
		 Teacher teacher1 = new Teacher();
		 teacher1.name = "said";
		 teacher1.address = "Bandung";
		 teacher1.subject = "Matematika";
		 
		 Doctor doctor1 = new Doctor();
		 doctor1.name = "Dito";
		 doctor1.address = "Medan";
		 doctor1.specialist = "Dentis";
		 
		 Programmer programmer1 = new Programmer();
		 programmer1.name = "Radit";
		 programmer1.address = "Jakarta";
		 programmer1.technology = "JavaScript";
		 
		 person1.gretting(); 
		 System.out.println();
		 
		 teacher1.gretting();
		 System.out.println();
		 
		 doctor1.gretting();
		 System.out.println();
		 
		 programmer1.gretting();
		 
	}

}
