package com.lusai.day2;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Name: " + this.name + "Age: " + this.age;
	}
	public void finalize() throws Throwable {
		System.out.println("Object Released" + this);
	}
}
