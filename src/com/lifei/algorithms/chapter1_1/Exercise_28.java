package com.lifei.algorithms.chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;
import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.1.28 删除重复元素。修改BinarySearch类中的测试用例来删去排序之后白名单中的所有重复元素。
 	解析：a.对测试用例进行排序
 		 b.删除重复元素
 		 c.BinarySearch查找元素
 * @author LiFei
 *
 */
public class Exercise_28 {

	public static void main(String[] args) {
		
		System.out.print("输入要查询的元素：");
		int key = StdIn.readInt();
		
		int[] whiteList = { 6, 7, 1, 3, 1, 9, 5, 3, 7, 5, 1 };
		whiteList = searchDumplicateElements(whiteList);
		System.out.println(key+" 排序后的数组中的索引是："+BinarySearch.indexOf(whiteList, key));
		
	}
	
	/**
	 * 去掉重复元素
	 * @param whiteList 原数组
	 * @return 新数组
	 */
	private static int[] searchDumplicateElements(int[] whiteList) {
		// 对元素进行排序
		Arrays.sort(whiteList);
		System.out.println("1.排序后的数组是："+Arrays.toString(whiteList));
		
		// 删除重复元素
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < whiteList.length - 1; i++) {
			if (whiteList[i] != whiteList[i+1]) {
				list.add(whiteList[i]);
			}
		}
		//不管最后一个与最后第二个元素相等不相等，都将最后一个元素加进去
		list.add(whiteList[whiteList.length - 1]);
		
		whiteList = new int[list.size()];
		for (int i = 0; i < whiteList.length; i++) {
			whiteList[i] = list.get(i);
		}
		// 测试，打印结果
		System.out.println("2.去重后的数组是："+Arrays.toString(whiteList));
		return whiteList;
	}

}
