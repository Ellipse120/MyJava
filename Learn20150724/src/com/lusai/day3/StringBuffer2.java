package com.lusai.day3;

public class StringBuffer2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.print("The primitive string is: ");
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.insert(0, "ssss"));
		sb.reverse().toString();
		System.out.println(sb);
		sb.reverse().toString();
		System.out.println(sb);
		sb.replace(0, 2, "lusai");
		System.out.println(sb);
		for(int i = 0; i < 20 ; i++){
			sb.append(i);
		}
		System.out.println(sb);
	}
}
