package com.lusai.day1;

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();	//ʵ�����ⲿ����
		Outer.Inner in = out.new Inner();//ʵ�����ڲ�����
		in.print();		//�����ڲ��෽��
	}
}
