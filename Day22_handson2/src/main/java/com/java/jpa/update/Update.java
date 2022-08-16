package com.java.jpa.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

import com.java.employee.EmployeeEntity;

public class Update {

	public static void update() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

	    EntityManager em=emf.createEntityManager();

	    em.getTransaction().begin();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Employee Number to update");
	    int n=sc.nextInt();
	    EmployeeEntity e1=em.find(EmployeeEntity.class,n);
        System.out.println("Before Updation");  
        System.out.println("Employee id = "+e1.getEmpno());  
        System.out.println("Employee Name = "+e1.getEname());  
        System.out.println("Employee Salary = "+e1.getSalary());
        
        System.out.println();
        System.out.println("Enter salary to update");
        double sal=sc.nextDouble();
        
        e1.setSalary(sal);
        System.out.println("Before Updation");  
        System.out.println("Employee id = "+e1.getEmpno());  
        System.out.println("Employee Name = "+e1.getEname());  
        System.out.println("Employee Salary = "+e1.getSalary());
       
        em.getTransaction().commit();

	    
	    
		
	}
	
}
