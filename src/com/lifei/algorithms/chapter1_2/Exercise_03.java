package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 题目：
 * 1.2.3 编写一个Interval2D的用例，从命令行接受参数N、min和max。生成N个随机的2D间隔，其宽度和高均匀地分布在单位正方形中的min和max之间。
 * 		用StdDraw画出它们并打印出相交的间隔对的数量以及有包含关系的间隔对数量。
 * @author LiFei
 *
 */
public class Exercise_03 {

	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		double min = Double.parseDouble(args[1]);
		double max = Double.parseDouble(args[2]);
		StdDraw.setXscale(min, max);
		StdDraw.setYscale(min, max);
		Point2D[] leftTopPoints = new Point2D[N];
		Point2D[] rightBottomPoints = new Point2D[N];
		Interval2D[] intervals = new Interval2D[N];
		for (int i = 0; i < N; i++) {
			double a = StdRandom.uniform(min, max);
			double b = StdRandom.uniform(min, max);
			double left, right, top, bottom;
			Interval1D x, y;
			if (a < b) {
				left = a;
				right = b;
			} else {
				left = b;
				right = a;
			}
			x = new Interval1D(left, right);
			a = StdRandom.uniform(min, max);
			b = StdRandom.uniform(min, max);
			if (a < b) {
				top = a;
				bottom = b;
			} else {
				top = b;
				bottom = a;
			}
			y = new Interval1D(top, bottom);
			leftTopPoints[i] = new Point2D(left, top);
			rightBottomPoints[i] = new Point2D(right, bottom);
			intervals[i] = new Interval2D(x, y);
			intervals[i].draw();
		}
		int containNum = 0, intervalNum = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N; j++) {
				if (j > i && intervals[i].intersects(intervals[j])) {
					intervalNum++;
				}
				if (j != i && intervals[i].contains(leftTopPoints[j]) && intervals[i].contains(rightBottomPoints[j])) {
					containNum++;
				}
			}
		}
		System.out.println("Interval count: " + intervalNum);
		System.out.println("Contain count: " + containNum);
	}
		
}
