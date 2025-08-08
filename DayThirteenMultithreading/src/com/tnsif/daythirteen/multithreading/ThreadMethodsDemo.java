package com.tnsif.daythirteen.multithreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {

		ChildThread t1 = new ChildThread(5,"First"); // creating child thread object
		ChildThread t2 = new ChildThread(10,"Second"); // creating child thread object
	
	   t1.start();
	   t2.start();
	   
	   System.out.println("T1 is alive or not? "+ t1.isAlive());
	   Thread.currentThread().setName("Parent Thread"); // assign name to thread
	  // Thread.currentThread().setPriority(Thread.MIN_PRIORITY);  // changing priority
	   System.out.println(Thread.currentThread());// returns current thread
	   // t1.setPriority(4);
	    System.out.println(t1.getPriority());
	    
	    try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println("--------End------------");
	}
	
	

}
