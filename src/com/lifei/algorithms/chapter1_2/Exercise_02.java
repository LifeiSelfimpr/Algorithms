package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.2.2 编写一个Interval1D的用例,从命令行接受一个整数N.
 * 		从标准输入中读取N个间隔(每个间隔由一对double值定义)并打印出所有相交的间隔对。
 * @author LiFei
 *
 */
public class Exercise_02 {

	public static void main(String[] args) {
		System.out.println("请输入一个整数N：");
		int n = StdIn.readInt();
		int N = Integer.parseInt(n+"");
		Interval1D[] intervals = new Interval1D[N];
		for (int i = 0; i < N; i++) {
			intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
		}
		if (N > 2) {
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					// intersects 这个是Interval1D类实现了的相交或者交叉的方法
					if (intervals[i].intersects(intervals[j])) {
						System.out.println(intervals[i] + " intersects " + intervals[j]);
					}
				}
			}
		}
	}

}
