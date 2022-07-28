import java.util.HashSet;
import java.util.Iterator;

///Write a program to store a group of employee names into a HashSet
//, retrieve the elements one by one using an Iterator.
public class Q6 {
public static void main(String[] args)
{
	HashSet<String> h1=new HashSet<>();
	h1.add("Hello");
	h1.add("hike");
	h1.add("welcome");
	h1.add("1");
	h1.add("Kumar");
	Iterator<String> itr=h1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
