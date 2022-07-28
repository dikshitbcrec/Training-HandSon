/*
  Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message

“Piano is playing tan tan tan tan ” for Piano class

“Flute is playing toot toot toot toot” for Flute class

“Guitar is playing tin tin tin ” for Guitar class

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of play method.

Use the instanceof operator to print which object is stored at which index of instrument array.


 */
abstract class Instrument{
	public abstract String Play();
}
class Piano extends Instrument{
	public String Play() {
		return "Piano is Playing Tan Tan Tan" ;
	}
}
class Flute extends Instrument{
	public String Play() {
		return "Flute is playing toot toot toot toot" ;
	}
}
class Guitar extends Instrument{
	public String Play() {
		return "Guitar is playing tin tin tin" ;
	}
}

public class Q6 {
	public static void main(String[] args) {
		Instrument []in=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			int ran=(int)(Math.random()*(3-1+1)+1);
			switch(ran)
			{
			case 1: in[i]=new Piano();
				break;
			case 2: in[i]=new Flute();
			break;
			case 3: in[i]=new Guitar();
			break;
			}
		}
		for(int i=0;i<10;i++)
		{
			if(in[i] instanceof Piano)
			{
				System.out.println(in[i].Play());
			}else if(in[i] instanceof Flute)
			{
				System.out.println(in[i].Play());
			}
			else if(in[i] instanceof Guitar)
			{
				System.out.println(in[i].Play());
			}
		}
		
	}

}
