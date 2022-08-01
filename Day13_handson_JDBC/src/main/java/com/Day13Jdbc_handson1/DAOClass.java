package com.Day13Jdbc_handson1;

import java.util.Iterator;
import java.sql.*;

public class DAOClass {

	private Connection con=null;
	PreparedStatement ps;
	DAOClass() throws Exception{
		try {
			con=DBcol.getconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Statement st=con.createStatement();
	
	String insert(int Roll,String Name,String Standard,String Dob,Double fees) throws Exception
	{		String query="insert into student values(?,?,?,?,?)";
			ps=con.prepareStatement(query);
		  ps.setInt(1,Roll);
		  ps.setString(2,Name);
		  ps.setString(3,Standard);
		  ps.setString(4,Dob);		   
		  ps.setDouble(5, fees);
		  int k=ps.executeUpdate();
		  if(k>0)
			  return "Registration Successfully Done";
		  else
			  return "Registration Problems Occurs";
	}
	String delete (int Roll) throws Exception
	{	
		String query="delete from student where Rollno=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, Roll);
		int k=ps.executeUpdate();
		if(k>0)
		{
			return "Data Deleted";
		}else {
			return "No Data found";
		}
	}
	String modifying(int Roll,double fees) throws Exception{
		String query="update student set Fees=?  where Rollno=?";
		ps=con.prepareStatement(query);
		ps.setDouble(1, fees);
		ps.setInt(2, Roll);
		int i=ps.executeUpdate();
		if(i>0)
		{
			return "Data Updated";
		}else
		{
			return "Invalid Student Roll No";
		}
		
	}
	void displaying() throws Exception{
		 	Statement st=con.createStatement();
	       String query="Select * from student";
	       ResultSet rs=st.executeQuery(query);
	       System.out.println("Showing All Details");
	       System.out.println("-------------------------------------------------------------");
	       System.out.println();
	       while(rs.next())
	       {
	    	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));  
	       
	       }
		
	}
	void displaying(int Roll) throws Exception{
		String query="Select * from student where Rollno=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, Roll);
		ResultSet ts=ps.executeQuery();
		 if(ts.next())
		  {		System.out.println("--------------------Roll no Exist------------------");
			  System.out.println(ts.getInt(1)+"\t"+ ts.getString("StudentName")+"\t"+ts.getString("Standard")+"\t"+ts.getString("Date_of_Birth")+"\t"+ts.getDouble(5));
			   
		  }else
		  {
			  System.out.println("Not Data Found ");
		  }
	
		
	}
	
}
