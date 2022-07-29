package com.Day13Jdbc_handson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//----------------------------First Create Db Schema for Student_deatils---------------------

/*CREATE TABLE student(
		  rollno int(4) PRIMARY KEY,
		  studentname VARCHAR(20) NOT NULL,
		  standard VARCHAR(3) NOT NULL,
		  dob DATE,
		   fees double(9,2));
		   */



public class Q2 {
   public static void main(String[] args) throws Exception {
	   
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root","root");
	   if(con!=null)
	   {
		   System.out.println("Database Connected");
	   }
	   Statement st=con.createStatement();
	   String query="insert into student values(?,?,?,?,?)";
	   PreparedStatement ps=con.prepareStatement(query);
//	   ps.setInt(1, 123);
//	   ps.setString(2, "Amit");
//	   ps.setString(3,"I");
//	   ps.setString(4,"2022-07-29");
//	   ps.setDouble(5, 2345.233);
	  Scanner sc= new Scanner(System.in);
	  boolean s=true;
	  while(s) {

		  System.out.println("------------------------------Menu----------------------------");
		  System.out.println();
		  System.out.println("1.Insert Data\t2.Display Details\t3.Search details\t 4.exit");
		  System.out.println();
		  System.out.println("Press Any Key to Perform Action");
		  int n=sc.nextInt();
		  switch(n)
		  {
		  case 1: 
			  int rollno;
			  String studentname,standard,dob;
			  double fees;
			  System.out.println("Enter Roll No : ");
			  rollno=sc.nextInt();
			  if(iscorect(rollno))
			  {
				  
			  }
			  else
			  {		System.out.println("Invalid Roll No");
				  System.out.println("Enter Roll no in Range");
				 rollno=sc.nextInt();
			  }
			  sc.nextLine();
			  System.out.println("Enter Student Name : ");
			  studentname=sc.nextLine();
			  System.out.println("Enter Class Standard in Roman (I to X) :");
			  standard=sc.nextLine();
			  System.out.println("Enter Date of Birth yyyy-mm-dd");
			  dob=sc.nextLine();
			  System.out.println("Enter fees");
			  fees=sc.nextDouble();
			  ps.setInt(1, rollno);
			  ps.setString(2, studentname.toUpperCase());
			  ps.setString(3,standard.toUpperCase());
			  ps.setString(4,dob);
			  ps.setDouble(5,fees);
			  int k=ps.executeUpdate();
			  if(k>0)
			  {
				  System.out.println();
				  System.out.println("Registration Successful");
			  }
			  break;
		  case 2: 
			  System.out.println("-----------------Printing All Details----------------");
			  ResultSet rs=st.executeQuery("Select * from student");
			  System.out.println();
		  	while(rs.next())
		  	{
		  		System.out.println(rs.getInt(1)+"\t"+ rs.getString("StudentName")+"\t"+rs.getString("Standard")+"\t"+rs.getString("Date_of_Birth")+"\t"+rs.getDouble(5));
		  	}
		  	break;
		  case 3:
			  query="select * from student where Rollno=?";
			  ps=con.prepareStatement(query);
			  System.out.println("Enter Student ROll No");
			  int rol=sc.nextInt();
			  ps.setInt(1, rol);
			  ResultSet ts=ps.executeQuery();
			  if(ts.next())
			  {		System.out.println("--------------------Roll no Exist------------------");
				  System.out.println(ts.getInt(1)+"\t"+ ts.getString("StudentName")+"\t"+ts.getString("Standard")+"\t"+ts.getString("Date_of_Birth")+"\t"+ts.getDouble(5));
				   
			  }
			  else
			  {
				  System.out.println("Data not Found");
			  }
			  break;
		  case 4:
			  s=false;
			  break;
			  
	  }
		  System.out.println();
	  }
	  
	   System.out.println("End program");
	   
 }

private static boolean iscorect(int rollno) {
	int  count=0;
	while(rollno!=0)
	{
		count++;
		rollno/=10;
		
	}
	if(count<=4)
		return true;
	else
		return false;
}
}
