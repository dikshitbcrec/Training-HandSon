/*
 Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and
getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate
that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.
The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings
a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();
 */
abstract class GeneralBank{
	abstract void getSavingInterest();
	abstract void getFixedDepositInterset();
}
class ICICBank extends GeneralBank{
	void getSavingInterest() {
		System.out.println("Saving 4%");
	}
void getFixedDepositInterset() {
	System.out.println("Fixed 8.5%");
	}
}
class KotMBank extends GeneralBank{
	void getSavingInterest() {
		System.out.println("Saving 6%");
	}
void getFixedDepositInterset() {
	System.out.println("Fixed 9%");
	}
}


public class Q4 {
 public static void main(String[] args)
 {
	 ICICBank i=new ICICBank();
	 System.out.println("For ICIC BANK");
	 i.getFixedDepositInterset();
	 i.getSavingInterest();
	 System.out.println("***********");
	 
	 
	 System.out.println("For Kotak BANK");
	 KotMBank k= new KotMBank();
	 k.getFixedDepositInterset();
	 k.getSavingInterest();
	 System.out.println("************************");
	 
	 
	 System.out.println("For General Bank for icic");
	 GeneralBank g=new ICICBank();
	 g.getSavingInterest();
	 g.getFixedDepositInterset();
	 System.out.println("************************");
	 
	 System.out.println("For General Bank for Kotak bank");
	 GeneralBank j=new KotMBank();
	 j.getSavingInterest();
	 j.getFixedDepositInterset();
	 
	 
	 
 }

	
	
}
