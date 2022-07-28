import java.util.*;

//Implement the assignment 1 using Vector
public class Q3 {
public static void main(String[] arg)
{
	List<String> l= new Vector<>();
	l.add("January");
	l.add("February");
	l.add("March");
	l.add("April");
	l.add("May");
	l.add("June");
	l.add("July");
	l.add("August");
	l.add("September");
	l.add("October");
	l.add("November");
	l.add("December");
	
	Collections.sort(l);
	
	System.out.println(l);
	Iterator<String> itr =l.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	
}
}
