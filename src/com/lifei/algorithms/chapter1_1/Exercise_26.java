package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.26 将三个数字排序。假设 a、b、c 和 t 都是同一种原始数字类型的变量。证明以下代码能够将 a、 b、c 按照升序排列:
		if (a > b) { t = a; a = b; b = t; }
		if (a > c) { t = a; a = c; c = t; }
		if (b > c) { t = b; b = c; c = t; }

 * @author LiFei
 *
 */
public class Exercise_26 {

	public static void main(String[] args) {
		
//		if (a > b) { t = a; a = b; b = t; }
//		这样做的目的是：交换a/b的值，确保a是a/b中最小的值:a<b
//		if (a > c) { t = a; a = c; c = t; }
//		这样做的目的是：交换a/c的值，确保a是a/c中最小的值:a<c
//		if (b > c) { t = b; b = c; c = t; }
//		这样做的目的是：交换b/c的值，确保b是b/c中最小的值:b<c
//		所以： a < b < c. a就是这个最小的值
	}

}
