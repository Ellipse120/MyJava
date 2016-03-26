package com.lusai.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 
 * @author lusai
 * 2015年10月6日
 * 下午3:14:09
 */
public class InputStream1 {
	public static void main(String[] args) throws Exception {
		//
		File f = new File("d:" + File.separator + "test.txt");
		InputStream input = new FileInputStream(f);
		byte b[] = new byte[(int) f.length()];
		for(int i = 0 ; i < b.length; i ++){
			b[i] = (byte) input.read();
		}
		input.close();
		System.out.println("内容为：" + new String(b));
	}
}
