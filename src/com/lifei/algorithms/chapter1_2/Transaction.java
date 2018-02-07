package com.lifei.algorithms.chapter1_2;

public class Transaction {
	private String who;
	private Date when;
	private double amount;
	
	public Transaction(String who, Date when, double amount) {
		super();
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Transaction(String str) {
		String[] fields = str.split("\\s+");
		this.who = fields[0];
		this.when = new Date(fields[1]);
		this.amount = Double.parseDouble(fields[2]);
	}

	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return this.who+"--"+this.when.toString()+"--"+this.amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Transaction that = (Transaction) obj;
		if (!this.who.equals(that.who)) {
			return false;
		}
		if (!this.when.equals(that.when)) {
			return false;
		}
		if (this.amount != that.amount) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// 13题:结果肯定是false，对象的比较 14题:添加equals方法，比较值，而不是对对象进行比较
		Transaction transaction = new Transaction("lifei", new Date(11,21,2017), 11.21);
		Transaction transaction2 = new Transaction("lifei 11/21/2017 11.21");
		System.out.println("结果："+transaction.equals(transaction2));
	}
	
}
