import java.util.Scanner;

public class Six {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char S1=sc.next().charAt(0);
		if(Character.isLowerCase(S1))
		{
			System.out.println(Character.toUpperCase(S1));
		}else
		{
			System.out.println(Character.toLowerCase(S1));
		}
		
		
	}
}
