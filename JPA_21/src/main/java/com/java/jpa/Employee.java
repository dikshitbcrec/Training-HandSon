package com.java.jpa;  
import java.util.*;  
  
import javax.persistence.*;  
@Entity  
  
public class Employee {  
  
    @Id  
    //@GeneratedValue(strategy=GenerationType.AUTO)  
    private int e_id;  
    private String e_name;  
      
    @ElementCollection  
    //private List<Address> address=new ArrayList<Address>();
   // private Set<Address> address=new HashSet<Address>();
   private Map<Integer,Address> map=new HashMap<Integer,Address>();

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Map<Integer, Address> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Address> map) {
		this.map = map;
	}  

	
} 
