package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.20 编写一个递归的静态方法计算 ln(N!) 的值。
 * @author LiFei
 *
 */
public class Exercise_20 {

	public static void main(String[] args) {
		
		double d = ln(2);
		System.out.println(d);
	}
	
	private static double ln(int N){
		if (N == 0) {
			return 0;
		} else {
			return Math.log(N) + ln(N - 1);
		}
	}

}
