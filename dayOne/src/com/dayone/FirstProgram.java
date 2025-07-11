package com.dayone;

import com.tnsif.dayfour.accessmodifiers.Base;

public class FirstProgram extends Base {
	
	public static void main(String[] args)
	{
		System.out.println("Hello World" + " " + 12);
		System.out.println("Java Programming");
		System.out.print(234 + 10);
		
		
		Base b = new Base();
		System.out.println(b.getVarProtected());
		b.methodPublic();
		
		
		
	}
	
	

}
