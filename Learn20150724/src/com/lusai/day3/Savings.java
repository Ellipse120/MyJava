package com.lusai.day3;

import java.util.Scanner;//����Scanner��

public class Savings {
	public static void main(String[] args) {
		double benjin;// ����
		System.out.println("�����뱾��");
		Scanner input = new Scanner(System.in);// System��in��ʾ����
		benjin = input.nextInt();// nextInt()��ȡ�Ӽ��������һ������ ��������num����
		System.out.println("����Ϊ��" + benjin);
		/* �ֱ�����һ�� ���� ���� �������� */
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
		// �ֱ����һ�� ���� ���� ���걾Ϣ�ͣ���Ϣ��=����*����+����
		double yinianbenxi = benjin * yinian + benjin;
		double ernianbenxi = benjin * ernian * 2 + benjin;
		double sannianbenxi = benjin * sannian * 3 + benjin;
		double wunianbenxi = benjin * sinian * 5 + benjin;
		// ���
		System.out.println("���һ���ı�Ϣ�ǣ�" + yinianbenxi);
		System.out.println("�������ı�Ϣ�ǣ�" + ernianbenxi);
		System.out.println("��������ı�Ϣ�ǣ�" + sannianbenxi);
		System.out.println("��������ı�Ϣ�ǣ�" + wunianbenxi);
		input.close();
	}

}
