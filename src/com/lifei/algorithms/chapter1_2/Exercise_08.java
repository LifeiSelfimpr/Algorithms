package com.lifei.algorithms.chapter1_2;

/**
 * 题目：
 * 1.2.8设 a[] 和 b[] 均为长数百万的整型数组。以下代码的作用是什么？有效吗？
	int[] t = a; a = b; b = t;
	解答：交换数组，是有效的，数组是个对象，其实交换的就是地址。
 * @author LiFei
 *
 */
public class Exercise_08 {

	public static void main(String[] args) {
		int a[] = {2,3,3,4};
		int b[] = {4,5,6,6};
		int[] t = a; 
		a = b; 
		b = t;
		
	}
}
