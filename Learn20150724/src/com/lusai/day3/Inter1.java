package com.lusai.day3;

import java.util.Locale;
import java.util.ResourceBundle;

public class Inter1 {
	public static void main(String[] args) {
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		
		ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);
		
		System.out.println("���ģ�" + zhrb.getString("info"));
		System.out.println("Ӣ�" + enrb.getString("info"));
		System.out.println("���" + frrb.getString("info"));
		
	}
}
