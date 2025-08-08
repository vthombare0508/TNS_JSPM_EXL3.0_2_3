package com.tnsif.dayfourteen.ListInterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(null);
		list.addFirst(40);
		list.addLast(90);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		// Traversing in LinkedList
		
		ListIterator i = list.listIterator(); 
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	

}
