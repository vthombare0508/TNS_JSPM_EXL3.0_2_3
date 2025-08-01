//Program to demonstrate Wrapper Classess
package com.tnsif.daynine.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {

		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		
		int b= i.intValue();
		System.out.println(b);
		
		// Autoboxing
		
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
		
		String s = "11";
		String s1 = "10";
		System.out.println(s+s1);
		int x = Integer.parseInt(s);
		int y = Integer.parseInt(s1);
		int add= x+y;
		System.out.println(add);
	}

}
