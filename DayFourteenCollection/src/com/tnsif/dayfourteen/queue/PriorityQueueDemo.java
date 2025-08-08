package com.tnsif.dayfourteen.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(78);
		q.add(30);
		q.add(1);
		q.add(21);
		
		System.out.println(q);
	}

}
