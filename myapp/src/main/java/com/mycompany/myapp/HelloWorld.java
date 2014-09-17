package com.mycompany.myapp;

public class HelloWorld {

	private String name; 
	private String age; 
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public void printHello(){
		System.out.println("Hi " + this.name + " your age is " + this.age);
	}
}
