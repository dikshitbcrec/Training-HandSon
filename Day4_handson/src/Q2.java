/*Write a java program that will concatenate 2 strings and return the result.

The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)

i/p:Sachin,Tendulkar

o/p:sachin tendulkar

Example2)

i/p:Mark,kate

o/p:markate*/




import java.util.Scanner;

public class Q2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] w=s.split(",");
	String k=w[0];
	String d=w[1];
	if(k.charAt(k.length()-1)==d.charAt(0))
	{
		s=k+d.substring(1);
		System.out.println(s.toLowerCase());
	}
	else
	{
		s=k+" "+d;
		System.out.println(s.toLowerCase());
	}
}
}
