package com.lusai.day3;

public class Person<T extends Info> {
	private T info;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
	public Person(T info){
		this.setInfo(info);
	}
	
	@Override
	public String toString() {
		return "Person [info=" + info + "]";
	}
}
