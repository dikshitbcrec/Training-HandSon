//Implement the assignment 1 using TreeSet
import java.util.*;
public class Q8 {
public static void main(String[] args)
{
	TreeSet<String> l=new TreeSet<>();
	
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
	
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
