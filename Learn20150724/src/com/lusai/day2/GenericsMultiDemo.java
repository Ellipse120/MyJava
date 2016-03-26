package com.lusai.day2;

public class GenericsMultiDemo {
public static void main(String[] args) {
	GenericsMultiple<String,Integer> g1 = new GenericsMultiple<String,Integer>();
	g1.setKey("lusai");
	g1.setValue(12);
	System.out.println("name " + g1.getKey()+" "+ "age "	 + g1.getValue());
	
	
}
}
