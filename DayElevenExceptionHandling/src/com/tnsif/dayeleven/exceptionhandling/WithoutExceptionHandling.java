package com.tnsif.dayeleven.exceptionhandling;

public class WithoutExceptionHandling {
	
	public static void main(String[] args)
	{
		System.out.println("The Program continues....");
		
     try {
	int div = 100/10;
	System.out.println("Div = "+ div);
         }
        catch(ArithmeticException a)
     {
        //	System.out.println(a.getMessage());
        System.out.println("Number divided by zero.");	
     }
     System.out.println("Exception Handling");
	}

}
