package com.sriharilabs.concurrent.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindBigNumber extends RecursiveTask<Integer> {
	 
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int[] numbers;
	   int start;
	   int end;
	 
	   int THRESHOLD = 5;
	 
	   public FindBigNumber(int[] numbers) {
	      	this(numbers, 0, numbers.length);
	   }
	 
	 
	   public FindBigNumber(int[] numbers, int start, int end) {
	      this.numbers = numbers;
	      this.start = start;
	      this.end = end;
	   }
	 
	   public Integer compute() {
		  try {
			  //System.out.println(""+Thread.currentThread().getName());
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      int length = end - start;
	      int max = 0;
	      if (length < THRESHOLD) {
	         for (int x = start; x < end; x++) { 
	            if (numbers[x] > max) {
	               max = numbers[x];
	            }
	         }
	         return max;
	      } else {
	         int split = length/2;
	         FindBigNumber left = new FindBigNumber(numbers, start, start + split);
	         left.fork();
	         FindBigNumber right = new FindBigNumber(numbers, start + split, end);
	         return Math.max(right.compute(), left.join());
	      }
	   }
	 
	   public static void main(String[] args) {
	 
	      int SIZE = 5000;
	      final int[] numbers = new int[SIZE];
	      int biggest = 0;
	 
	      for (int i=0; i<SIZE; i++){
	         numbers[i] = (int) (Math.random() * 10000);
	         if ( numbers[i] > biggest ) {
	            biggest = numbers[i];
	         }
	      }
	      System.out.println("Biggest number generated: " + biggest);
	 
	      ForkJoinPool pool = new ForkJoinPool(10000);
	      FindBigNumber fbn = new FindBigNumber(numbers);
	      System.out.println("Biggest number found: " + pool.invoke(fbn));
	 
	   }
	}
	 