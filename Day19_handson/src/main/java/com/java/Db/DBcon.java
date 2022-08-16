package com.java.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
 public Connection getConnect() throws Exception{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
	 return con;
 }

public DBcon() {
	super();
	// TODO Auto-generated constructor stub
}
}
