package com.lusai.day1;

public class Node {
	private String data;	//����ڵ�����
	private Node next;	//������һ���ڵ�
	
	public Node(String data){	//���췽�����ýڵ�����
		this.data = data;
	}
	public String getData(){	//�õ��ڵ�����
		return this.data;
	}
	public void setNext(Node next){		//������һ���ڵ�
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	
}
