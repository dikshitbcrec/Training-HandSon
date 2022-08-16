package com.java;

import java.util.Scanner;

public class Account {
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	Scanner sc=new Scanner(System.in);
	public void deposit()
	{	System.out.println("Enter the amount to Deposit");
		double amount=sc.nextDouble();
		double temp=balance+amount;
		balance=temp;
		System.out.println( amount+" deposited successfully in the account");
		System.out.println("Total Balance = "+balance);
	}
	public void withdraw()
	{
		System.out.println("Enter the amount to Withdraw");
		double amount=sc.nextDouble();
		if(amount<balance-5000)
		{	double temp=balance-amount;
			balance=temp;
			System.out.println("amount withdraw "+amount);
			System.out.println("remaing blance "+balance);
		}
		else {
			System.out.println("minimum balance should be 5000");
		}
	}
}
