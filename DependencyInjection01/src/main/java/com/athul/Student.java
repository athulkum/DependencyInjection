package com.athul;

public class Student {
	
   Source source;
	
	Student(){
		System.out.println("default constructor");
	}
	
//	Student (Source source){
//	System.out.println("constructor");
//		this.source=source;
//	}
	
	public void setSource(Source source) {
		System.out.println("Setter");
		this.source= source;
	}
	
	void doStudy() {
		source.Start();
		System.out.println(" I studying ");
	}

}
