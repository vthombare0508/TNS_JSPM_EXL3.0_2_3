//Program to demonstrate Subclass circle
package com.tnsif.dayseven.methodoverriding;

public class Circle extends Shape{

	private double radius;

	// constructor for circle
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// override draw method for circle
	
	@Override 
	public void draw()
	{
		System.out.println("Drawing a circle with radius "+ radius);
	}
	
	
	// override erase method for circle
	
		@Override 
		public void erase()
		{
			System.out.println("Erasing a circle with radius "+ radius);
		}
	
	
	
	
	
	
	
	
	
	
}
