package com.JdbcProject_day13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDemo 
{
    public static void main( String[] args ) throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root", "root");
    	Statement st=con.createStatement();
    	//String query="insert into employ values( 8,'Harry',30000)";
    	//String query="delete from employ where empid=8";
    	//int i=st.executeUpdate(query);
    	
//    	PrepareStatement;
   /* 	String query="insert into employ values(?,?,?)";
    	PreparedStatement ps=con.prepareStatement(query);

    	 ps.setInt(1, 22);

    	 ps.setString(2, "amit");

    	 ps.setDouble(3, 8500.55);
*/
    	// String query="update employ set salary=? where empid=?";
 /*   	 String query="delete from employ where empid=?";
    	 PreparedStatement ps=con.prepareStatement(query);

    	// ps.setDouble(1, 15000);

    	 ps.setInt(1, 22);
    	 int i=ps.executeUpdate();
    	if(i>0)
    	{	System.out.println(i);
    		System.out.println("Success");
    	}*/
    	 CallableStatement cs=con.prepareCall("call simple(?,?,?)");

    	 cs.setInt(1, 555);

    	 cs.setString(2, "dinesh");

    	 cs.setFloat(3, 28000);

    	 cs.execute();

    	 System.out.println("success");
    	
    	
    	 String query="Select * from employ";
    	ResultSet rs=st.executeQuery(query);
    	while(rs.next())
    	{
    		System.out.println(rs.getString("empid")+" "+rs.getString("ename")+" "+rs.getString("salary"));
    	}
    }
}
