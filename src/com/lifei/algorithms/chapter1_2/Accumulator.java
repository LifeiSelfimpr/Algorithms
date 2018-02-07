package com.lifei.algorithms.chapter1_2;

public class Accumulator {
	
	private double m;
	private double s;
	private int N;
	
	public void addDataValue(double x){
		N++;
		s = s+1.0*(N-1)/N*(x-m)*(x-m);
		m = m+(x-m)/N;
	}
}
