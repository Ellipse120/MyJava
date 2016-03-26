package com.lusai.day2;

public class GenericsPoint {
public static void main(String[] args) {
	Point<Integer> p = new Point<Integer>();
	p.setX(19);
	p.setY(22);
	int x = p.getX();
	int y = p.getY();
	String s = p.getClass().getName();
	System.out.println("Integer x-axis: " + x );
	System.out.println("Integer y-axis: " + y );
	System.out.println(s);
	System.out.println(p.getClass());
	
}
}
