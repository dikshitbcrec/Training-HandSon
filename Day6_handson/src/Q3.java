/*
  Write a class MathOperation which accepts 5 integers through command line. 
Create an array using these parameters. 
Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
 */
public class Q3 {
public static void main(String[] args)
{
	String []a= args[0].split(",");
	try {
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int k=Integer.parseInt(a[i]);
			sum+=k;
			
		}
		int d=sum/a.length;
		System.out.println("The sum of the the array is : "+sum);
		System.out.println("The average of the number is : "+d);
		
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NumberFormatException ae)
	{
		System.out.println(ae);
	}
	catch(Exception k) {
		System.out.println(k);
	}
}
}
