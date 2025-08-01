package com.tnsif.dayeight.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		
		Student s = new Student(101, "Naaz",12000,"Java");

		if(s instanceof Registrable)
		{
			System.out.println("Student is registered for the course");
		}
		else
		{
			System.out.println("Student is not registered for the course");
		}
		
		
		
		Teacher t = new Teacher();
		
		if(t instanceof Registrable)
		{
			System.out.println("Teacher is registered for the course");
		}
		else
		{
			System.out.println("Teacher is not registered for the course");
		}
	}

}
