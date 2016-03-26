package com.lusai.day1;

public class Check {
	public boolean validate(String name, String password) {
		// 执行具体的验证操作
		if (name.equals("lusai") && password.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}
