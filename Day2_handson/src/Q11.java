//-----------------Write a program to initialize an integer array and find the maximum and minimum value of the array.
import java.util.Scanner;
public class Q11 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int []a= new int[n];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("Enter the value in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}	
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
}
