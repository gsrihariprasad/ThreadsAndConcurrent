package io.sriharilabs.concurrent.AtomicInteger;

import java.util.ArrayList;
import java.util.Iterator;

public class CounterTest {
	 
	   public static void main(String[] args) throws InterruptedException {
	 
	      final Counter counter = new Counter();
	 
	      // create 1000 threads
	      ArrayList<MyThread> threads = new ArrayList<MyThread>();
	      for (int x = 0; x < 1000; x++) {
	         threads.add(new MyThread(counter));
	      }
	 
	      // start all of the threads
	      Iterator i1 = threads.iterator();
	      while (i1.hasNext()) {
	         MyThread mt = (MyThread) i1.next();
	         mt.start();
	      }
	 
	      // wait for all the threads to finish
	      Iterator i2 = threads.iterator();
	      while (i2.hasNext()) {
	         MyThread mt = (MyThread) i2.next();
	         mt.join();
	      }
	 
	      System.out.println("Count: " + counter.getCount());
	  }
	}
	 
	
	
