//----------Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int []a= new int[n];
		System.out.println("Enter the value in array");
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("The Minimum are : "+a[0]+" "+a[1]);
		System.out.println("The Maximum are : "+a[a.length-2]+" "+a[a.length-1]);
		
	}
}
