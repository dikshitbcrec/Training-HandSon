/*
 * Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.

In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)

7) A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered”
Example2)
i/p:Mini,India
o/p:User registration done successfully

 */



class UserRegistration{
	String Name="";
	String country="";
	UserRegistration(String Name,String Country)
	{
		this.Name=Name;
		try {
			if(Country.equals("India"))
			{
				this.country=Country;
				System.out.println("User registration done successfully");
			}
			else
			{
				throw new InvalidCountryException();
			}
		}catch(InvalidCountryException e)
		{
			//e.printStackTrace();
		}
	}
	
	
	
}

public class Q6 {
	public static void main(String[] args)
	{
		UserRegistration q = new UserRegistration("Dikshit","India");
				System.out.println("------------------------------");
				
				UserRegistration u = new UserRegistration("Mickey","US");
	}
}
