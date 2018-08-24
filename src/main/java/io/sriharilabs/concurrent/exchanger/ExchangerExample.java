package io.sriharilabs.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
	public static void main(String[] args) {
		 
	      Exchanger<String> exchanger = new Exchanger<String>();
	 
	      Thread t1 = new MyThread(exchanger, "I like coffee.");
	      Thread t2 = new MyThread(exchanger, "I like tea       ");
	      t1.start();
	      t2.start();
	   }
}
