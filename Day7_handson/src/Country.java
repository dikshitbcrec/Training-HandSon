/*
Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Country {
HashSet<String> H1=new HashSet<>();
public HashSet<String> SaveCountryNames(String h1){
	H1.add(h1);
	return H1;
	
}


void display() {
	System.out.println("________Display Country Name_______");
	Iterator<String> it=H1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
public String getCountry(String CountryName)
{
	Iterator<String> it=H1.iterator();
	while(it.hasNext())
	{
		if(it.next().equals(CountryName))
		{
			return "Country Name Exist "+CountryName;
		}
	}
	return null;
}

}
