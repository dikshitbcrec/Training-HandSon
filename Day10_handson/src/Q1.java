import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee e =new Employee(12341,"Ramesh","Rames@yahoo.com","Male",35000f);
	Employee e1 =new Employee(12342,"Ram","Ram@yahoo.com","Male",45000f);
	Employee e2 =new Employee(12343,"Harry","Harry@yahoo.com","Male",25000f);
	Employee e3=new Employee(12344,"Raju","Raju@yahoo.com","Male",85000f);
	Employee e4 =new Employee(12345,"Sandy","Sandy@yahoo.com","Male",65000f);
	Employee e5 =new Employee(12346,"Krish","krisg@yahoo.com","Male",45000f);
	e.GetEmployeeDetails();
	EmployeeDb ed=new EmployeeDb();
	ed.addEmployee(e);
	ed.addEmployee(e1);
	ed.addEmployee(e2);
	ed.addEmployee(e3);
	ed.addEmployee(e4);
	ed.addEmployee(e5);
	System.out.println("Enter Employee-Id to delete his details");
	int emp=sc.nextInt();
	System.out.println("Employee Details deleted :"+ ed.deleteEmployee(emp));
	System.out.println("Enter Employee-Id to show his PaySlip");
	emp=sc.nextInt();
	System.out.println("------------Employee  Pay Slip Details---------------");
	System.out.println(ed.showPaySlip(emp));
	System.out.println("End Of the ArrayList ");
	System.out.println();
	System.out.println("-----------------Starting of Vector Implementation--------------");
	VectorDb vec=new VectorDb();
	vec.addEmployee(e);
	vec.addEmployee(e1);
	vec.addEmployee(e2);
	vec.addEmployee(e3);
	vec.addEmployee(e4);
	vec.addEmployee(e5);
	System.out.println("Enter Employee-Id to delete his details");
	emp=sc.nextInt();
	System.out.println("Employee Details deleted :"+ vec.deleteEmployee(emp));
	System.out.println("Enter Employee-Id to show his PaySlip");
	emp=sc.nextInt();
	System.out.println("------------Employee  Pay Slip Details---------------");
	System.out.println(vec.showPaySlip(emp));
	System.out.println("--------------------End Of the VectorList-------------------------- ");
	System.out.println();
	System.out.println("-----------------Starting of LinkedList Implementation--------------");
	LinkedDb lin=new LinkedDb();
	lin.addEmployee(e);
	lin.addEmployee(e1);
	lin.addEmployee(e2);
	lin.addEmployee(e3);
	lin.addEmployee(e4);
	lin.addEmployee(e5);
	System.out.println("Enter Employee-Id to delete his details");
	emp=sc.nextInt();
	System.out.println("Employee Details deleted :"+ lin.deleteEmployee(emp));
	System.out.println("Enter Employee-Id to show his PaySlip");
	emp=sc.nextInt();
	System.out.println("------------Employee  Pay Slip Details---------------");
	System.out.println(lin.showPaySlip(emp));
	System.out.println("--------------------End Of the LinkedList-------------------------- ");
	System.out.println();
	
	
}
}