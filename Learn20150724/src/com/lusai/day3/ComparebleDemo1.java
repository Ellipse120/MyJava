package com.lusai.day3;

public class ComparebleDemo1 {
	public static void main(String[] args) {
		Student stu[] = { new Student("James", 29, 88.0),
				new Student("Wade", 31, 88.0), new Student("Durant", 28, 77.0),
				new Student("Bosh", 31, 88.0), new Student("Kobe", 38, 166.0) };
		java.util.Arrays.sort(stu);
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);

		}
	}
}
