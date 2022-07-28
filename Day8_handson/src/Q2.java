/*
  Write a program that will have a Properties class object which is capable of storing some States of India

and their Capital. Use an Iterator to list all the elements stored in the Properties.

 */
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,String> s=new HashMap<>();
	s.put("Andhra Pradesh",	"Amaravati");
	s.put("Arunachal Pradesh","Itanagar");
	s.put("Assam","Dispur");
	s.put("Bihar","Patna");
	s.put("Chhattisgarh","Raipur");
	
	
	Set<Entry<String,String>> set= s.entrySet();
	Iterator<Entry<String,String>> itr=set.iterator();
	System.out.println("State"+"\t"+"Capital");
	System.out.println("--------------------");
	while(itr.hasNext())
	{
		Map.Entry<String, String> k=itr.next();
		System.out.println(k.getKey()+"\t"+k.getValue());
		
	}
	
	
}
}
