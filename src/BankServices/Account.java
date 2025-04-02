package BankServices;

import library.list.MyList;


public class Account {
	private String name;
	private int date;
	private double initial;
	private int code;
	private static int counter = 0;
	{
		counter++;
	}
	public Account(String name, int date, double initial) {
		this.name = name;
		this.date = date;
		this.initial = initial;
	}
	public String getName() {
		return name;
	}
	public int getDate() {
		return date;
	}
	public double getInitial() {
		return initial;
	}
	public String toString() { //account: 1,John,8,460.5
		return "account: "+name+','+date+','+initial;
	}

	public MyList getMovements() {
		return null;
	}
	
	public MyList getDeposits() {
		return null;
	}

	public MyList getWithdrawals() {
		return null;
	}
}
