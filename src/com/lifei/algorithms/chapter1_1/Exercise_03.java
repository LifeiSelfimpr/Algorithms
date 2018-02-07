package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.3编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
 * @author LiFei
 *
 */
public class Exercise_03 {

	public static void main(String[] args) {
		
		System.out.println("请输入三个整数：");
		System.out.println("请输入第一个整数：");
		int i1 = StdIn.readInt();
		System.out.println("请输入第二个整数：");
		int i2 = StdIn.readInt();
		System.out.println("请输入第三个整数：");
		int i3 = StdIn.readInt();
		if (i1 == i2 && i2 == i3) {
			System.out.println("结果是：equal");
		} else {
			System.out.println("结果是：not equal");
		}
		
	}

}
