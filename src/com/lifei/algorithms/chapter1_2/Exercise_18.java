package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 题目：
 * 1.1.2给出以下表达式的值:
	a.( 0 + 15 ) / 2
 * @author LiFei
 *
 */
public class Exercise_18 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数：");
		int T = StdIn.readInt();
		Accumulator a = new Accumulator();
		for (int t = 0; t < T; t++) {
			a.addDataValue(StdRandom.uniform());
		}
		StdOut.println(a);
		
	}

}
