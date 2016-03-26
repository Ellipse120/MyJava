package com.lusai.day3;

public class BinaryTree {
	
	class Node{
		
		private Comparable data;
		private Node left;
		private Node right;
		
		public void addNode(Node newNode){
			//decide left of right.
			if(newNode.data.compareTo(this.data) < 0){
				if(this.left == null){
					this.left = newNode;
				}else{
					this.left.addNode(newNode);
				}
			}
			if(newNode.data.compareTo(this.data) >= 0){
				if(this.right == null){
					this.right = newNode;
				}else{
					this.right.addNode(newNode);
				}
			}
		}
		
		public void printNode(){
			if(this.left != null){
				this.left.printNode();
			}
			System.out.print(this.data + "\t");
			if(this.right != null){
				this.right.printNode();
			}
		}
	};
	
	private Node root;
	public void add(Comparable data){
		Node newNode = new Node();
		
		newNode.data = data;
		if(root == null){
			root = newNode;
		}else{
			root.addNode(newNode);
		}
	}
	public void print(){
		this.root.printNode();
	}
}
