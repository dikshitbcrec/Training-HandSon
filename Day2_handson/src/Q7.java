import java.util.Scanner;

//-------------Write a program to reverse a given number and print
public class Q7 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a digit");
	int n=sc.nextInt();
	int temp=n,rev=0;
	while(n!=0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	System.out.println("Before Reversing :" + temp);
	
	
	
	System.out.println("After Reversing :" +rev);
}
}
