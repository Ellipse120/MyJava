package com.lusai.day2;

public class LinkDemo {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("=========ɾ��֮ǰ=========");
		l.printNode();
		l.deleteNode("C");
		l.deleteNode("D");
		System.out.println();
		System.out.println("========ɾ��֮��==========");
		l.printNode();
		System.out.println();
		System.out.println("��ѯ�ڵ㣺 " + l.contains("A"));

	}
}
