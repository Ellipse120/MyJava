package com.lusai.day3;

import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		String str = "123a4567";
		if (Pattern.compile("[0-9]+").matcher(str).matches()) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}
}
