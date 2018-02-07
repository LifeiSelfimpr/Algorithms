package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * 题目： 1.2.15 文件输入。基于String的split()方法实现In中的静态方法readInts().
 * 		解析：
 * 			1.输入一个文本地址
 * 			2.这个文本只能是含有整数，不能包含英文、小数等
 * 		eg.test.txt:
 * 			12
 * 			32
 * 			90
 * 		结果显示：
 * 			12
 * 			32
 * 			90
 * @author LiFei
 *
 */
public class Exercise_15 {
	public static void main(String[] args) {
		System.out.print("请输入整数文本的路径：");
		//  F:\\test.txt
		String name = StdIn.readLine();
		int[] ints = readInts(name);
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		
	}
	
	/**
	 * 读取文件，访问整数数组
	 * @param name 文件路径
	 * @return 文件内整数数组
	 */
	public static int[] readInts(String name){
		In in = new In(name);
		String input = in.readAll();
		String[] words = input.split("\\s+");
		int[] ints = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			ints[i] = Integer.parseInt(words[i]);
		}
		return ints;
	}
}
