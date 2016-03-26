package com.lusai.day2;
//13-23+33-43+...+993-1003;
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 13;i <= 53; i ++) {
			sum = sum + i;
			i += 10;
			i = -i;
		}
		System.out.println(sum);
	}
}


