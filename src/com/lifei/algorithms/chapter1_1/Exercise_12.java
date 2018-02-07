package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.12 以下代码段会打印出什么结果?
 	int[] a = new int[10];
    for (int i = 0; i < 10; i++)
        a[i] = 9 - i;
    for (int i = 0; i < 10; i++)
        a[i] = a[a[i]];
    for (int i = 0; i < 10; i++)
        System.out.println(a[i]);
	网上看到的电子书的最后一句都有误，是        
	System.out.println(i);
	应该是System.out.println(a[i]);所以这里改掉了
 * @author LiFei
 *
 */
public class Exercise_12 {

	public static void main(String[] args) {
		int[] a = new int[10];
	    for (int i = 0; i < 10; i++)
	        a[i] = 9 - i;
	    for (int i = 0; i < 10; i++)
	        a[i] = a[a[i]];
	    for (int i = 0; i < 10; i++)
	        System.out.println(a[i]);
		
	}

}
