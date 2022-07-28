import java.util.Scanner;
//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. 
//Create an object of the Box class and test the functionalities.
class Box{
	float width,height,depth;
	Box(float width,float height,float depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume()
	{
		return width*height*depth;
	}
	
}
public class Q1 {
	public static void main(String[] args)
	{
		System.out.println("Enter the height: ");
		Scanner sc=new Scanner(System.in);
		float height=sc.nextFloat();
		System.out.println("Enter the width: ");
		float width=sc.nextFloat();
		System.out.println("Enter the deptht: ");
		float depth=sc.nextFloat();
		Box b= new Box(width,height,depth);
		System.out.println(b.volume());
	}
}
