package com.daytwo.conditionalstatements;

public class SwitchDemo {

	public static void main(String[] args) {

		char x='L';
		
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println("This code contains letters");
			break;
		case 'd':
		case 'D':
			System.out.println("This code contains digits");
			break;
		case 's':
		case 'S':
			System.out.println("This code contains symbols");
			break;
		case 'w':
		case 'W':
			System.out.println("This code contains whitespaces");
			break;
		default:
			System.out.println("this code doesn't contain any letter, symbol,digit or whitespace");
			break;
		
		}
	}

}
