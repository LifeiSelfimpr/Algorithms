package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.16 给出 exR1(6) 的返回值:
 * @author LiFei
 *
 */
public class Exercise_16 {

	public static void main(String[] args) {
		String str = exR1(6);
		System.out.println("exR1(6)的返回值是: "+str);
	}

	private static String exR1(int n) {
		if (n <= 0) {
			return "";
		}
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
	

}
