package com.pavlo.parallel.programming;

public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	

	public LiftOff() {
		super();
	}

	public LiftOff(int countDown) {
		super();
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "). ";
	}

	@Override
	public void run() {
		while(countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}		
	}
}
