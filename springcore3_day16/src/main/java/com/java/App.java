package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//	    TextEditor te = (TextEditor) ctx.getBean("textEditor");
//	    te.spellCheck();
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	    Profile profile = (Profile) ctx.getBean("profile");
	    profile.printAge();
	    profile.printName();
	  
	}
	
	

	  
}

