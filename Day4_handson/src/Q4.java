import java.util.Scanner;

/*Write a java program that will return the first half of the string, if the length of the string is even.

It should return null for odd length string.
*/
public class Q4 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int k=s.length();
	if(k%2==0)
	{
		System.out.println(s.substring(0,k/2));
	}
	else
	{
		System.out.println("Null");
	}
}
}
