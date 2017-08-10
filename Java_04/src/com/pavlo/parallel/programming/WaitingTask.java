package com.pavlo.parallel.programming;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class WaitingTask implements Runnable {

	private static int counter = 0;
	private final int id = counter++;
	private static Random random = new Random(47);
	private final CountDownLatch latch;

	public WaitingTask(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			latch.await();
			System.out.println("The barrier ie went over for " + this);
		} catch (InterruptedException e) {
			System.out.println(this + " interrupted");
		}
	}

	public String toString() {
		return String.format("WaitingTask %1-3d", id);
	}

}
