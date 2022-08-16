package com.Day20_handson;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        
    	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory factory=meta.getSessionFactoryBuilder().build();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	 /*Employ e1=new Employ();
    	 e1.setId(180);
    	 e1.setName("Rakesh");
    	 e1.setSalary(4500.0f);
    	 session.save(e1);*/
    	
//    	for Displaying all Data;
    	Query query=session.createQuery("from Employ");
    	List<Employ> li=query.getResultList();
    	for(Employ e: li)
    		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//  	for Updation
 query=session.createQuery("update Employ set salary=:sal where id=:n");
 query.setParameter("sal",45000.0f);
 query.setParameter("n", 104);
 int status =query.executeUpdate();

 // For Deleteion
 query=session.createQuery("delete from Employ where id=:n");
 query.setParameter("n",108 );
 int statu =query.executeUpdate();
 
// For Searching

    	t.commit();
    	System.out.println("Successfull"+ status +" "+statu);
    	factory.close();
    	session.close();
    	
    	
    	
    	
    }
}
