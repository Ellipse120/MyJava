package com.lusai.day1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 * 
 * @author lusai
 * ʵ��020	�ض��������ʵ�ֳ�����־
 *
 */
public class RedirectOutputStream {

	public static void main(String[] args) {
		
		try {
		
			PrintStream out = System.out;

			PrintStream ps = new PrintStream("./log.txt");

			System.setOut(ps);
			
			int age = 22;
			
			System.out.println("��������ɹ����壬��ʼֵΪ22");
			
			String sex = "Ů";
			
			System.out.println("�Ա�����ɹ����壬��ʼֵΪŮ");
			
			String info = "���Ǹ�" + sex + "���ӣ�Ӧ����" + age +"���ˡ�";
			
			System.out.println("������������Ϊinfo�ַ��������������ǣ�" + info );
			
			System.setOut(out);
			
			System.out.println("����������ϣ���鿴��־�ļ���");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
