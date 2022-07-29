package com.Day13Jdbc_handson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Modify the above program to display all the rows where sal is greater than 1000 and less than 2000.

 Display the columns ename, job, sal and comm.



 */
public class Q1
{
    public static void main( String[] args ) throws Exception
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root","root");
       if(con!=null)
       {
    	   System.out.println("Connected to the DataBase");
       }else
       {
    	   System.out.println("Fail");
       }
       Statement st=con.createStatement();
       String query="Select * from emp";
       ResultSet rs=st.executeQuery(query);
       System.out.println("Showing Empno and Ename");
       System.out.println("------------------------");
       System.out.println();
       while(rs.next())
       {
    	   System.out.println("Employee id : "+rs.getInt(1)+"  Employee Name : "+rs.getString("ename"));
       }
       System.out.println();
       System.out.println("Showing All details According to Range B/w 1000 to 3000");
       System.out.println("--------------------------------------------------------");
       query="Select ename,job,sal,comm from emp where sal >1000 AND sal <2000";
       rs=st.executeQuery(query);
       while(rs.next())
       {
    	  System.out.println("Employee Name : "+rs.getString("ename")+"\tJob: "+rs.getString("job")+"\tSalary: "+rs.getString("sal")+"\tComm : "+rs.getString("comm"));
       }
       System.out.println();
       con.close();
       if(con.isClosed())
       {
    	   System.out.println("Databases Disconnected");
       }
       
    }
}
