package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdDraw;

public class VisualCounter {

	private int n;
	private int count;
	private int N;
	private int max;
	
	//初始化
	public VisualCounter(int n, int max) {
		N = n;
		this.max = max;
		this.n = 0;
		// X轴
		StdDraw.setXscale(0, N);
		// Y轴 上下对称
		StdDraw.setYscale(-max, max);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(.015);
		StdDraw.point(0, 0);
	}

	public int getCount() {
		return this.count;
	}
	
	public void increment() {
		if(n+1>N){
			System.out.println("(n+1):"+(n+1)+"--超出了X轴-->"+N);
			return;
		}
		if(count+1>max){
			System.out.println("(count+1):"+(count+1)+"--上限超出了Y轴-->"+max);
			return;
		}
		count++;
		n++;
		StdDraw.point(n, count);
		
	}

	public void decrement() {
		if(n+1>N){
			System.out.println("(n+1):"+(n+1)+"--超出了X轴-->"+N);
			return;
		}
		if(count-1<-max){
			System.out.println("(count-1):"+(count-1)+"--下限超出了Y轴-->"+(-max));
			return;
		}
		count--;
		n++;
		StdDraw.point(n, count);

	}

	public static void main(String[] args) {
		VisualCounter visualCounter = new VisualCounter(20, 5);
		for (int i = 0; i < 10; i++) {
			visualCounter.increment();
		}
		for (int i = 0; i < 15; i++) {
			visualCounter.decrement();
		}
		for (int i = 0; i < 10; i++) {
			visualCounter.increment();
		}
		
	}

}
