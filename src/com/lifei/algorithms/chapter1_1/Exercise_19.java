package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 题目：
 * 1.1.19在计算机上运行以下程序:
 * public class Fibonacci {
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}

 * @author LiFei
 *
 */
public class Exercise_19 {

	public static void main(String[] args) {
		for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
	}
	
	public static long F(int N) {
	    if (N == 0)
	         return 0;
	    if (N == 1)
	         return 1;
	    return F(N - 1) + F(N - 2);
	}

}
