import java.util.Scanner;

//-----------------------Write a program to reverse a given number and print to find if the given number is palindrome or not
public class Q8 {
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
		if(rev==temp)
		{
			System.out.println(rev+" is a Palindrome");
		}
		else
		{
			System.out.println(rev+" is not a Palindrome");
		}
	}
}
