package com.dayfive.hybridinheritance;


class Person{
	
	long phno;
    String name;
    
    public void PersonDetails()
    {
    	System.out.println(name+ " "+phno);
    }
}

class Employee extends Person
{
	int empid;
	String position;
	float salary;
	
	public void EmployeeDetails()
	{
		System.out.println(empid+" "+position+" "+salary);
	}
}

class Manager extends Employee
{
	String authority;
	
	public void managerauthority()
	{
		System.out.println(authority);
	}
}

class Client extends Person 
{
	String bond;
	String projects;
	
	public void clientdetails()
	{
		System.out.println();
	}
}

public class HybridInheritanceDemo {

	public static void main(String[] args) {

		
	}

}
