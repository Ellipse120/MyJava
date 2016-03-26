package com.lusai.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	public static void main(String[] args) {
//		String str = "2015-10-06";
//		String pat = "\\d{4}-\\d{2}-\\d{2}";	//定义验证规则
//		Pattern p =Pattern.compile(pat);		//实例化Pattern类
//		Matcher m = p.matcher(str);				//验证字符串内容是否合法
//		if(m.matches()){
//			System.out.println("Legal!");
//		}else{
//			System.out.println("Illegal!");
//		}
		
//		String str = "A1B22C333D4444E55555";
//		String pat = "\\d+";
//		Pattern p = Pattern.compile(pat);
//		String[] s = p.split(str);
//		for(int x = 0; x < s.length; x++){
//			System.out.print(s[x] + "\t");
//		}
		
		
		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		String newString = m.replaceAll("_");
		System.out.println(newString);
		
	}
}
