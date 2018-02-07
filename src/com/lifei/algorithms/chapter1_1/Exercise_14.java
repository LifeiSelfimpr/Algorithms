package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.14 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N 的最大整数。不要使用 Math 库。
 * @author LiFei
 *
 */
public class Exercise_14 {

	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		int n = StdIn.readInt();
		int m = lg(n);
		System.out.println(n+" 不大于log2N的最大整数是 "+m);
		
	}
	
	/**
	 * 不大于lg2N的最大整数
	 * @param N
	 * @return
	 */
	private static int lg(int N){
		int i,n;
		for (i = 0,n=1; n <= N ; i++) {
			n *= 2;
		}
		return i - 1;
		
	}
}
