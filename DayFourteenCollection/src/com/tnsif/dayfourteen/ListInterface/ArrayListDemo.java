package com.tnsif.dayfourteen.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List list = new ArrayList(); // dynamic binding
		
		System.out.println(list.isEmpty());
		list.add(10);
		list.add(20);
		list.add("Siddhant");
		list.add(false);
		list.add(10);
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("Is list contains 10 ?" +list.contains(10));
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("Siddhant");
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.indexOf(10));
		
		System.out.println(list.remove(0));
		
		list.clear();
		System.out.println(list);
		
		//Generics
		
		List<String> names = new ArrayList<String>();
		
		names.add("Pallavi");
		names.add("Om");
		names.add("Priya");
		names.add("Pooja");
		names.add("Shubham");
		
		//names.add(10);
		//names.add(null);
		
		System.out.println(names);
		
	//	System.out.println(names.reversed());
	//	Collections.reverse(names);
	//	System.out.println(names);
	
		Collections.sort(names);
		System.out.println(names);
		
		
		// Traversing a List
		
		Iterator<String> i = names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			
			if(nm.equals("Pooja"))
			{
				i.remove();
				System.out.println(nm);
			}
			
		}
		
		System.out.println(names);
	}

}
