package com.lifei.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdIn;

/**
 * 题目：
 * 1.2.6 如果字符串 s 中的字符循环移动任意位置之后能够得到另一个字符串 t，
 * 		那么 s 就被称为 t 的回环变位（circular rotation）。
 * 		例如，ACTGACG 就是 TGACGAC 的一个回环变位，反之亦然。判定这个条件在基因组序列的研究中是很重要的。
 * 		编写一个程序检查两个给定的字符串 s 和 t 是否互为回环变位。
 * 		提示：答案只需要一行用到 indexOf()、length() 和字符串连接的代码。
 * @author LiFei
 *
 */
public class Exercise_06 {

	public static void main(String[] args) {
		
		System.out.print("请输入一个字符串s：");
		String s = StdIn.readLine();
		System.out.print("请输入一个字符串t：");
		String t = StdIn.readLine();
		
		if (s.length()==t.length() && s.concat(s).indexOf(t)>=0) {
			System.out.println(s + " is the circular rotation of " + t);
		}else{
			System.out.println(s + " is not the circular rotation of " + t);
		}
	
	}

}
