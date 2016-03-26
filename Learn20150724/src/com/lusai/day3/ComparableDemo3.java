package com.lusai.day3;

public class ComparableDemo3 {
public static void main(String[] args) {
	BinaryTree bt = new BinaryTree();
	bt.add(8);
	bt.add(3);
	bt.add(3);
	bt.add(10);
	bt.add(9);
	bt.add(1);
	bt.add(5);
	bt.add(5);
	System.out.println("After sorted: ");
	bt.print();
}
}
