package com.lifei.algorithms.chapter1_2;


import java.util.Arrays;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.2.9 修改 BinarySearch（请见 1.1.10.1 节中的二分查找代码），
 * 		使用 Counter 统计在有查找中被检查的键的总数并在查找全部结束后打印该值。
 * 		提示：在 main() 中创建一个 Counter 对象并将它作为参数传递给 rank()
 * @author LiFei
 *
 */
public class Exercise_09 {

	public static void main(String[] args) {
		System.out.print("请输入要查找的key：");
		int key = StdIn.readInt();
		
		Counter counter = new Counter("keys");
		int[] a = {3,7,5,6,7,8,7};
		
		String string = rank(key,a,counter);
		System.out.println(string);
		
	}
	
	/**
	 * 统计后打印
	 * @param key
	 * @param a
	 * @param counter
	 * @return
	 */
	private static String rank(int key, int[] a, Counter counter) {
		
		return indexOf(key,a,counter);
	}

	private static String indexOf(int key, int[] a, Counter counter) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key){
				counter.increment();
			}
		}
		return counter.toString();
	}

}
