package com.lusai.day3;

import java.util.Scanner;//导入Scanner类

public class Savings {
	public static void main(String[] args) {
		double benjin;// 本金
		System.out.println("请输入本金");
		Scanner input = new Scanner(System.in);// System。in表示键盘
		benjin = input.nextInt();// nextInt()获取从键盘输入的一个整数 并交付给num变量
		System.out.println("本金为：" + benjin);
		/* 分别输入一年 两年 三年 五年利率 */
		double yinian = 2.25 / 100;
		double ernian = 2.70 / 100;
		double sannian = 3.24 / 100;
		double sinian = 3.60 / 100;
		System.out.println(2.25/100);
		System.out.println(2/10);
		System.out.println(2.5/0.5);
		System.out.println(13/2);
		System.out.println(13.0/2);
		System.out.println((double)(13/2));
		// 分别计算一年 两年 三年 五年本息和（本息和=利率*年数+本金）
		double yinianbenxi = benjin * yinian + benjin;
		double ernianbenxi = benjin * ernian * 2 + benjin;
		double sannianbenxi = benjin * sannian * 3 + benjin;
		double wunianbenxi = benjin * sinian * 5 + benjin;
		// 输出
		System.out.println("存款一年后的本息是：" + yinianbenxi);
		System.out.println("存款二年后的本息是：" + ernianbenxi);
		System.out.println("存款三年后的本息是：" + sannianbenxi);
		System.out.println("存款五年后的本息是：" + wunianbenxi);
		input.close();
	}

}
