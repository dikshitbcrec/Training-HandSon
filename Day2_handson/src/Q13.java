//------------- Initialize an integer array with ascii values and print the corresponding character values in a single row.
import java.util.Scanner;

public class Q13 {
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
	for(int i=0;i<n;i++)
	{
		System.out.print((char)a[i]+ " ");
	}
	
}
}
