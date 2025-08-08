package com.tnsif.dayfourteen.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueDemo {

	public static void main(String[] args) {

		Deque<Integer> i = new ArrayDeque<Integer>();
		Deque<String> s = new ArrayDeque<String>();
		
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("two");
		s.removeLastOccurrence("two");
		System.out.println(s);
		
		i.add(10);
		i.add(7);
		i.add(78);
		i.add(7);
		i.addFirst(67);
		i.addLast(45);
		i.removeLast();
		
		i.removeFirst();
		System.out.println(i);
	}

}
