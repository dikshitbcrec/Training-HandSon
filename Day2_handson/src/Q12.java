//--------Write a program to initialize an integer array with values and check if a given number is present in the array or not.
import java.util.Scanner;

public class Q12 {
	public static void main(String [] args)
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
		System.out.println("Enter number for  searching");
		int k=sc.nextInt();
		int d=search(n,a,k);
		System.out.println(d);
		
	}

	 static int search(int n, int[] a, int k) {
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
	}
}
