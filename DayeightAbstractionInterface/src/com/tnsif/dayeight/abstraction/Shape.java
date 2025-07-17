//Program to define abstract class
package com.tnsif.dayeight.abstraction;

abstract public class Shape {
	
	protected float area;
	
    // abstract method
	abstract void calArea();
	
	//concrete method
	 void show()
	{
		System.out.println("Area of Shape is "+area);
	}
	

}
