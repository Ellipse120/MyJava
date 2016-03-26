package com.lusai.day1;

class Outer {
	private String info = "Hello world!!";
	class Inner {
		public void print(){
			System.out.println(info);
		}
	};
};
