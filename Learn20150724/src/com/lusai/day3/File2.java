package com.lusai.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 
 * @author lusai
 * 2015年10月6日
 * 下午2:48:54
 */
public class File2 {
	public static void main(String[] args) throws Exception {	//异常抛出,不处理
		//第一步：使用File类找到一个文件
		File f = new File("d:" + File.separator + "test.txt");	//声明File对象
		//第二步：通过子类实例化父类对象
		OutputStream out = null; 	//准备好一个输出的对象
		out = new FileOutputStream(f,true);	//通过对象多态性,进行实例化
		//第三步：进行写操作
		String str = "\r\n Hello World";	//准备一个字符串
		byte b[] = str.getBytes();	//只能输出byte数组,所以将字符串变为byte数组
		
		out.write(b);	//将内容输出,保存文件
		//第四步：关闭输出流
		out.close();
		
	}
}
