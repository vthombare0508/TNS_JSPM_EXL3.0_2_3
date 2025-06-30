package com.daytwo.conditionalstatements;

public class ElseIfLadderDemo {

	public static void main(String[] args) {
 
		
		int marks = 50;
		
		if (marks>70)
		{
			System.out.println("Selection in 1st cap round");
		}
		else if(marks > 55)
		{
			System.out.println("Selection in 2nd cap round");
		}
		else if(marks > 40)
		{
			System.out.println("Selection in 3rd cap round");
		}
		else
		{
			System.out.println("No Selection");
		}
	}

}
