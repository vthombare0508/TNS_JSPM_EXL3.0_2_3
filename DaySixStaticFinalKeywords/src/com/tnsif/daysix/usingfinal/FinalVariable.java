package com.tnsif.daysix.usingfinal;

public class FinalVariable {
	
	// final instance variable
	
	final long x = 100;
	 
	// declare a static blank final variable
	
	final static int y = 20;
	
	
	void display() {
		//x=20; cannot reassign final variable
		System.out.println(x);
	}
	
	
	{
		System.out.println("Final Keyword");
	}
	
	
	
 public FinalVariable() {
		super();
	}



public static void main(String[] args)
{
	FinalVariable f = new FinalVariable();
	f.display();
}
	
	
}
