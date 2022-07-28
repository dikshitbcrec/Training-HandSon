//-----------------------------------Write a program to initialize an integer array and print the sum and average of the array.
import java.util.Scanner;

public class Q10 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int []a= new int[n];
		int sum=0;
		System.out.println("Enter the value in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
			
		}
		System.out.println("The sum of all : " +sum);
		System.out.println("The average : "+(sum/(float)n));
	}

}
