package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.5编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true，否则打印 false
 * @author LiFei
 *
 */
public class Exercise_05 {

	public static void main(String[] args) {
		System.out.println("请输入两个double变量");
		System.out.println("请输入第一个double变量");
		double a = StdIn.readDouble();
		System.out.println("请输入第二个double变量");
		double b = StdIn.readDouble();
		if (a > 0 && a < 1 && b > 0 && b < 1) {
			System.out.println("结果是：true");
		}else {
			System.out.println("结果是：false");
		}
		
		
	}

}
