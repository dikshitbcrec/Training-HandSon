//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),weight(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.
import java.util.Scanner;
class Patient{
	String name;
	double height,weight;
	Patient(String name,double height,double weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double BMI()
	{
		return weight / (height*height);
	}
	
	
}
public class Q3 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Patient Name");
	String name=sc.nextLine();
	System.out.println("Enter height in meter");
	double height=sc.nextDouble();
	System.out.println("Enter Weight");
	double weight=sc.nextDouble();
	Patient p=new Patient(name,height,weight);
	System.out.println(p.name+" having BMI of "+p.BMI());
	
	
}
}
