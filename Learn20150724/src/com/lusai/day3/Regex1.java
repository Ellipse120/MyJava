package com.lusai.day3;

public class Regex1 {
	public static void main(String[] args) {
		String str = "12a33455";
		boolean flag = true;
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] < '0' || c[i] > '9') {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}
}
