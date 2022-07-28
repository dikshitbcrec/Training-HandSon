import java.util.*;
/*
 3) Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :

a) Reverse the elements of the Collection.

b) Iterate the elements of the TreeSet using Iterator.

c) Check if a particular element exists or not.


 */
public class Q7 {
 public static void main(String[] args)
 {
	 Treeseta k= new Treeseta();
	k.add("hike");
	 k.add("hello");
	 k.add("1");
	 k.add("2");
	 k.add("3");
	 k.add("4");
	 System.out.println("Display In reverse order");
	 k.reverse();
	 System.out.println("__End of Reverse Order__");
	 System.out.println("DIsplay all element using Iterator");
	 k.display();
	 System.out.println("_______________________________");
	 System.out.println("Check if a Particular element exist or not");
	 System.out.println(k.check("hello"));
	 System.out.println(k.check("hiii"));
	 
 }
}
