package BankServices;

import library.list.MyList;


public class Bank {
    private String n;
	public Bank() {
	}
	public Bank(String n){
		this.n=n;
	}
	
	public String getName(){
		return n;
	}
	
	public int createAccount(String name, int date, double initial) {
		Account account = new Account(name, date, initial);
		return 0;
	}
	
	public Account deleteAccount(int code, int date) {
		return null;
	}
	
	public Account getAccount(int code) {
		return null;
	}

	public void deposit(int code, int date, double value) {
	}

	public void withdraw(int code, int date, double value) {
	}
	
	public void transfer(int fromCode, int toCode, int date, double value){
	}
	
	public double getTotalDeposit() {
		return 0.0;
	}
	
	public MyList getAccounts() {
		return null;
	}
	

	public MyList getZeroAccounts() {
		return null;
	}

	public MyList getAccountsByBalance(double low, double high) {
		return null;
	}
	
	public long getNumberHigher(double min) {
		return 0;
	}
}
