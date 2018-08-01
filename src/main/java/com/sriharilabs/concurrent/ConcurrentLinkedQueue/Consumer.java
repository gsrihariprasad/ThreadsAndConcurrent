package com.sriharilabs.concurrent.ConcurrentLinkedQueue;

import java.util.LinkedList;

public 	class Consumer implements Runnable {
	 
//	   ConcurrentLinkedQueue<String> queue;
//	   Consumer(ConcurrentLinkedQueue<String> queue){
//	      this.queue = queue;
//	   }
	
	 LinkedList<String> queue;
	   Consumer(LinkedList<String> queue){
	      this.queue = queue;
	   }
	   @SuppressWarnings("static-access")
	public void run() {
	      String str;
	      System.out.println("Consumer Started");
	      for (int x = 0; x < 10; x++) {
	         while ((str = queue.poll()) != null) {
	            System.out.println("Removed: " + str);
	         }
	         try {
	            Thread.currentThread().sleep(500);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
	      }
	   }
	}