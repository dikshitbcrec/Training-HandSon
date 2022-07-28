import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a Digit");
	 int dig=sc.nextInt();
	 if(dig%2==0)
	 {
		 System.out.println(dig+" is a Even Number");
	 }
	 else
	 {
		 System.out.println(dig+" is a Odd Number");
	 }
	 
}
}
