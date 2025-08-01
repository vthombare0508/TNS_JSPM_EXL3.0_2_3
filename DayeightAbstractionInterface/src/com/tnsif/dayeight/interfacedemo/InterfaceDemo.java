package com.tnsif.dayeight.interfacedemo;

public interface InterfaceDemo {
	
	// abstract
	void show();
	
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
