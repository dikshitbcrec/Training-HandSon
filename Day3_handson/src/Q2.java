//Create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1,int num2)
//This method should return num1 to the power num2.
//2. A static method called powerDouble(double num1,int num2).
//This method should return num1 to the power num2.
//3. Invoke both the methods and test the functionalities.


class Calculator{
	static int powerint(int num1,int num2) {
		System.out.println("Power of Integer");
		return (int)Math.pow(num1, num2);
	}
	static double powerdouble(double num1,double num2)
	{
		System.out.println("Power of double");
		return Math.pow(num1,num2);
	}
}
public class Q2 {
	public static void main(String[] args)
{		System.out.println(Calculator.powerint(2, 4));
		System.out.println(Calculator.powerdouble(2.5, 4.6));
	}
	
}
