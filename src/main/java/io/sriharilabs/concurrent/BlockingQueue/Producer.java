package io.sriharilabs.concurrent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
	 
	   protected BlockingQueue queue = null;
	 
	   public Producer(BlockingQueue queue) {
	      this.queue = queue;
	   }
	 
	   public void run() {
	      try {
	         queue.put("String ONE");
	         Thread.sleep(3000);
	         queue.put("String TWO");
	         Thread.sleep(3000);
	         queue.put("String THREE");
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }
	   }
	}
	 
