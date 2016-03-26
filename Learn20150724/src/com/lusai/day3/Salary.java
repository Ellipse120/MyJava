package com.lusai.day3;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double salary;// 基本工资
		System.out.println("请输入基本工资：");
		Scanner input = new Scanner(System.in);// syetem.in代表键盘
		salary = input.nextDouble();// nextInt()获取从键盘输入的一个整数
		System.out.println("该员工的工资细目为：");
		System.out.println("基本工资为：" + salary);
		double wujia;// 物价津贴
		wujia = 0.4 * salary;// 物价津贴为基本工资的40%
		System.out.println(40 / 100);
		System.out.println("物价津贴为：" + wujia);
		double fangzu;// 房租津贴
		fangzu = 0.25 * salary;// 房租津贴为基本工资的25%
		System.out.println("房租津贴为:" + fangzu);
		double zong;// 总工资
		zong = (salary + wujia + fangzu);// 三个数值相加
		System.out.println("员工薪水是；" + zong);
		input.close();
	}

}
