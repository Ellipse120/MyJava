package com.lusai.day3;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int temp[] = {3,5,7,9,1,2,6,8};
		
		Arrays.sort(temp);
		
		System.out.print("After sort:");
		
		System.out.println(Arrays.toString(temp));
		
		int point = Arrays.binarySearch(temp, 3);//检索数据位置
		
		System.out.println("Element 3 's location: " + point);
		
		Arrays.fill(temp, 3);	//填充数组
		
		System.out.print("After fill: "	);
		
		System.out.println(Arrays.toString(temp));
		
	}
	
}
