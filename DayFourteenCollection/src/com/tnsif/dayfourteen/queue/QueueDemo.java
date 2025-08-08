package com.tnsif.dayfourteen.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(30);
		q.add(1);
		q.add(21);
		System.out.println(q);
		q.clear();
		System.out.println(q.peek());
		System.out.println("After peek()"+ q);
		
		//System.out.println(q.element());
		//System.out.println("After element()"+q);
		
		System.out.println(q.poll());
		System.out.println("After poll()"+ q);
	}

}
