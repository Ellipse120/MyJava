package com.lusai.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 
 * @author lusai
 * 2015��10��6��
 * ����2:48:54
 */
public class File2 {
	public static void main(String[] args) throws Exception {	//�쳣�׳�,������
		//��һ����ʹ��File���ҵ�һ���ļ�
		File f = new File("d:" + File.separator + "test.txt");	//����File����
		//�ڶ�����ͨ������ʵ�����������
		OutputStream out = null; 	//׼����һ������Ķ���
		out = new FileOutputStream(f,true);	//ͨ�������̬��,����ʵ����
		//������������д����
		String str = "\r\n Hello World";	//׼��һ���ַ���
		byte b[] = str.getBytes();	//ֻ�����byte����,���Խ��ַ�����Ϊbyte����
		
		out.write(b);	//���������,�����ļ�
		//���Ĳ����ر������
		out.close();
		
	}
}
