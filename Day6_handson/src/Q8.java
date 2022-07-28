/*
 1)Write a Java program to create an ArrayList, add all the months of a year and print the same.
 
2) Create an ArrayList that can store only Strings.

Create a printAll method that will print all the elements of the ArrayList using an Iterator.


 */




import java.awt.List;
import java.util.*;

public class Q8 {
public static void main(String[] args)
{
	ArrayList<String> l=new ArrayList<>();
	l.add("January");
	l.add("February");
	l.add("March");
	l.add("April");
	l.add("May");
	l.add("June");
	l.add("July");
	l.add("August");
	l.add("September");
	l.add("October");
	l.add("November");
	l.add("December");
	System.out.println("Method 1 to print");
	System.out.println(l);
	System.out.println();
	System.out.println("Method 2");
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("Method 3 to print");
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	System.out.println();
	PrintAll(l);
}

public static void PrintAll(ArrayList<String> l) {
	System.out.println("PrintAll Method Invoked");
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
