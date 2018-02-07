package com.lifei.algorithms.chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.29 等值键。为 BinarySearch 类添加一个
 * 	静态方法 rank()，它接受一个键和一个整型有序数组(可能存在重复键)作为参数并返回数组中小于该键的元素数量，
 * 	以及一个类似的方法 count() 来 返回数组中等于该键的元素的数量。
 * 	注意:如果 i 和 j 分别是 rank(key,a) 和 count(key,a) 的返回值，那么 a[i..i+j-1] 就是数组中所有和 key 相等的元素。
 * @author LiFei
 *
 */
public class Exercise_29 {

	public static void main(String[] args) {
		int[] whiteList = { 6, 7, 1, 3, 1, 9, 5, 3, 7, 5, 1 };
		
		System.out.print("输入key元素：");
		int key = StdIn.readInt();
		
		// 数组中小于该键的元素数量
		int i = rank(key,whiteList);
		// 数组中等于该键的元素数量
		int j = count(key,whiteList);
		
		System.out.println("该数组中小于"+key+"的数量是："+i);
		System.out.println("该数组中等于"+key+"的数量是："+j);
	}

	private static int count(int key, int[] whiteList) {
		//int[] whiteList = { 6, 7, 1, 3, 1, 9, 5, 3, 7, 5, 1 };
		// key =6
		Arrays.sort(whiteList);
		System.out.println("----count----"+Arrays.toString(whiteList));
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < whiteList.length; i++) {
			if (whiteList[i] == key) {
				list.add(whiteList[i]);
			}
		}
		System.out.println("----count----"+list.toString());
		return list.size();
	}

	private static int rank(int key, int[] whiteList) {
		//int[] whiteList = { 6, 7, 1, 3, 1, 9, 5, 3, 7, 5, 1 };
		// key =6
		Arrays.sort(whiteList);
		System.out.println("----rank----"+Arrays.toString(whiteList));
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < whiteList.length; i++) {
			if (whiteList[i] < key) {
				list.add(whiteList[i]);
			}
		}
		System.out.println("----rank----"+list.toString());
		return list.size();
	}

}
