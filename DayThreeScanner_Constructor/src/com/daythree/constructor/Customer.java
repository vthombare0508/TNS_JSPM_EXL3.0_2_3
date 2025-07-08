package com.daythree.constructor;

public class Customer {
	
	// default constructor

	public Customer()
	{
		System.out.println("Default constructor");
	}
	
	//parametrized constructor
	
	public Customer(int id, String name, int age)
	{
		System.out.println("Parametrized constructor");
		System.out.println(id+" "+name+ " "+age);
	}
	public static void main(String[] args) {

		Customer obj1 = new Customer();
		Customer obj2 = new Customer(101, "Vishal", 22);
	}

}
