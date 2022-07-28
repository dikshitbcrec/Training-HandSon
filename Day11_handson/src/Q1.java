import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. 
 The class will 
 print all numbers , 
 even numberrs and 
 number greater than 3 of the numbers in the array list

Step1: create Java main class Java8 Tester

Step2: create a method eval which will take 2 parameters 
(list of numbers from 1 to 9 and predicate condition)

Step3: call the eval method from main 
method to print all the even numbers by passing appropriate parameters

Step4: call the eval method from main method 
to print all the numbers greater than 3 by passing appropriate parameters

Sample output

Print all numbers: 1 2 3 4 5 6 7 8 9
Print even numbers: 2 4 6 8
Print numbers greater than 3:4 5 6 7 8 9
 */
class JavaTester8{
	static void eval(List<Integer> li,Predicate<Integer>pred)
	{
		for(Integer i:li)
		{
			if(pred.test(i))
			{
				System.out.print(i+"\t");
			}
		}
	}
}


public class Q1 {
public static void main(String[] args)
{
	List<Integer> arr=new ArrayList<>();
	for(int i=1;i<=10;i++)
	{
		arr.add(i);
	}
	JavaTester8 j=new JavaTester8();
	System.out.println("Printing all Number");
	j.eval(arr, (num)-> num>0);
	System.out.println();
	System.out.println("Printing all even number");
	j.eval(arr, (num)->num%2==0);
	System.out.println();
	System.out.println();
	System.out.println("Printing all  number greater than 3 : ");
	j.eval(arr, (num)->num > 3);
}
	
	
	
}
