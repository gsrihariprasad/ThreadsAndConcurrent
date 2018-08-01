package io.sriharilabs.concurrent.AtomicInteger;

 // thread that increments the counter 100000 times.
public class MyThread extends Thread {
	   Counter counter;
	 
	   MyThread(Counter counter){
	      this.counter = counter;
	   }
	   public void run() {
	      for (int x = 0; x < 100000; x++) {
	         counter.incrementCount();
	      }
	   }
	}
	 