import java.util.*;
public class Treeseta {

	TreeSet<String> k=new TreeSet<>();
	
	
	void add(String h1) {
		k.add(h1);
	}
	
	void display() {
		Iterator itr=k.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	void reverse() {
		 
		 Iterator itr1=k.descendingIterator();
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
	}
	
	
	String check(String d1)
	{
		 Iterator itr=k.descendingIterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(d1))
			{
				return "Value Exist";
			}
		}
		return "Value Doesn't Exist";
	}
	
	
	
}
