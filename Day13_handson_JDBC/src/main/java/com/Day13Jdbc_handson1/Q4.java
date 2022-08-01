package com.Day13Jdbc_handson1;

public class Q4 {
	public static void main(String[] args) throws Exception {
		DAOClass d1= new DAOClass();
		int n=Integer.parseInt(args[0]);
		switch(n)
		{
		case 1: 
		int rollno=Integer.parseInt(args[1]);
		
		String Name=args[2].toUpperCase();
		
		String Standard=args[3].toUpperCase();
		
		String dob=args[4].toUpperCase();
		double d= Double.parseDouble(args[5]);
		System.out.println(d1.insert(rollno,Name,Standard,dob,d));
		break;
		case 2: 
			int roll=Integer.parseInt( args[1]); 
			System.out.println(d1.delete(roll));
		break;
		case 3: 
			int rol=Integer.parseInt(args[1]);
			double fees=Double.parseDouble(args[2]);
			System.out.println(d1.modifying(rol,fees));
		break;
		case 4:
			try{
				int rol1=Integer.parseInt(args[1]);
				d1.displaying(rol1);
			}catch(Exception e){
				d1.displaying();
			}
			
				
		break;
		}
		
		
	}
}
