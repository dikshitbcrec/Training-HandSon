import java.util.Scanner;

/*
 *Write a program that takes as input the size of the array and the elements in the array. 
The program then asks the user to enter a particular index and prints the element at that index.
This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the class name of the exception thrown.
 */
public class Q2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println("Enter the value in Array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	try 
	{
		System.out.println("Enter the index of the array element you want to access");
		int k=sc.nextInt();
		System.out.println("The array element at index "+k+ " "+a[k-1]);
	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	}
	
}
}
