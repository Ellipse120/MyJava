package com.lusai.day3;

import java.util.ResourceBundle;

public class Inter {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println(rb.getString("info"));
	}
}
