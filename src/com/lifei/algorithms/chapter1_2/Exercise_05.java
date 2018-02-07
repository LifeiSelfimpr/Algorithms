package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * 题目：
 * 1.2.5以下这段代码会打印出什么？
	String s = "Hello World";
		s.toUpperCase();
		s.substring(6, 11);
		StdOut.println(s);
 * @author LiFei
 *
 */
public class Exercise_05 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		s.toUpperCase();
		s.substring(6, 11);
		StdOut.println(s);//Hello World
						  //这个是因为 不能在s上直接修改，改后，需要重新赋值，才能生效
		s = s.toUpperCase();
		StdOut.println("第二个s是："+s);//HELLO WORLD
		s = s.substring(6, 11);
		StdOut.println("第三个s是："+s);//WORLD
		
	}

}
