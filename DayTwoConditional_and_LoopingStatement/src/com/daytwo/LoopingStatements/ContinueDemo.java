 package com.daytwo.LoopingStatements;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			//odd numbers are skipped
			if(i%2 != 0)
			{
				continue;
			}
			//Eveen numbers are printed
			System.out.println(i);
		}
		
	}

}
