package com.lusai.day3;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double salary;// ��������
		System.out.println("������������ʣ�");
		Scanner input = new Scanner(System.in);// syetem.in�������
		salary = input.nextDouble();// nextInt()��ȡ�Ӽ��������һ������
		System.out.println("��Ա���Ĺ���ϸĿΪ��");
		System.out.println("��������Ϊ��" + salary);
		double wujia;// ��۽���
		wujia = 0.4 * salary;// ��۽���Ϊ�������ʵ�40%
		System.out.println(40 / 100);
		System.out.println("��۽���Ϊ��" + wujia);
		double fangzu;// �������
		fangzu = 0.25 * salary;// �������Ϊ�������ʵ�25%
		System.out.println("�������Ϊ:" + fangzu);
		double zong;// �ܹ���
		zong = (salary + wujia + fangzu);// ������ֵ���
		System.out.println("Ա��нˮ�ǣ�" + zong);
		input.close();
	}

}
