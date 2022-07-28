import java.util.Scanner;

//---------------Write a program to check if a given number is prime or not.
public class Q3 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
boolean flag=false;
for(int i=2;i<=(int)Math.sqrt(n);i++)
{
	if(n%i==0) {
		flag=true;
	}
}
if(flag)
{
	System.out.println(n+" is not Prime number");
}else
{
	if(n==1) {
		System.out.println(n+" is not Prime number");
	}else {
	System.out.println(n+" is Prime number");
	}
}


}
}
