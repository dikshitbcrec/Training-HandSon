package com.SpringCore_Day16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Question.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	 //we need to type cast if we are not calling class name directly;
    	    //Employee ob=(Employee)ctx.getBean("e");
    	    //System.out.println(ob);
    	 //we not need to typecast if we are calling java class directly;
    	  Question ob=ctx.getBean(Question.class);
    	    ob.displayInfo();
}
}