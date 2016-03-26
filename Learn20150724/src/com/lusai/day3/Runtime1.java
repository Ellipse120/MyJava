package com.lusai.day3;

import java.io.IOException;

public class Runtime1 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();//通过Runtime类的静态方法为其进行实例化操作
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
		Process pro = null;
		try {
			pro = run.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro.destroy();
		
	}
}
