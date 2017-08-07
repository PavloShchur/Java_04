package com.pavlo.parallel.programming;

public class Sleeper extends Thread {
	
	private int duration;
	
	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}
	
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + " ��������� " + 
		"isInterrupted() " + isInterrupted());
			return;			
		}
		System.out.println(getName() + " activated.");
	}

}


