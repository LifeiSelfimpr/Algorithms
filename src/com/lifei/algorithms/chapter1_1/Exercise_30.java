package com.lifei.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.30 数组练习。编写一段程序，创建一个 N×N 的布尔数组 a[][]。
  		其中当 i 和 j 互质时(没有相同 因子)，a[i][j] 为 true，否则为 false。
  		euclid:欧几里得
 * @author LiFei
 *
 */
public class Exercise_30 {

	public static void main(String[] args) {
		System.out.print("请输入要创建的数组N为：");
		int n = StdIn.readInt();
		boolean[][] a = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ( euclid(i, j) == 1);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 第一种写法：欧几里得
	 * @param p 第一个元素
	 * @param q 第二个元素
	 * @return 公约数
	 */
	public static int euclid(int p, int q) {
		if (p == 0 || q == 0) {
			return 1;
		}
		if (p < q) {
			int t = p;
			p = q;
			q = t;
		}
		if (p % q == 0) {
			return q;
		} else {
			return euclid(q, p % q);
		}
	}

}
