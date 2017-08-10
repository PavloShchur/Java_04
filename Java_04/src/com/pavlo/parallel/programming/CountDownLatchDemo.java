package com.pavlo.parallel.programming;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	static final int SIZE = 100;
	
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newCachedThreadPool();
		CountDownLatch countDownLatchDemo = new CountDownLatch(SIZE);
			
		for (int i = 0; i < 10; i++) 
			executorService.execute(new WaitingTask(countDownLatchDemo));
		
		for (int i = 0; i < 10; i++) 
			executorService.execute(new TaskPortion(countDownLatchDemo));
		
		System.out.println("All tasks started.");
		executorService.shutdown();
		
				

	}

}
