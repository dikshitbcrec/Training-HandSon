package com.java.jpa.delete;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.java.employee.EmployeeEntity;

public class Delete {

	public static void del() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
 	    EntityManager em=emf.createEntityManager();
 	    em.getTransaction().begin();
 	    Scanner sc= new Scanner(System.in);
 	    System.out.println("Enter Employee Number to delete table");
 	    int empno=sc.nextInt();
 	    EmployeeEntity e1=em.find(EmployeeEntity.class,empno);
 	   System.out.println("Employee id = "+e1.getEmpno());  
       System.out.println("Employee Name = "+e1.getEname());  
       System.out.println("Employee Salary = "+e1.getSalary());
       System.out.println("Deleted Successfully");
       em.remove(e1);
       em.getTransaction().commit();
       emf.close();
       em.close();
 	    
		
	}

}
