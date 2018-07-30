package com.sriharilabs.java8;

public class UsingMethodRefernce {

	
	public static void show() {
		System.out.println("Its working...");
	}
	public static void main(String[] args) {

		Thread t=new Thread(UsingMethodRefernce::show);
		t.start();
	}

}
