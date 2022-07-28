import java.util.Scanner;

//------------------------------Write a program to print prime numbers between 10 and 99.
public class Q4 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Starting Range of a number");
	int n=sc.nextInt();
	System.out.println("Enter Ending Range of a number");
	int k=sc.nextInt();
	for(int i=n;i<=k;i++)
	{   int flag=0;
		for(int j=2;j<=(int)Math.sqrt(i);j++)
		{
			if(i%j==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.print(i+" ");
		}
	}
	
}
}
