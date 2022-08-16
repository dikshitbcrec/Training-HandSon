package com.java.jpa.between;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.java.jpa.student.StudentEntity;  
public class Comparison {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
          CriteriaBuilder cb=em.getCriteriaBuilder();  
            
          AbstractQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
         Root<StudentEntity> stud1=cq.from(StudentEntity.class);  
           
         cq.where(cb.in(stud1.get("s_age")).value(22).value(24));  
          
          CriteriaQuery<StudentEntity> select1 = ((CriteriaQuery<StudentEntity>) cq).select(stud1);  
          TypedQuery<StudentEntity> tq1 = em.createQuery(select1);  
          List<StudentEntity> list1 = tq1.getResultList();  
            
          System.out.println("Students having age greater than 22");  
            
          System.out.print("s_id");  
             System.out.print("\t s_name");  
             System.out.println("\t s_age");  
            
          for(StudentEntity s:list1)  
          {  
          System.out.print(s.getS_id());  
          System.out.print("\t"+s.getS_name());  
          System.out.println("\t"+s.getS_age());  
          } 
            
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  
