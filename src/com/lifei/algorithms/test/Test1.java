package com.lifei.algorithms.test;

import java.util.Arrays;

import org.junit.Test;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 测试类
 * @author LiFei
 *
 */
public class Test1 {
	
	@Test
	public void test1(){
		int N = 100;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N);
		StdDraw.setPenRadius(0.01);
		for (int i = 0; i <= N; i++) {
			StdDraw.point(i, i);//直斜线
			StdDraw.point(i, i*i);//第一条线
			StdDraw.point(i, i*Math.log(i));//中间那条线
		}
	}
	
	@Test
	public void test2(){
		int N = 50;
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdRandom.random();
		}
		for (int i = 0; i < N; i++) {
			double x = 1.0*i/N;
			double y = a[i]*2.0;
			double rw = 0.5/N;
			double rh = a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}

}
