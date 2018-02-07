package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号。
 	eg.
 		 012
		0* *
		1 * 
		2** 
 * @author LiFei
 *
 */
public class Exercise_11 {

	public static void main(String[] args) {
		boolean[][] arr = { { true, false, true }, { false, true, false },{ true, true, false } };
		printBooleanMatrix(arr);
	}
	
	/**
	 * 打印二维数组
	 * @param a 二维数组
	 */
	private static void printBooleanMatrix(boolean[][] arr) {
		
		System.out.print(' ');
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(i);
		}
		//格式转行
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] ? '*' : ' ');
			}
			//格式转行
			System.out.println();
		}
		
	}

}
