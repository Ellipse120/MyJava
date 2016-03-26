/**
 * 
 */
package com.lusai.day1;

/**
 * @author lusai
 *
 *实例018	输出错误信息与调试信息
 */
public class PrintErrorAndDebug {

	public static void main(String[] args){
		
		System.out.println("main()方法开始运行。");
		
		System.err.println("在运行期间手动输出一个错误信息：");
		System.err.println("\t 该软件没有买保险，");
		System.out.println("PrintErrorAndDebug.main()");
		System.out.println("main()方法运行结束。");
	}
	
}
