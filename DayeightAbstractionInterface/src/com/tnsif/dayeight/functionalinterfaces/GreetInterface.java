// Program to demonstrate Functional Interface - Greet Interface
package com.tnsif.dayeight.functionalinterfaces;

@FunctionalInterface
public interface GreetInterface {
	
	public String greet();
	
	
	
	// default method
		default void method1()
		{
			System.out.println("Default method");
		}
		
		// static method
		static void method2()
		{
			System.out.println("Static method");
		}

}
