package com.pavlo.parallel.programming;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TaskPortion implements Runnable {

	private static int counter = 0;
	private final int id = counter++;
	private static Random random = new Random(47);
	private final CountDownLatch latch;

	public TaskPortion(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			doWork();
			latch.countDown();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
		System.out.println(this + " ends.");
	}

	public String toString() {
		return String.format("%1$-3d", id);
	}

}
