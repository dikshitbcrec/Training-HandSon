/*
Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.
*/
public class Q5 {
	public static void main(String[] args)
	{
		Country country= new Country();
		country.SaveCountryNames("India");
		country.SaveCountryNames("SA");
		country.SaveCountryNames("Ger");
		country.SaveCountryNames("NZ");
		country.SaveCountryNames("Russia");
		country.SaveCountryNames("US");
		country.SaveCountryNames("Britian");
		country.SaveCountryNames("MX");
		country.SaveCountryNames("Pol");
		country.SaveCountryNames("France");
		
		country.display();
		System.out.println();
		System.out.println("Search wether Country is in list or not");
		System.out.println();
		System.out.println("India : "+country.getCountry("India"));
		System.out.println("Sri Lanka : "+country.getCountry("Sri Lanka"));
		
		
	}

}
