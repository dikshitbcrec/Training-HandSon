import java.util.Scanner;

/*
 Given a string, return a new string made of 'n' copies of the first 2 chars of the original string

where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe
 
 */
public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		s=s.substring(0,2);
		for(int i=0;i<n;i++)
		{
			System.out.print(s);
		}
		
	}

}
