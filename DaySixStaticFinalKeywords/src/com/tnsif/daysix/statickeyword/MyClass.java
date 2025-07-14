package com.tnsif.daysix.statickeyword;

public class MyClass {
	
	private int section; // non-static or instance variable
	private static int srNo; //static variable
	
	static{
		System.out.println("Static Block");
		srNo=100;
	}

	public MyClass() {
		srNo++;
		section++;
	}


	void data()
	{
		System.out.println("Non-Static Method");
		System.out.println(srNo);
		System.out.println(section);
		System.out.println();
	}
	
	
	static void display()
	{
		System.out.println("Static Method");
		System.out.println(srNo);
		//System.out.println(section);
	}
	
	public static void main(String[] args)
	{
		MyClass c = new MyClass();
		//c.data();
		display();
	}
	
	

}
