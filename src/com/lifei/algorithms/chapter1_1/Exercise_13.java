package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置(交换行和列)。
 * @author LiFei
 *
 */
public class Exercise_13 {

	public static void main(String[] args) {
		/*
		   0 1             0 1 2 
		 0 1 2   ---->   0 1 3 5
		 1 3 4           1 2 4 6
		 2 5 6
		 
		 arr[i][j]  arr[j][i]
		 */
		int[][] arr = {{1,2},{3,4},{5,6}};
		System.out.println("行列转换后的数组：");
		transposedMatrix(arr);		
	}
	
	private static void transposedMatrix(int[][] arr) {
		int n = arr[0].length;//行数
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%4d",arr[j][i]);
			}
			System.out.println();
		}
		
	}

}
