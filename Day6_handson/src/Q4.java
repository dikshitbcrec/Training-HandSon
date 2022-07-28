import java.util.Scanner;

/*
Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
 */
public class Q4 {
public static void main(String[] args)
{	Scanner sc= new Scanner(System.in);
	try {
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		System.out.println("Enter another number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("The value of two number is : "+c);
		System.out.println("Successfully run");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
