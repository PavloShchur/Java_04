package com.pavlo.parallel.programming;

import java.util.concurrent.TimeUnit;

import com.pavlo.Regular_Expressions.Main;

public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+ " " + this);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
			}
			
			
		}
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		long t1 = System.currentTimeMillis();
		
		for(int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("All deamons started.");
		TimeUnit.MILLISECONDS.sleep(175);
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Time of execution = " + (double) (t2 - t1) / 1000);
	}
	
	
}
