package com.lusai.day1;

public class Node {
	private String data;	//保存节点内容
	private Node next;	//保存下一个节点
	
	public Node(String data){	//构造方法设置节点内容
		this.data = data;
	}
	public String getData(){	//得到节点内容
		return this.data;
	}
	public void setNext(Node next){		//设置下一个节点
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	
}
