/*
 Write a program in java for LambdaExpressionComparator demo. 
 The filter will sort the list of electronic products based on product name

Step1: Create a Product bean class with attributes id, name and price

Step2: create a main method and inside main method create the Product objects and 
products to the product list

Step3: Using the Collections. Sort , 
sort the Product List using lambda expression. Lambda expression will use 
the object compareTo method compare the name objects for sorting

Step4: Finally print the elements of sorted product list

Sample output

Sorting on the basis of name...

2 Dell Mouse 150.0

1 HP Laptop 25000.0

3 Keyboard 300.0
 */
import java.util.*;
public class Q2 {
public static void main(String[] args) {
	List<Product> p=new ArrayList<>();
	p.add(new Product(1,"HP Laptop",25000.0f));
	p.add(new Product(2,"Dell Mouse",150.0f));
	p.add(new Product(3,"Keyboard",300.0f));
	System.out.println("-------Befor Sorting------------");
	for(Product li:p)
	{
		System.out.println(li.id+" "+li.name+" "+li.price);
	}
	Collections.sort(p,(a1,b1)->{
		return a1.name.compareTo(b1.name);
	});
	System.out.println("After sorting Name Wise");
	for(Product li:p)
	{
		System.out.println(li.id+" "+li.name+" "+li.price);
	}
	List<Product> d=new ArrayList<>();
	d.add(new Product(1,"HP Laptop",25000.0f));
	d.add(new Product(2,"Dell Mouse",150.0f));
	d.add(new Product(3,"Keyboard",300.0f));
	Collections.sort(d,new comparebyPrice());
	System.out.println("After Sorting Price wise");
	for(Product li:d)
	{
		System.out.println(li.id+" "+li.name+" "+li.price);
	}
	
}
}
