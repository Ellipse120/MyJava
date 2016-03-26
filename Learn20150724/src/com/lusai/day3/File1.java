package com.lusai.day3;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author lusai
 * 2015年10月6日
 * 下午2:13:35
 */
public class File1 {
	public static void main(String[] args) {
		String path = "d:" + File.separator + "test.txt";
		System.out.println(File.separatorChar +" "+ File.separator);
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.exists()){
		f.delete();
		}
		File f1 = new File("E:" + File.separator);
		File[] files = f1.listFiles();
		for(int i = 0 ; i < files.length; i ++){
			System.out.println(files[i]);
		}
	}
}
