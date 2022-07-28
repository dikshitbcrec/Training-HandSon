import java.util.Scanner;
/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".

If the input is "America", then the output is "America"
*/
public class Q7 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if(s1.charAt(0)=='x' && s1.charAt(s1.length()-1)=='x')
		{
			System.out.println(s1.substring(1,s1.length()-1));
		}
		else
		{
			System.out.println(s1);
		}
	}
}
