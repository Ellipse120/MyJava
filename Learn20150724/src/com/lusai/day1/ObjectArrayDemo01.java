package com.lusai.day1;

public class ObjectArrayDemo01 {
	
	public static void main(String[] args) {
		Person per[] = new Person[3];//����һ�������������3������
		//��ʼ����������֮ǰ��ÿһ��Ԫ�ض���Ĭ��ֵ
		System.out.println("=======��������=======");
		for(int x = 0; x < per.length; x++){
			System.out.println(per[x] + "��");//ѭ�����
		}
		//�ֱ�Ϊ�����е�ÿ��Ԫ�س�ʼ����ÿһ�����Ƕ��󣬶���Ҫ����ʵ����
		per[0] = new Person("����");
		per[1] = new Person("James");
		per[2] = new Person("Wade");
		System.out.println("\n=====================");
		for(int x = 0; x < per.length;x ++){
			System.out.println(per[x].getName() + "��");
		}
		
	}
	
}
