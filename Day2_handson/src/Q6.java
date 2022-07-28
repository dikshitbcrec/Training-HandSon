import java.util.Scanner;

//--------------Write a program to print * in Floyds format (using for and while loop)
public class Q6 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Take I/P");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
