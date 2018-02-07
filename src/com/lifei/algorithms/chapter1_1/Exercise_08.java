package com.lifei.algorithms.chapter1_1;

/**
 * 题目： 1.1.8给出以下表达式的值: 
 	a. System.out.println('b'); 
 	b. System.out.println('b' + 'c'); 
 	c. System.out.println((char) ('a' + 4));
 * 
 * @author LiFei
 *
 */
public class Exercise_08 {

	public static void main(String[] args) {
		System.out.println('b');//b
		System.out.println('b' + 'c');//98+97=197 被转为了int类型
		System.out.println((char) ('a' + 4));//int类型高于byte，将97+4=101，再转为char就是e

	}

}
