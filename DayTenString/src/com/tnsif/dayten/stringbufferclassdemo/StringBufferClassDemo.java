package com.tnsif.dayten.stringbufferclassdemo;

public class StringBufferClassDemo {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("Hello");
		
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		// appending and inserting into StringBuffer
		
		String s;
		int a = 42;
		buffer = new StringBuffer(40);
		s= buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer("I Java");
		buffer.insert(2, "learns");
		
		System.out.println(buffer);
		
		
		//System.out.println(buffer.reverse());
		
		System.out.println(buffer.replace(2, 8, "like"));
		System.out.println(buffer.delete(2, 6));
		
	}

}
