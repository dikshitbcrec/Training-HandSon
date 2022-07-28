import java.util.Scanner;
/*Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.

Any characters left, will go to the end of the result.

Example1)

i/p:Hello,World

o/p:HWeolrllod*/

public class Q1 {

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two String using ,");
		String a=sc.nextLine();
		String []w=a.split(",");
		String b=w[0];
		String c=w[1];
		int s1=b.length();
		int s2=c.length();
		int d;
		if(s1==s2)
		{
			d=s1;
		}
		else if(s1>s2){
			d=s2;
		}
		else
		{
			d=s1;
		}
		String k="";	
			int i=0,j=0;
		while(i<d && j<d)
		{
			k+=b.charAt(i);
			k+=c.charAt(j);
			i++;
			j++;
			
		}
		while(i<b.length())
		{
			k+=b.charAt(i);
			i++;
		}
		while(j<c.length())
		{
			k+=c.charAt(j);
			j++;
		}
		System.out.println("After combining the character from two String");
		System.out.println(k);
	}
}
