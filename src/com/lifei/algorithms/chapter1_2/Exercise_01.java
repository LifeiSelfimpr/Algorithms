package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.2.11 编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形内生成N个随机点，然后计算两点之间的最近距离
 * @author LiFei
 *
 */
public class Exercise_01 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数N：");
		String n = StdIn.readInt()+"";
		int N = Integer.parseInt(n);
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N; i++) {
			points[i] = new Point2D(Math.random(), Math.random());
			points[i].draw();
		}
		if (N > 1) {
			double min = points[0].distanceTo(points[1]);
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (points[i].distanceTo(points[j]) < min) {
						min = points[i].distanceTo(points[j]);
					}
				}
			}
			System.out.println("Min distance: " + min);
		}
		
	}

}
