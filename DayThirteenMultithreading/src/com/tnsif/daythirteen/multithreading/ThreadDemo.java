package com.tnsif.daythirteen.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		ChildThread t1 = new ChildThread(5,"First");
		ChildThread t2 = new ChildThread(4,"Second");
		
		t1.start();
		t2.start();
	//	t1.run(); single threaded application
		
		System.out.println("----------------End------------------");
	}

}
