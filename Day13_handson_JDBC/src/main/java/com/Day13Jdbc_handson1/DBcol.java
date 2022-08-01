package com.Day13Jdbc_handson1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcol {

	
	 Connection con=null;
	public static Connection getconnect() throws Exception{
			Connection con=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root", "root");
				System.out.println("Database Connected To java");
				System.out.println("---------------------------------------------");
				System.out.println();
			
			return con;
			
	}	
	
}
