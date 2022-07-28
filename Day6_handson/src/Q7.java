/*
 Write a program to accept name and age of a person 
 from the command prompt(passed as arguments when you execute the class) 
 and ensure that the age entered is >=18 and < 60.
Display proper error messages.
The program must exit gracefully after displaying the error message 
in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
 */
class per{
	String Name;
	int age;
	per(String Name,String ag)
	{
		this.Name=Name;
		try {
			this.age=Integer.parseInt(ag);
			if(age<0)
			{
				throw new NegativeValuesException();
			}
			if(!(age>=18 && age<60))
			{
				throw new InvalidAgeException();
			}
			System.out.println("Successfully Registerd as in this Competetion");
			System.out.println("Name: "+Name);
			System.out.println("Age: "+age);
		}catch(Exception E) {
			E.printStackTrace();
			
		}
	}
}
public class Q7 {
public static void main(String[] args)
{
	per p=new per("A","hike");
	System.out.println("_____________Test 2______________");
	 p=new per("B","0");
	 System.out.println("______________Test 3_____________");
	 System.out.println();
	 p=new per("C","18");
	 System.out.println("______________Test 4_____________");
	 System.out.println();
	 p=new per("D","58");
	 System.out.println("______________Test 5_____________");
	 System.out.println();
	 p=new per("E","60");
	 System.out.println("______________Test 6_____________");
	 System.out.println();
	 p=new per("DIkshit","100");
	
}
}
