package com.lusai.day3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo1 {
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
		ps.print("hello ");
		ps.println("world!");
		ps.print("1 + 1 = " + 2);
		ps.close();
	}
}
