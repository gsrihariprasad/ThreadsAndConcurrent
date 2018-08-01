package com.sriharilabs.concurrent.ConcurrentLinkedQueue;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTest {

	
	ConcurrentLinkedQueue<String> clq= new ConcurrentLinkedQueue<String>();
	//LinkedList<String> clq= new LinkedList<String>();
	
	class AddThread implements Runnable{
		public void run() {
			//ads the element to the tail of element
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  ::::   ");
			clq.add("A");
			
			//insert the elements to the tail of element
			clq.offer("B");	
			clq.add("C");	
			clq.add("D");
			clq.offer("E");
			// retrieve and removes the elements from head
			clq.poll();
			//clq.remove();
			
			Iterator<String> itr= clq.iterator();
			while(itr.hasNext()){
				System.out.println(Thread.currentThread().getName()+"  ::::   "+itr.next());
			}
	   }
	}
	
	
	public static void main(String... args){
		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
		   
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
//		   new Thread(new ConcurrentLinkedQueueTest().new AddThread()).start();
	   }
}
