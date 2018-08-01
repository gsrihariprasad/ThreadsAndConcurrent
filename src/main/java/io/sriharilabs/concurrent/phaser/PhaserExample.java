package io.sriharilabs.concurrent.phaser;

import java.util.concurrent.Phaser;

public class PhaserExample {  
	 
	   public static void main(String[] args) {
	 
	      Phaser phaser = new Phaser();
	 
	      Thread t1 = new MyPhaserThread(phaser,1000);
	      Thread t2 = new MyPhaserThread(phaser,3000);
	      Thread t3 = new MyPhaserThread(phaser,10000);
	      t1.start();
	      t2.start();
	      t3.start();
	 
	   }
	}
