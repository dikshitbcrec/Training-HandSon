/*
 
6) Write a Program to take care of Number Format Exception if user enters
 values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the 
user while executing the program.
In the same Program write your own Exception classes to take care of 
Negative values and values out of range (i.e. other than in the range of 0-100)

 */
public class Q5 {
	String Name="";
	int sub1;
	int sub2;
	int sub3;
	Q5(String Name,String sub1,String Sub2,String sub3)
	{
		try {
			this.Name=Name;
			this.sub1=Integer.parseInt(sub1);
			this.sub2=Integer.parseInt(Sub2);
			this.sub3=Integer.parseInt(sub3);
			  try {
				   if(this.sub1 < 0 || this.sub2 < 0 || this.sub3 < 0) 
				   {
					 throw new NegativeValuesException();
				   }
				   if(this.sub1 > 100 || this.sub2 > 100 || this.sub3 > 100)
				   {
					   throw new PostiveValuesException();
				   }
				   
				   System.out.println("Student Name : "+this.Name);
				   System.out.println("Subjet "+this.sub1+" "+this.sub2+" "+this.sub3);
				   System.out.println("Average of the 3 subject is : "+(float)(this.sub1+this.sub2+this.sub3)/3);
				   System.out.println("Successfully completed");
			   } 
			   catch (NegativeValuesException e)
			   {
				   e.printStackTrace();
			   	} 
			  catch (PostiveValuesException e)
			  { 
				e.printStackTrace();
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("NumberFormatException");
		}
	}
   
	
	public static void main(String[] args) {
	   Q5 q=new Q5("Dikshit","98","100","100");
	   System.out.println("*************next***********");
	   Q5 d=new Q5("Ramesh","-20","101","100");
	   System.out.println("*************next***********");
	   Q5 e=new Q5("Ramesh","20","101","100");
	 
	   
   }
}
