package com.tnsif.daysix.usingfinal;

// class with final method
public class FinalMethod {

	public FinalMethod() {
		System.out.println("This is a default constructor.");
	}

	final int a = 50;
	
	final void show()
	{
		System.out.println("Value of a: "+a);
	}
	
}
