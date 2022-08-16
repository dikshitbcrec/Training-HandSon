package com.java.jpa.find;
import javax.persistence.*;

import javax.persistence.criteria.*;

import com.java.jpa.student.StudentEntity;

import java.util.*;

public class SingleFetch {

  public static void main( String args[]) {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );

     EntityManager em = emf.createEntityManager();

    em.getTransaction().begin( );

  CriteriaBuilder cb=em.getCriteriaBuilder();

     CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);

     Root<StudentEntity> stud=cq.from(StudentEntity.class);

     //cq.select(stud.get("s_name"));

    /* CriteriaQuery<StudentEntity> select = cq.select(stud);

     TypedQuery<StudentEntity> q = em.createQuery(select);

     List<StudentEntity> list = q.getResultList();

     System.out.println("s_id");

     for(StudentEntity s:list)

     {

     System.out.println(s.getS_id());

    }*/
     
     
     cq.orderBy(cb.desc(stud.get("s_age")));  
     CriteriaQuery<StudentEntity> select = cq.select(stud);  
     TypedQuery<StudentEntity> q = em.createQuery(select);  
     List<StudentEntity> list = q.getResultList();  

     System.out.print("s_id");  
        System.out.print("\t s_name");  
        System.out.println("\t s_age");  
       
     for(StudentEntity s:list)  
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