import java.util.Scanner;

/*Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:abcXY123XYijk,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11
*/
public class Q3 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String []k=s.split(",");
	String x=k[0];
	String y=k[1];
	String n="";
			for(int i=0;i<=x.length()-y.length();i++)
			{		String tem=x.substring(i,y.length()+i);
					 if(tem.equals(y))
					 {
						 if(i>0 && i<x.length()-1)
						 {		
						 n+=x.charAt(i-1);
						 }
						 if(i>=0 && y.length()+i<x.length())
						 {
							 n+=x.charAt(y.length()+i);
							 
						 }
					 }
					
				
			}
	System.out.println(n);
}
}
