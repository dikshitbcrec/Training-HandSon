import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		char S1=sc.next().charAt(0);
		char S2=sc.next().charAt(0);
		if(S1 <S2)
		{
			System.out.println(S1+ " " +S2);
		}
		else
		{
			System.out.println(S2+ " " +S1);
		}
		
		
		 
	}
}
