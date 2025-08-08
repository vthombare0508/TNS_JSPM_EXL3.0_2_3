package com.tnsif.dayeleven.exceptionhandling;

public class NestedTryBlockEx {
	
	public static int divide(int x, int y)
	{
		int z=0;
		z = x/y;
		System.out.println("Result of division is z: "+ z);
		return z;
	}

	public static void main(String[] args) {

		int x,y,z;
		try {
		x= Integer.parseInt(args[0]);
		y= Integer.parseInt(args[1]);
		
		try {
		z=divide(x,y);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		}
		catch(NumberFormatException a)
		{
			System.err.println(a.getMessage());
		}
		
		System.out.println("I am out of outer catch block");
		
	}

}
