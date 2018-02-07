package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目： 1.1.9编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。 
 * 解答:Java 有一个内置方法Integer.toBinaryString(N) 专门完成这个任务，但该题的目的就是给出这个方法的其他实现方法。
 * 下面就是一个特别简洁的答案:
 	String s = "";
       for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
 * @author LiFei
 *
 */
public class Exercise_09 {

	public static void main(String[] args) {
		
		System.out.println("请输入一个整数：");
		int n = StdIn.readInt();
		String s = toBinaryString(n);
		System.out.println(n+" 的二进制表示是 "+s);
	}
	
	/**
	 * 将整数n转为二进制表示
	 * @param n 整数
	 * @return 二进制字符串
	 */
	private static String toBinaryString(int n) {
		String s = "";
		if (n == 0) {
			s = "0";
		}else{
			while (n > 0) {
				s = (n % 2) + s;
				n = n/2;
			}
		}
		return s;
	}

}
