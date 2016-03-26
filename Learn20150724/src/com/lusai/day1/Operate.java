package com.lusai.day1;

public class Operate { // ������þ������֤����
	private String info[]; // ����һ���������ԣ����ڽ���ȫ���������

	public Operate(String info[]) {
		this.info = info; // ͨ�����췽��ȡ��ȫ�����������
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
