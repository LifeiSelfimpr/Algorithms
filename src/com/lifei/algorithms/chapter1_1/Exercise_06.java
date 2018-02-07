package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 题目：
 * 1.1.6下面这段程序会打印出什么?
	int f = 0;
       int g = 1;
       for (int i = 0; i <= 15; i++)
       {
          StdOut.println(f);
          f = f + g;
          g = f - g;
       }
 * @author LiFei
 *
 */
public class Exercise_06 {

	public static void main(String[] args) {
		int f = 0;
	       int g = 1;
	       for (int i = 0; i <= 15; i++)
	       {
	          StdOut.println(f);
	          f = f + g;
	          g = f - g;
	       }
	}

}
