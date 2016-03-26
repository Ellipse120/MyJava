package com.lusai.day2;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date1 {
	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
		System.out.println(ca.getTimeZone());
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.DAY_OF_WEEK));
		
	}
}
