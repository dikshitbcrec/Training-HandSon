//Create a school application with a class called Person. Create name and dateOfBirth as member variables.
//Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
//and the subject that the teacher teaches.
//Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
//Create a class called College Student that inherits from Student class. This class will have collegeName,
//the year in which the student is studying (first/second/third/fourth) etc.
//Create objects of each of this classes, invoke and test the methods that are available in these classes.
class Person1{
	String Name,Dob;
	Person1(String Name,String Dob)
	{
		this.Name=Name;
		this.Dob=Dob;
	}
	
}
class Teacher extends Person1{
	double salary;
	String subject;
	Teacher(String Name,String Dob,String subject,double salary)
	{
		super(Name,Dob);
		this.salary=salary;
		this.subject=subject;
	}
	
}
class Student extends Person1{
	String st_id;
	Student(String Name,String Dob,String st_id)
	{
		super(Name,Dob);
		this.st_id=st_id;
	}
}
class College extends Student{
	String clgName;
	String year;
	College(String Name,String Dob,String St_id,String clgName,String year)
	{
		super(Name,Dob,St_id);
		this.clgName=clgName;
		this.year=year;
		
	}	
}


class Q6{
	public static void main(String[] args)
	{	System.out.println("********Person Class***********");
		
		Person1 p= new Person1("Ramesh","07/09/2000");
		System.out.println("Person Name :"+p.Name);
		System.out.println("Date of birth :"+p.Dob);
		System.out.println();
		System.out.println("*************End Of the Class**************");
		System.out.println();
		
		
		
		System.out.println("********Teacher Class***********");
		System.out.println();
		Teacher t= new Teacher("N.K ","02/02/1974","Java Tutor",50000.0);
		System.out.println("Teacher Name :"+t.Name);
		System.out.println("Date of birth :"+t.Dob);
		System.out.println("Subject :"+t.subject);
		System.out.println("Salary : "+t.salary);
		System.out.println();
		System.out.println("************End Of the class***************");
		System.out.println();
		
		System.out.println("********College Class***********");
		College c= new College("Dikshit Kumar","07/09/XXXX","2301518","BCREC","Final Year");
		System.out.println("Student Name :"+c.Name);
		System.out.println("Date of birth :"+c.Dob);
		System.out.println("Student I'd : "+c.st_id);
		System.out.println("College : "+c.clgName);
		System.out.println("Year : "+c.year);
		System.out.println("************End Of the class***************");
		System.out.println();
	}
}