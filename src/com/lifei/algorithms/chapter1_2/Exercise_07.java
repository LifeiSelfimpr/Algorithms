package com.lifei.algorithms.chapter1_2;

/**
 * 题目：
 * 1.以下递归函数的返回值是什么？

	public static String mystery(String s)
	{
    	int N = s.length();
    	if (N <= 1) return s;
    	String a = s.substring(0, N/2);
    	String b = s.substring(N/2, N);
    	return mystery(b) + mystery(a);
	}
	用途：递归交换字符顺序，最后返回反序的字符串。

 * @author LiFei
 *
 */
public class Exercise_07 {

	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println(mystery(str));
	}
	
	public static String mystery(String s)
	{
    	int N = s.length();
    	if (N <= 1) return s;
    	String a = s.substring(0, N/2);
    	String b = s.substring(N/2, N);
    	return mystery(b) + mystery(a);
	}

}
