package com.pavlo.parallel.programming;

public class SelfManaged implements Runnable {
	
	SimpleThread simpleThread = new SimpleThread();

	private int countDown = 5;
	private Thread t = new Thread(this);

	public SelfManaged() {
		t.start();
		try {
			simpleThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public String toString() {
		return Thread.currentThread().getName() + "(SelfManaged" + countDown + "). ";
	}

	public void run() {
		while (true) {
			System.out.print(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		
		for (int i = 0; i < 5; i++) {
			new SelfManaged();
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("\"---\"");
		System.out.println("Execution time = " + (double) (t2 - t1) / 1000);
	}

}
