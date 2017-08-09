package com.pavlo.parallel.programming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaxOMatic {

	public static void main(String[] args) throws Exception {
		Car car = new Car();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new WaxOff(car));
		executorService.execute(new WaxOn(car));
		TimeUnit.MICROSECONDS.sleep(5);
		executorService.shutdown();

	}

}
