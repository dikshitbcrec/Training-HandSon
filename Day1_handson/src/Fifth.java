import java.util.Scanner;

public class Fifth {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Male Or Female?");
	String S1=sc.nextLine();
	char d1=S1.charAt(0);
	if(d1=='m' || d1=='M')
	{
		System.out.println("Please Enter Your Age");
		int age=sc.nextInt();
		if(age>=1 && age<=58)
		{
			System.out.println("The percentage of interest is 8.4%");
		}
		else
		{
			System.out.println("The percentage of interest is 10.5%");
		}
	}
	else if(d1=='f' || d1=='F')
	{
		System.out.println("Please Enter Your Age");
		int age=sc.nextInt();
		if(age>=1 && age<=58)
		{
			System.out.println("The percentage of interest is 8.2%");
		}
		else
		{
			System.out.println("The percentage of interest is 9.2%");
		}

	}
}
}
