package com.lusai.day1;

public class PersonCloneDemo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		PersonClone p1 = new PersonClone("����");
		
		PersonClone p2 = new PersonClone("James");
		
		p2.setName("Wade")	;
		
		System.out.println("ԭʼ����" + p1);
		
		System.out.println("��¡֮��Ķ���	" + p2);
		
		System.out.println(p1.clone() != p1);
		
		System.out.println(p1.equals(p1));

		System.out.println(p1.clone().getClass() == p1.getClass());
		
		System.out.println(p1.clone().equals(p1));
		
	}
	
}
