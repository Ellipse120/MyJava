package com.lusai.day3;

public class StringBuffer1 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	String str = "lusai";
	sb.append(true);
	sb.append('c').append(" ").append(str).append(0).capacity();
	System.out.println(sb);
}
}
