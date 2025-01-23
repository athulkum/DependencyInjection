package com.demo;

public class Student  {
	
	Laptop laptop;
	
	Student(){
		System.out.println("Student constructor");
	}
	
	Student(Laptop laptop){
		
		this.laptop=laptop;
	}
	

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	void doStudy() {
		
		laptop.Brand();
		
		System.out.println("i am student");
	}

}
