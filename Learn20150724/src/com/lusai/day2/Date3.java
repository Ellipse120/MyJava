package com.lusai.day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
public static void main(String[] args) throws Exception {
	
	String strDate = "2015-09-13 20:11:30.345";//��������ʱ��
	String pat = "yyyy-MM-dd HH:mm:ss.SSS";//����ģ��
	SimpleDateFormat sdf = new SimpleDateFormat(pat);
	Date d = sdf.parse(strDate);
	System.out.println(d);
}
}
