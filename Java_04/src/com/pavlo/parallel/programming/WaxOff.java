package com.pavlo.parallel.programming;

import static java.lang.System.out;

import java.util.concurrent.TimeUnit;

public class WaxOff implements Runnable {
	
	private Car car;

	public WaxOff(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				out.print("Wax Off! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			out.println("Exiting via interrupt");
		}
		out.println("Ending wax Off task");
	}
}
