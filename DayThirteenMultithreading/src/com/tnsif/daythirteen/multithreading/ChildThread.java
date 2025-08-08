//Program to demonstrate creating a Thread class - extending Thread class
package com.tnsif.daythirteen.multithreading;

//Thread class
public class ChildThread extends Thread {
     private int n;
     private String msg;
     
	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		for(int i=1; i<=n; i++)
		{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(msg+i);
		}
	}
     
     
}
