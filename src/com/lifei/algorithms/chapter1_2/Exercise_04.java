package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * 题目：
 * 1.2.4 以下这段代码会打印出什么？
	String string1 = "hello";
	String string2 = string1;
	string1 = "world";
	StdOut.println(string1);
	StdOut.println(string2);
 * @author LiFei
 *
 */
public class Exercise_04 {

	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = string1;//这边会报错：java.lang.Error: Unresolved compilation problems
								//因为string是一个对象，有了一个内存指针地址，string2是又被new了一个新的内存地址
								//这两个是不一样的，所以，给了同一个会报错！
		string1 = "world";
		StdOut.println(string1);
		StdOut.println(string2);
		
	}

}
