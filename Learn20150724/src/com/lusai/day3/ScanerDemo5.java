package com.lusai.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanerDemo5 {
	public static void main(String[] args) {
		
		File f = new File("D:" + File.separator + "test.txt");
		
		Scanner scan = null ;
		try{
			scan = new Scanner(f);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		StringBuffer str = new StringBuffer();
		while(scan.hasNext()){
			str.append(scan.next()).append("\n");
		}
		System.out.println(str);
		System.out.println(" CODE: " + System.getProperty("File.endcoding"));
	}
}
