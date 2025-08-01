package com.tnsif.dayten.String;

public class StringOperationsDemo {

	public static void main(String[] args) {

		String s1 = new String("   Indian   ");
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));
		String s3 = s1.trim();
		System.out.println(s3.length());
		
		System.out.println(s1.isEmpty());
		
		// String Comparison
		
	  	String S4 ="good morning";
	  	String S5 = "Good Morning";
	  	
	  	System.out.println(S4 +"equals "+S5+ "= "+ S4.equals(S5));
	  	System.out.println(S4 +"equals "+S5+ "= "+ S4.equalsIgnoreCase(S5));
		System.out.println(S4 +"equals "+S5+ "= "+ S4 == S5);
		System.out.println(S4.charAt(2));
		
		System.out.println(S4.compareTo(S5));
		
	}

}
