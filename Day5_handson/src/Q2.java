import java.util.Scanner;
/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.

You may assume that n is between 0 and the length of the string, inclusive.

Example1)

i/p:Hello,3

o/p:llollollo*/
public class Q2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word with a integer");
	String w=sc.nextLine();
	String []s=w.split(",");
	String s1=s[0];
	int k=Integer.parseInt(s[1]);
	w=s1.substring(k-1);
	for(int i=0;i<k;i++)
	{
		System.out.print(w);
	}
	
}
}
