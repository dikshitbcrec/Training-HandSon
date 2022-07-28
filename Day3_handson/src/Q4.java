//4)Create a class named ‘Animal’ which includes methods like eat() and sleep().
//Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
//Create an instance of Animal class and invoke the eat and sleep methods using this object.
//Create an instance of Bird class and invoke the eat, sleep and fly methods using 
//this obCreate a class named ‘Animal’ which includes methods like eat() and sleep().
class Animal{
	void eat()
	{
		System.out.println("Anima eat");
	}
	void sleep()
	{
		System.out.println("Animal sleep");
		
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird Eat");
	}
	void sleep() {
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("Bird Fly");
	}
}
public class Q4 {
public static void main(String[] args)
{
	Animal A=new Animal();
	System.out.println("Animal class");
	A.eat();
	A.sleep();
	System.out.println();
	System.out.println("Bird class");
	Bird B=new Bird();
	B.eat();
	B.sleep();
	B.fly();
}
}
