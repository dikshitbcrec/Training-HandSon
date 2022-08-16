package com.java;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
Account Management
John wants to maintain basic information about his customers account.
Create class Account with private variable balance of double type. 
Add setter and getter for balance.

Account class allows customer to deposit and withdraw balance.
 Minimum balance is 5000. Use setter based dependency.

 Add below methods,

public void deposit(double amount) --> will deposit money in account

public void withdraw(double amount) --> will withdraw money from account. 
After withdraw, minimum balance must be maintained ,

i.e. 5000 rs

Create class Customer which maintains customer information 
and his account details. 
Customer class will have f

irst name(String), last name(String) and account (Account). 
Add setter, getter for all instance variables.

Create spring.xml to configure bean objects. 
Use maven to add dependency for jars (pom.xml)

Create main class. Using ApplicationContext access bean object for customer 
and perfom below operations

1.	Accept amount for deposit and display balance and first name , last name
2.	Accept amount for withdraw and display balance 
(show message if withdraw amount is more than balance)
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Customer cb=ctx.getBean(Customer.class);
		System.out.println( cb.toString());
		boolean s=true;
		while(s)
		{
		System.out.println("1.) Deposit \t2.) Withdrawing \t3.)Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to process");
		int n=sc.nextInt();
			switch(n)
			{
			case 1: cb.getAccount().deposit();
			break;
			case 2: cb.getAccount().withdraw();
			break;
			case 3: 
				System.out.println("Welcome Back again");
				s=false;
			}
		}
    }
}
