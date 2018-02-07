package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.17 找出以下递归函数的问题:
 	public static String exR2(int n) {
    	String s = exR2(n - 3) + n + exR2(n - 2) + n;
    	if (n <= 0)
        	return "";
    	return s;
	}
	解答：
		这段代码中的基础情况永远不会被访问。
		调用 exR2(3) 会产生调用 exR2(0)、exR2(-3) 和exR2(-6)，循环往复直到发生 StackOverflowError。
 * @author LiFei
 *
 */
public class Exercise_17 {

	public static void main(String[] args) {
		String str = exR2(3);
		System.out.println(str);
		
	}
	
	public static String exR2(int n) {
	    String s = exR2(n - 3) + n + exR2(n - 2) + n;
	    if (n <= 0)
	        return "";
	    return s;
	}
	
}
