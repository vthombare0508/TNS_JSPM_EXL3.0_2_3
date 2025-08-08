package com.tnsif.dayeleven.exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4,5};
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.getMessage());
			
		}
		
	}

}
