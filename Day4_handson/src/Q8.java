import java.util.Scanner;

/* Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)

i/p:ab*cd

o/p:ad
*/
public class Q8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='*')
			{
				c=i;
			}
		}
		if(c==0)
		{
			System.out.println(s1);
		}
		else {
		String d=s1.substring(0,c-1);
		String k=s1.substring(c+2);
		System.out.println(d+k);
		}
	}
}
