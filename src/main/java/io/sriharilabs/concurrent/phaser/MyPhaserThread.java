package io.sriharilabs.concurrent.phaser;

import java.util.concurrent.Phaser;

class MyPhaserThread extends Thread {
	 
	   Phaser phaser;
	   int sleep;
	 
	   MyPhaserThread(Phaser phaser, int sleep){
	      this.phaser=phaser;
	      this.sleep=sleep;
	   }
	 
	   public void run() {
	      phaser.register();
	      System.out.println(this.getName() + " begin");
	      try {
	         Thread.sleep(sleep);
	      } catch (Exception e) { 
	      }
	      phaser.arriveAndAwaitAdvance();
	      System.out.println(this.getName() + " middle");
	      try {
	         Thread.sleep(sleep);
	      } catch (Exception e) { 
	      }
	      System.out.println(this.getName() + " end");
	   }
	}
