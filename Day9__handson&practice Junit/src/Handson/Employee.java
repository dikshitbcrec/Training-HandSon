/*
 Create a class Employee and implement the below method in the class.

public String findName(ArrayList employees,String name){
 String result="";
 if(employees.contains(name)){
  result="FOUND";
 }else{
  result="NOT FOUND";
 }
 return result;
 }
Write JUnit testcases to test the above method.

 */


package Handson;
import java.util.*;
public class Employee {
	public String findName(ArrayList<String> employee ,String name)
	{
		String result="";
		 if(employee.contains(name)){
		  result="FOUND";
		 }else{
		  result="NOT FOUND";
		 }
		 return result;
		 
	}

}
