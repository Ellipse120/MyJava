package com.lusai.day1;

public class PersonClone implements Cloneable {
	
	private String name = null;
	
	public PersonClone(String name){
		this.name= name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	//���าдclone����
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������" + this.getName();
	}
};


