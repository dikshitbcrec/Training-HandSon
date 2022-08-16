package com.java.jpa.find;



import java.util.List;

import javax.persistence.*;

import com.java.jpa.student.*;

public class FindStudent {

  public static void main(String args[])

  {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");

    EntityManager em=emf.createEntityManager();

    em.getTransaction().begin();

    StudentEntity s1=new StudentEntity();

    s1.setS_id(111);

    s1.setS_name("Gaurav");

    s1.setS_age(24);

    StudentEntity s2=new StudentEntity();

    s2.setS_id(118);

    s2.setS_name("Ronit");

    s2.setS_age(22);

    StudentEntity s3=new StudentEntity();

    s3.setS_id(132);

    s3.setS_name("Rahul");

    s3.setS_age(26);

    em.persist(s1);

    em.persist(s2);

    em.persist(s3);
    //em.getTransaction().commit();

    
//    StudentEntity s=em.find(StudentEntity.class,101);

//    System.out.println("Student id = "+s.getS_id());

//    System.out.println("Student Name = "+s.getS_name());

//    System.out.println("Student Age = "+s.getS_age());

  /*  StudentEntity s=em.find(StudentEntity.class,103);

    System.out.println("Before Updation");

    System.out.println("Student id = "+s.getS_id());

    System.out.println("Student Name = "+s.getS_name());

    System.out.println("Student Age = "+s.getS_age());

     s.setS_age(30);

    System.out.println("After Updation");

    System.out.println("Student id = "+s.getS_id());

    System.out.println("Student Name = "+s.getS_name());

    System.out.println("Student Age = "+s.getS_age());
    
//    removing element
//    StudentEntity s2=em.find(StudentEntity.class,102);
//    em.remove(s);
    Query q= em.createQuery("from StudentEntity");

    List <StudentEntity> list= q.getResultList();

    for(StudentEntity se:list)

    {

     System.out.println(se.getS_id()+" "+se.getS_name()+" "+se.getS_age());

    }
    //q=em.createQuery("delete from StudentEntity where s_id=101");

//    int i=q.executeUpdate();

//    System.out.println(i);*/

 em.getTransaction().commit();

  }

}