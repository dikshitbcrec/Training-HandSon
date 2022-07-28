import java.util.ArrayList;
import java.util.Iterator;

/*
1. Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi	
Japan Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/
class Q4{
	public static void main(String[] args)
	{
		Capital c= new Capital();
		c.saveCountryCapital("India","Delhi");
		c.saveCountryCapital("Japan","Tokyo");
		System.out.println("__________Showing M1 List___________");
		System.out.println();
		c.dis();
		System.out.println();
		System.out.println("***************************************");
		System.out.println("Find the Capital");
		System.out.println(c.getCapital("India"));
		System.out.println(c.getCapital("Britian"));
		System.out.println("***************************************");
		System.out.println("Find the Country ");
		System.out.println(c.getCountry("Tokyo"));
		System.out.println(c.getCountry("Britian"));
		System.out.println("***************************************");
		System.out.println();
		System.out.println("COnverting M1 Map to M2 Map in Vice Versa");
		c.KeyValueReverse();
		System.out.println();
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Converting to Arraylist");
		ArrayList<String>st=c.AddCountry();
		System.out.println("Printing All Value through ArrayList");
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
