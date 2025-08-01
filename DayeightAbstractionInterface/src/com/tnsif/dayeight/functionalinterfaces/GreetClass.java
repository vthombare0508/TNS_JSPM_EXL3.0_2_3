//Program to demonstrate Functional Interface - child Class
package com.tnsif.dayeight.functionalinterfaces;

public class GreetClass implements GreetInterface{

	@Override
	public String greet() {
		return "Welcome to the world";
	}

}
