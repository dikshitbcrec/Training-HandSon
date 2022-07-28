import java.util.*;
public class Q2 {
public static void main(String[] args)
{
	
LinkedList<String> l= new  LinkedList<>();
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
System.out.println("head : "+l.getFirst());
System.out.println("last : "+l.getLast());
System.out.println("Removing last element : "+l.pollLast());
Iterator<String> itr=l.iterator();
System.out.println("Printing all Element");
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println("------------------------------------------------");
System.out.println("Printing all Element using Method 2");
for(int i=0;i<l.size();i++)
{
	System.out.println(i+"  "+l.get(i));
}
	
}
}
