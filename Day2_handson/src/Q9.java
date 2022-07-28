import java.util.Scanner;

//-----------------Write a program to print first 5 values which are divisible by 2, 3, and 5.
public class Q9 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int count=0;
	/*while(count<5)
	{
		if( (n%2==0) && (n%3==0) && (n%5==0)) 
		{
			System.out.print(n+ " ");
			count++;
		}
		n++;
	}*/
	
	for(int i=n;count<5;i++) {
		if( (i%2==0) && (i%3==0) && (i%5==0)) {
			System.out.print(i+ " ");
			count++;
		}
	}
	
}
}
