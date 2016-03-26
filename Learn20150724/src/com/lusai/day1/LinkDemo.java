package com.lusai.day1;

public class LinkDemo {
	public static void main(String[] args) {
		Node root = new Node("��ͷ");
		Node n1 = new Node("����-A");
		Node n2 = new Node("����-B");
		Node n3 = new Node("����-C");
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		printNode(root);
	}
	
	public static void printNode(Node node){
		System.out.println(node.getData() + "\t");
		if(node.getNext()!=null){
			printNode(node.getNext());
		}
	}
	
}
