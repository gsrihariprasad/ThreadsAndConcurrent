package com.sriharilabs.concurrent.ConcurrentLinkedQueue;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
	   public static void main(String[] args) {
	      //ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
	      LinkedList<String> queue = new LinkedList<String>();
	      Thread producer = new Thread(new Producer(queue));
	      Thread consumer = new Thread(new Consumer(queue));
	      producer.start();
	      consumer.start();
	  }
}
	 

	 
/****
 Consumer Started
Producer Started
Added: String1
Added: String2
Added: String3
Removed: String1
Removed: String2
Removed: String3
Added: String4
Added: String5
Removed: String4
Removed: String5
Added: String6
Added: String7
Added: String8
Removed: String6
Removed: String7
Removed: String8
Added: String9
Removed: String9

 * 
 * 
 */
