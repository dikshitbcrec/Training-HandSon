import java.util.Scanner;
import java.util.concurrent.Callable;

/*
 Write a program in Java to demonstrate Java 8 Lambda Initialization using Callable
Step1: create Java main class LambdaInitialization
Step2: Scan 2 inputs to pass it to Callable Interface call method
Step3: Using lambda expression implement the call method
Sample Input1
Enter the first animal to be stored in callable array
Lion
Enter the second animal to be stored in callable array
Tiger
Sample output1
Lion
Tiger
Sample Input2
Enter the first animal to be stored in callable array
Dog
Enter the second animal to be stored in callable array
Cat
Sample Output2

Dog
Cat 
 */

public class Q2 {
public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.println("Enter the first animal to be stored in callable array");
	s1=sc.nextLine();
	System.out.println("Enter the Second animal to be stored in callable array");
	s2=sc.nextLine();
	Callable<String[]> c=()->{
		String []a=new String[2];
		a[0]=s1;
		a[1]=s2;
		return a;
	};
	for(String i:c.call())
	{
		System.out.println(i);
	}
	//System.out.println(c.call());
	
	
	
}
}
