package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.18 请看以下递归函数:
	public static int mystery(int a, int b) {
   		if (b == 0)     return 0;
   		if (b % 2 == 0) return mystery(a+a, b/2);
   		return mystery(a+a, b/2) + a;
	}

	mystery(2, 25) 和 mystery(3, 11) 的返回值是多少?
	给定正整数 a 和 b，mystery(a,b)计算的结果是什么?将代码中的 + 替换为 * 并将 return 0 改为 return 1，
	然后回答相同的问题。
 * @author LiFei
 *
 */
public class Exercise_18 {

	public static void main(String[] args) {
		int i1 = mystery(2, 25);
		int i2 = mystery(3, 11);
		System.out.println(i1);//50
		System.out.println(i2);//33
		
		int i3 = mystery2(2, 25);
		int i4 = mystery2(3, 11);
		System.out.println(i3);//50
		System.out.println(i4);//48
		
	}
	
	public static int mystery(int a, int b) {
   		if (b == 0) 
   			return 0;
   		if (b % 2 == 0) 
   			return mystery(a+a, b/2);
   		
   		return mystery(a+a, b/2) + a;
	}
	
	public static int mystery2(int a, int b) {
   		if (b == 0) 
   			return 1;
   		if (b % 2 == 0) 
   			return mystery(a*a, b/2);
   		
   		return mystery(a*a, b/2) + a;
	}

}
