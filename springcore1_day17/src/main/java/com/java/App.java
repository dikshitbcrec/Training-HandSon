package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		    HelloWorld ob = ctx.getBean(HelloWorld.class);

		    ob.setMessage("java based configuaration");

		    System.out.println( ob.getMessage());
	}

}
