/*
 Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and 
have the following abilities:

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.


 */
import java.util.*;
import java.util.Map.Entry;
public class Q3 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> map=new HashMap<>();
	map.put("Dikshit", 1234567890);
	map.put("Ramesh",234567890);
	map.put("Shayam",356789012);
	map.put("Ranjan",3467389);
	map.put("Hello", 8340148);
	
	Set<Entry<String,Integer>> set=map.entrySet();
	Iterator<Entry<String,Integer>> itr=set.iterator();
	System.out.println("Check if a particular key exists or not.");
	String s1=sc.next();
	int d=0;
	while(itr.hasNext())
	{
		Map.Entry<String,Integer> k=itr.next();
		if(k.getKey().equals(s1))
		{
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
	System.out.println("Enter contact number to search");
	//sc.next();
	 int number=sc.nextInt();
	 System.out.println(number);
	 Set<Entry<String,Integer>> set1=map.entrySet();
	 Iterator<Entry<String,Integer>> itr1=set1.iterator();
	d=0;
	while(itr1.hasNext())
	{
		Map.Entry<String,Integer> k=itr1.next();
		if(k.getValue()==number)
		{
			
			System.out.println("Value Found");
			System.out.println("Number : "+k.getValue()+" "+"Name :"+k.getKey());
			d=1;
		}
	}
	if(d==0)
	{
		System.out.println("Key Not found");
	}
	System.out.println();
	System.out.println("-----------For Iterating All List--------------------");

	Set<Entry<String,Integer>> set3=map.entrySet();
	Iterator<Entry<String,Integer>> itr3=set3.iterator();
	while(itr3.hasNext())
	{
		Map.Entry<String, Integer> k=itr3.next();
		System.out.println(k.getKey() +" "+k.getValue());
	}
	
	
}
}
