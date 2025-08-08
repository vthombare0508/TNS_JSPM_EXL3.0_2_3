package com.tnsif.dayeleven.exceptionhandling;

import java.io.IOException;

public class ChechedExceptionDemo {

	public static void main(String[] args) {

		try {
			String str = CheckedException.acceptText();
			System.out.println("Your String is : "+ str);
		} catch (IOException e) {
			System.out.println("an error occured while reading input file : "+ e.getMessage());
		}
	}

}
