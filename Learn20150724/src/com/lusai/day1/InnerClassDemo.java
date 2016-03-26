package com.lusai.day1;

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();	//实例化外部对象
		Outer.Inner in = out.new Inner();//实例化内部对象
		in.print();		//调用内部类方法
	}
}
