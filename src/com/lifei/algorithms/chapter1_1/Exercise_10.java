package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.10 下面这段代码有什么问题?
	int[] a;
	for (int i = 0; i < 10; i++)
	a[i] = i * i;
	解答:它没有用 new 为 a[] 分配内存。这段代码会产生一个 variable a might not have been initialized 的编译错误。

 * @author LiFei
 *
 */
public class Exercise_10 {

	public static void main(String[] args) {
		
//		int[] a; 这种写法是不对的，没有被分配内存，没有分配内存，这个数组的值就没法存起来，所以会报错。
		
		int[] a = new int[10];//正确
		for (int i = 0; i < 10; i++)
			a[i] = i * i;
	}

}
