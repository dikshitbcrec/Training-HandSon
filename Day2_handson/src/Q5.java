import java.util.Scanner;

//-----------------Write a program to print the sum of all the digits of a given number.
public class Q5 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		sum+=rem;
		n=n/10;
	}
	System.out.println("The Sum of Number is : "+sum);
}
}
