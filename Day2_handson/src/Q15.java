//-----Write a program to initialize an array and print them in a sorted order.
import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array range");
		int n=sc.nextInt();
		int []a= new int[n];
		System.out.println("Enter the value in array");
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.print(i+ " ");
		}
		
	}
}
