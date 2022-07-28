//Create a base class Fruit with name ,taste and size as its attributes.
//Create a method called eat() which describes the name of the fruit and its taste.
//Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

class Fruit1{
	String Name;
	String taste;
	String size;
	void eat() {
		System.out.println("Pls Eat");
	}
}
class Apple1 extends Fruit1{

	public Apple1(String name, String taste, String size) {
		Name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Eating an Apple");
	}
	
}
class Orange1 extends Fruit1{

	public Orange1(String name, String taste, String size) {
	
		Name=name;
		this.taste=taste;
		this.size=size;
		}
		void eat(){
			System.out.println("Eating an orange");
		}
	}
	
public class Q7 {
public static void main(String[] args) {
	Fruit1 f=new Fruit1();
	f.eat();
	System.out.println("For Orange");
	Orange1 o= new Orange1("Orange","Sour","round");
	System.out.println(o.Name+" "+o.taste+" "+o.size);
	o.eat();
	System.out.println("For Apple");
	Apple1 a=new Apple1("Apple","Sweet","Oval-round");
	System.out.println(a.Name+" "+a.taste+" "+a.size);
	a.eat();
	
}
	
}

