package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.21 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 	然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数 的结果，精确到小数点后三位。
 	可以用这种程序将棒球球手的击球命中率或者学生的考试分数 制成表格。
 * @author LiFei
 *
 */
public class Exercise_21 {

	public static void main(String[] args) {
		
		System.out.print("请输入个数：");
		int n = StdIn.readInt();
		String[] nameArray = new String[n];
		int[] intArray1 = new int[n];
		int[] intArray2 = new int[n];
		for (int i = 0; i < n; i++) {
			nameArray[i] = StdIn.readString();
			intArray1[i] = StdIn.readInt();
			intArray2[i] = StdIn.readInt();
		}
		System.out.println("┌------┬------┬------┬--------┐");
		for (int i = 0; i < n; i++) {
			System.out.printf("|%6s|%6d|%6d|%6.3f|\n", nameArray[i], intArray1[i], intArray2[i],
					(float) intArray1[i] / intArray2[i]);
			if (i != n - 1) {
				System.out.println("├------┼------┼------┼--------┤");
			}
		}
		System.out.println("└------┴------┴------┴-------┘");
	}
}
