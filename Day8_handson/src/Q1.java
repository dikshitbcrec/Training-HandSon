/*
 1)Create a Collection called HashMap which is capable of storing String objects.
 The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
 */

import java.util.*;
import java.util.Map.Entry;
public class Q1 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);

	HashMap<String,String> h1=new HashMap<>();
	
	h1.put("Delhi","Batore");
	h1.put("Karnataka","idli");
	h1.put("Rajasthan", "Raab");
	h1.put("Mumbai","Pav");
	h1.put("Bihar", "Lithi");
	h1.put("Jharkhand", "Dhuska");
	
	Set<Entry<String,String>> set=h1.entrySet();
	Iterator<Entry<String,String>> it=set.iterator();
	System.out.println("--------------------For Finding Key ------------------------------");
	System.out.println("Enter a key to search");
	String s1=sc.nextLine();
	int d=0;
	while(it.hasNext())
	{
		Map.Entry<String,String> k=it.next();
		
		//System.out.println("key : "+k.getKey()+" Value : "+k.getValue());
		if(k.getKey().equals(s1)) {
			
			System.out.println("Key Found");
			System.out.println("Place : "+k.getKey()+"  ||  Dish : "+k.getValue());
			d=1;
		}
	}
	if(d==0)
	{
		System.out.println("Key Not found");
	}
	System.out.println("--------------------For Finding Value------------------------------");
	System.out.println("Enter a Value to search");
	 s1=sc.nextLine();
	
	d=0;
	Set<Entry<String,String>> set2=h1.entrySet();
	Iterator<Entry<String,String>> itr1=set2.iterator();
	while(itr1.hasNext())
	{
		Map.Entry<String, String> k=itr1.next();
		if(k.getValue().equals(s1))
		{
			System.out.println("Value Found");
			System.out.println("Dish : "+k.getValue() +" || Place : "+k.getKey());
			d=1;
		}
	}
	if(d==0)
	{
		System.out.println("Value Not found");
	}
	System.out.println();
	System.out.println("-----------For Iterating All List--------------------");
	Set<Entry<String,String>> set3=h1.entrySet();
	Iterator<Entry<String,String>> itr3=set3.iterator();
	while(itr3.hasNext())
	{
		System.out.println(itr3.next());
	}
	
}
}
