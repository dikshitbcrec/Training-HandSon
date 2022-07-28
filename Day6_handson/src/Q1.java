
/*
 Get an input String from user and parse it to integer, 
 if it is not a number it will throw number format exception Catch it and print
 "Entered input is not a valid format for an integer." or 
 else print the square of that number. (Refer Sample Input and Output).
 */
public class Q1 {
public static void main(String[] args)
{
	
	try {
		int a=Integer.parseInt(args[0]);
		System.out.println("The square of the number is " +(int)Math.pow(a, 2));
		System.out.println("The work has been done successfully");
	}
	catch(NumberFormatException e)
	{	System.out.println(e);
		System.out.println("Entered input is not a valid format for an integer");
	}
	
	
}
}
