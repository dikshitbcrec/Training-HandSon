import java.util.Scanner;

//Write a java program that accepts a string and returns a new string without the first and last character of the input string.

/*Example1)

i/p:Suman

o/p:uma */
public class Q5 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
			String S=sc.next();
	S=S.substring(1,S.length()-1);
	System.out.println(S);
}
}
