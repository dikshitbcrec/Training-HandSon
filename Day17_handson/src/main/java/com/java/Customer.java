package com.java;

public class Customer {
	private String fname,lname;
	private Account account;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	void Deposit() {
		System.out.println("Name: "+getFname()+" "+getLname());
		System.out.println(account.toString());
	}
	public String toString() {
		return "customer [first name : "+fname+" Last name : "+lname+ " Account :"+account.getBalance() + "]";
	}

}
