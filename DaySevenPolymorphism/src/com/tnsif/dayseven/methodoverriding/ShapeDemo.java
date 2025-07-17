package com.tnsif.dayseven.methodoverriding;

public class ShapeDemo {

	public static void main(String[] args) {

		// create an array of shape objects
		
		Shape[] shapes = new Shape[2];
		
		// instantiate objetcs of circle, square.
		shapes[0]= new Circle(5.0);
		shapes[1]= new Square(6.0);
		
		//Demonstrate polymorphism by calling draw and erase methods
		
		for(Shape s:shapes)
		{
			s.draw();
			s.erase();
			System.out.println("----------------------");
		}
	}

}
