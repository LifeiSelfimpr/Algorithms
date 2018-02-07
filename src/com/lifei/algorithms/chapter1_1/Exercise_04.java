package com.lifei.algorithms.chapter1_1;


/**
 * 题目：
 * 1.1.4下列语句各有什么问题(如果有的话)?
	a. if (a > b) then c = 0;
	b. if a > b { c = 0; }
	c. if (a > b) c = 0;
	d. if (a > b) c = 0 else b = 0;
 * @author LiFei
 *
 */
public class Exercise_04 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 0;
		//if (a > b) 
			//then c = 0;//这个语句有问题，then是伪代码实现，不能直接写在java代码中
//		if a > b 
//			{ c = 0; }//这个语句有问题，if后面要加括号，不能直接写伪代码
		if (a > b) c = 0;//这句代码是正确的
//		if (a > b) c = 0 else b = 0;//这个语句有问题，必须加;以显示一条语句的结束。
		
	}

}
