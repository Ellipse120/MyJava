package com.lusai.day3;

import java.io.IOException;

public class Runtime1 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();//ͨ��Runtime��ľ�̬����Ϊ�����ʵ��������
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
