package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Date {
	private final int month;
	private final int day;
	private final int year;

	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	/**
	 * Exercise 1.2.13
	 * @param String的date:11/21/2017
	 */
	public Date(String date) {
		String[] fields = date.split("/");
		month = Integer.parseInt(fields[0]);
		day = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	public int year() {
		return year;
	}

	@Override
	public String toString() {
		return month() + "/" + day() + "/" + year();
	}
	
	//必须要复写，通过值的比较，而不是对象的比较
	@Override
	public boolean equals(Object x) {
		if (this == x) {
			return true;
		}
		if (x == null) {
			return false;
		}
		if (this.getClass() != x.getClass()) {
			return false;
		}
		Date that = (Date) x;
		if (this.day != that.day) {
			return false;
		}
		if (this.month != that.month) {
			return false;
		}
		if (this.year != that.year) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("请输入年：");
		int m = StdIn.readInt();
		System.out.println("请输入月：");
		int d = StdIn.readInt();
		System.out.println("请输入日：");
		int y = StdIn.readInt();
		Date date = new Date(m, d, y);
		StdOut.println("日期是："+date);
	}
}
