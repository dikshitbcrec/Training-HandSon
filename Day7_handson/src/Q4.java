/*
 Write a program that will have a Vector which is capable of storing 
 Employee objects. 
 Use an Iterator and enumeration to list all the elements of the Vector.
 */
import java.util.*;




public class Q4 {
public static void main(String[] args)
{
	Vector<Employee>vec=new Vector<>();
	vec.add(new Employee("k Kumar","12345",20,"India"));
	vec.add(new Employee("Ram Kumar","1245",20,"kol"));
	vec.add(new Employee("hike Kumar","2345",20,"SA"));
	vec.add(new Employee("Kumar","1235",20,"BLR"));
	vec.add(new Employee("Dt Kumar","123",20,"Noida"));
	vec.add(new Employee("mt Kumar","145",20,"Nagpur"));
	
	for(Employee i:vec)
	{
		System.out.println(i.Name+" "+i.empno+" "+i.age+ " "+i.location);
	}
	Enumeration<Employee> e=vec.elements();
	System.out.println("_______________Method 2 for printing using Enumertion______");
	while(e.hasMoreElements())
	{       Employee ek=e.nextElement();
		System.out.println(ek.Name+" "+ek.empno+" "+ek.age+ " "+ek.location);
	}

	System.out.println("_______________Method 3 for printing using Iterator______");
	
	Iterator<Employee> itr=vec.iterator();
	while(itr.hasNext())
	{	 Employee ek=itr.next();
		System.out.println(ek.Name+" "+ek.empno+" "+ek.age+ " "+ek.location);
	}
}
}
