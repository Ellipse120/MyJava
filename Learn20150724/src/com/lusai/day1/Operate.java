package com.lusai.day1;

public class Operate { // 本类调用具体的验证操作
	private String info[]; // 定义一个数组属性，用于接收全部输入参数

	public Operate(String info[]) {
		this.info = info; // 通过构造方法取的全部的输入参数
	}

	public String login() {
		Check check = new Check();
		this.isExit();

		String name = this.info[0];
		String password = this.info[1];
		String str = null;
		if (check.validate(name, password)) {
			str = "Welcome" + name + "Thanks!";
		} else {
			str = "Wrong name and password!";
		}
		return str;
	}

	public void isExit() {
		if (this.info.length != 2) {
			System.out.println("Wrong input,System will exit.");
			System.out.println("Format: java LoginDemo name password");
			System.exit(1);
		}
	}
}
