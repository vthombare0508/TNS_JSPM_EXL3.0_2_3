package com.tnsif.dayeleven.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		System.out.println(number+number % 2 == 0 ? "is Even " : " is Odd");
		}
		catch(InputMismatchException i)
		{
			System.out.println(i.getMessage());
		}
		
		finally {
			sc.close();
			System.out.println("Connection closed");
		}
		
	}
	

}
