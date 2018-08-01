package io.sriharilabs.concurrent.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;
//class that uses AtomicInteger for counter
public class Counter {
	 
	   private AtomicInteger count = new AtomicInteger(0);
	 
	   public void incrementCount() {
	      count.incrementAndGet();
	   }
	 
	   public int getCount() {
	     return count.get();
	   }
	}