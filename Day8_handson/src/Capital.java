import java.util.*;
import java.util.Map.Entry;
//Country Value - Capital
//Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
//Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.

public class Capital {
 HashMap<String,String> M1=new HashMap<>();
void saveCountryCapital(String Country,String cap)
 {
	 M1.put(Country, cap);
 }
	void dis() {
		Set<Entry<String,String>>set=M1.entrySet();
		Iterator<Entry<String,String>> itr1=set.iterator();
		while(itr1.hasNext())
		{
			Map.Entry<String,String>k=itr1.next();
			System.out.println(k.getKey()+ " "+k.getValue());
		}
	}


 String getCapital(String Country){
	 Set<Entry<String,String>>set=M1.entrySet();
	 Iterator<Entry<String,String>> itr=set.iterator();
	 while(itr.hasNext())
	 {
		 Map.Entry<String, String>m=itr.next();
		 if(m.getKey().equals(Country))
		 {
			 return m.getValue();
		 }
	 }
	 return Country+" is not in the list";
 }
 String getCountry(String cap)
 {
	Set<Entry<String,String>>set1=M1.entrySet();
	Iterator<Entry<String,String>> itr=set1.iterator();
	while(itr.hasNext())
	{
		Map.Entry<String, String> k=itr.next();
		if(k.getValue().equals(cap))
		{
			return k.getKey();
		}
	}
	return cap+" is not in the List";
 }
 HashMap<String,String> M2=new HashMap<>();
  void KeyValueReverse() {
	  Set<Entry<String,String>> set=M1.entrySet();
	  Iterator<Entry<String,String>> itr=set.iterator();
	  while(itr.hasNext())
	  {
		  Map.Entry<String, String> k=itr.next();
		  M2.put(k.getValue(), k.getKey());
	  }
	  displayM2();
  }
  void displayM2() {
	Set<Entry<String,String>>set=M2.entrySet();
	Iterator<Entry<String,String>> itr1=set.iterator();
	while(itr1.hasNext())
	{
		Map.Entry<String,String>k=itr1.next();
		System.out.println(k.getKey()+ " "+k.getValue());
	}
	
}
 ArrayList<String>cname=new ArrayList<>();
 ArrayList<String> AddCountry(){
	 Set<Entry<String,String>>set=M1.entrySet();
	 Iterator<Entry<String,String>> itr=set.iterator();
	 while(itr.hasNext())
	 {
		 Map.Entry<String, String>m=itr.next();
		 cname.add(m.getKey());
	 }
	 return cname;
 }
}
