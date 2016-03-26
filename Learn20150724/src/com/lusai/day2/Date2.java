package com.lusai.day2;

import java.text.DateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		DateFormat df1 = null;
		DateFormat df2 = null;
		df1 = DateFormat.getDateInstance();
		df2 = DateFormat.getDateTimeInstance();
		System.out.println("DATE: " + df1.format(new Date()));
		System.out.println("DATE: " + df2.format(new Date()));
		
}
}
