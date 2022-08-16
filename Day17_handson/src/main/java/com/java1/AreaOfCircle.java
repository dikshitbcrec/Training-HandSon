package com.java1;

public class AreaOfCircle implements Area{
			
	private Circumference circum;
	private int radius;
	public AreaOfCircle(int radius) {
		this.radius = radius;
		this.circum =  new CircumferenceOfCircle();
	}

	public double circleArea(){
		return 3.14*radius*radius;
	}

	public double circumferences() {
		return circum.circleStatus(radius);
	}

	

}
