import java.util.Scanner;

public class Fourth {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	char S1=sc.next().charAt(0);
	if(Character.isAlphabetic(S1))
	{
		System.out.println(S1+" is a alphabet");
	}
	else if(Character.isDigit(S1))
	{
		System.out.println(S1+" is a number");
	}
	else
	{
		System.out.println(S1+" is a special character");
	}
}
}
