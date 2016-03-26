package com.lusai.day2;

public class SystemGCDemo {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Person p = new Person("Lusai",22);
	p = null;
	System.gc();
}
}
