import java.util.Scanner;
//Write a Program to check whether a given String is Palindrome or not.
public class Q1_String {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		boolean flag=false;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println(s+" is not palindrome");
		}else {
			System.out.println(s+" is palindrome");
		}
		
	}
	
	
	
}
