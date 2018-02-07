package com.lifei.algorithms.chapter1_2;

public class SmartDate {
	
	private int year;
	private int month;
	private int day;
	
	public SmartDate(int year,int month,int day) throws Exception{
		if(year<0 || month<0 || day<0){
			throw new IllegalArgumentException("年月日要大于0");
		}
		
		if(month>12){
			throw new IllegalArgumentException("月份不大于12");
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			if(day>31){
				throw new IllegalArgumentException("日不大于31天");
			}
		}
			break;

		case 2:{
			//2月 如果是闰年，则29天；否则其他是28天
			if(day>29){
				throw new IllegalArgumentException("日不大于31天");
			}
			
			if(!((year%4==0)&&(year%100!=0) || (year%400==0))){
				//不是闰年，如果是29天
				if(day>28){
					throw new IllegalArgumentException("日不大于29天");
				}
			}else{
				//是闰年
				if(day!=29){
					throw new IllegalArgumentException("闰年的2月应该是29天");
				}
			}
			
		}
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:{
			if(day>30){
				throw new IllegalArgumentException("日不大于30天");
			}
		}
			break;	
		
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	// 题目： 1.2.12 方法
	public String dayOfWeek(){
		int month = this.month;
		int year = this.year;
		
		//待添加方法
		
		int week = 0;
		switch (week) {
		case 0:
			return "Money";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		default:
			return null;
		}
	}

	public static void main(String[] args) throws Exception {
		SmartDate date = new SmartDate(2008, 2, 28);
	}

}
