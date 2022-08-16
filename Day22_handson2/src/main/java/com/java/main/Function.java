package com.java.main;

import java.util.Scanner;

import com.java.jpa.delete.Delete;
import com.java.jpa.display.Display;
import com.java.jpa.insert.Insert;
import com.java.jpa.update.Update;

public class Function {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	boolean s=true;
	while(s)
	{
		System.out.println("Welcome");
		System.out.println("1).Insert 2.) Display 3.)Update 4.)Delete 5.)Exit");
		System.out.println("Enter a Selection");
		int n=sc.nextInt();
		switch(n)
		{
		case 1: Insert.insert();
		break;
		case 2: Display.display();
		break;
		case 3: Update.update();
			break;
		case 4: Delete.del() ;
		break;
		case 5: s=false;
		System.out.println("Welcome Again Bye- Bye");
		break;
		}
	}
	
}
}
