package com.lusai.day3;

public class GenericsDemo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<Contact> per = null;
		per = new Person<Contact>(new Contact("NewYork","2131","12221"));
		System.out.println(per);
	}

}
