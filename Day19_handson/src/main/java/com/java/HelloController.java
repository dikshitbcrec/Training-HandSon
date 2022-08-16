package com.java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.Db.DBcon;

@Controller

public class HelloController {

  @RequestMapping("/hello")
  public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,@RequestParam("age") int age, @RequestParam("num") String phone,@RequestParam("gen") String gen,Model m)
  {

	  DBcon db=new DBcon();
	  Connection con;
	try {
		con=db.getConnect();
		if(con!=null)
			System.out.println("db connected");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	

    if(pass.equals("admin"))

    {	String query="insert into users values(?,?,?,?,?)";
    	try
    	{
			PreparedStatement ps=db.getConnect().prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setInt(3, age);
			ps.setString(4,gen);
			ps.setString(5,phone);
			int i=ps.executeUpdate();
			if(i>0)
				{
				System.out.println("Inserted Successfully");
				}
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
				
	String msg="Hello "+ name;
      System.out.println(name);
      System.out.println(age);
      System.out.println(phone);
      System.out.println(gen);
      	
      //add a message to the model

      m.addAttribute("message", msg);
      m.addAttribute("gender",gen);
      m.addAttribute("age",age);
      m.addAttribute("phone",phone);
      

      return "viewp";
    	
    
    }
    	


    else

    {

      String msg="Sorry "+ name+". You entered an incorrect password";

      m.addAttribute("message", msg);

      return "error";

    }

  }

}

