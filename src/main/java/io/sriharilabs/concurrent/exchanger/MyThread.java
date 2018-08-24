package io.sriharilabs.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class MyThread extends Thread{
	Exchanger<String> exchanger;
	   String message;
	 
	   MyThread(Exchanger<String> exchanger, String message) {
	      this.exchanger = exchanger;
	      this.message = message;
	   }
	 
	   public void run() {
	      try {
	         System.out.println(this.getName() + " message: " + message+this.currentThread().getName());
	 
	         // exchange messages
	         message = exchanger.exchange(message);
	 
	         System.out.println(this.getName() + " message: " + message+this.currentThread().getName());
	      } catch (Exception e) {
	      }
	   }
}
