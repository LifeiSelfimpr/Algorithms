package com.lifei.algorithms.chapter1_1;

/**
 * 题目：
 * 1.1.24 给出使用欧几里得算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。
 	扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 	使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
	
	提示：欧几里德算法又称辗转相除法，是指用于计算两个正整数a，b的最大公约数。
		 计算公式gcd(a,b) = gcd(b,a mod b)。
 * @author LiFei
 *
 */
public class Exercise_24 {

	public static void main(String[] args) {
		
		int a = gcb(1111111 , 1234567);
		System.out.println("1111111 和 1234567 的最大公约数是：" + a);
	}

	private static int gcb(int i, int j) {
		int rem = 0;
		int temp = 0;
		if (i < j) {
			//交换i和j的值
			temp = i;
			i = j;
			j = temp;
		}
		rem = i % j;
		if (rem == 0) {
			return j;
		}
		System.out.println("a = "+ j +", b = "+rem);
		
		return gcb(j,rem);
	}

}
