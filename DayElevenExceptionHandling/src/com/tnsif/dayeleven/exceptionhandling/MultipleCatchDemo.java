package com.tnsif.dayeleven.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {

		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			try {
			System.out.println("Enter First Number:");
			numberOne= sc.nextInt();
			
			System.out.println("Enter Second Number: ");
			numberTwo= sc.nextInt();
			
			numberThree= numberOne/numberTwo;
			
			System.out.println("Division is "+ numberThree);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a.getMessage());
				//a.printStackTrace();
			}
			catch(InputMismatchException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception s)
			{
				System.out.println(s.getMessage());
			}
		}
	}

}
