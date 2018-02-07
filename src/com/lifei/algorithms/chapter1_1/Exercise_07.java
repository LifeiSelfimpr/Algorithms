package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 题目：
 * 1.1.7分别给出以下代码段打印出的值:
	//a.
	double t = 9.0;
	while (Math.abs(t - 9.0/t) > .001)
    	t = (9.0/t + t) / 2.0;
	StdOut.printf("%.5f\n", t);//.5表示小数点后5位
	: 3.00009
	//b.
	int sum = 0;
	for (int i = 1; i < 1000; i++)
    	for (int j = 0; j < i; j++)
        sum++;
		StdOut.println(sum);
	: 499500
	//c. 
	int sum = 0;
	for (int i = 1; i < 1000; i *= 2)
   		for (int j = 0; j < 1000; j++)
        sum++;
		StdOut.println(sum);
	: 10000
 * @author LiFei
 *
 */
public class Exercise_07 {

	public static void main(String[] args) {
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
	    	t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);//.5表示小数点后5位
	}

}
