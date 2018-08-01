package io.sriharilabs.concurrent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	 
	   public static void main(String[] args) throws Exception {
	 
	      BlockingQueue queue = new ArrayBlockingQueue(5);
	 
	      Producer producer = new Producer(queue);
	      Consumer consumer = new Consumer(queue);
	 
	      System.out.println("Starting Producer.");
	      new Thread(producer).start();
	      System.out.println("Starting Consumer.");
	      new Thread(consumer).start();
	 
	   }
	}