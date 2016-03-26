package com.lusai.day1;

public class ObjectArrayDemo01 {
	
	public static void main(String[] args) {
		Person per[] = new Person[3];//声明一个对象数组包含3个对象
		//初始化对象数组之前，每一个元素都是默认值
		System.out.println("=======数组声明=======");
		for(int x = 0; x < per.length; x++){
			System.out.println(per[x] + "、");//循环输出
		}
		//分别为数组中的每个元素初始化，每一个都是对象，都需要单独实例化
		per[0] = new Person("张三");
		per[1] = new Person("James");
		per[2] = new Person("Wade");
		System.out.println("\n=====================");
		for(int x = 0; x < per.length;x ++){
			System.out.println(per[x].getName() + "、");
		}
		
	}
	
}
