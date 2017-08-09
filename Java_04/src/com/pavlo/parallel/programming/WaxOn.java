package com.pavlo.parallel.programming;

import static java.lang.System.out;

import java.util.concurrent.TimeUnit;

public class WaxOn implements Runnable {

	private Car car;

	public WaxOn(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				out.println("Wax On!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (InterruptedException e) {
			out.println("Exiting via interrupt");
		}
		out.println("Ending wax On task");
	}
}
