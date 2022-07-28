import java.util.Scanner;

public class First {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any digit");
		 int digit=sc.nextInt();
		 if(digit==0)
		 {
			 System.out.println(digit+" is zero");
		 }
		 else if(digit>0)
		 {
			 System.out.println(digit+ " is Positive number");
		 }
		 else
		 {
			 System.out.println(digit+ " is Negative number"); 
		 }
		 
}
}
