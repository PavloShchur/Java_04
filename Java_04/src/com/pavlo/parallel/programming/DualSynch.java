package com.pavlo.parallel.programming;

import static java.lang.System.out;

public class DualSynch {

	private Object syncObject = new Object();

	public synchronized void f() {
		for (int i = 0; i < 5; i++) {
			out.println("f()");
			Thread.yield();
		}
	}

	public void g() {
		synchronized (syncObject) {
			for (int i = 0; i < 5; i++) {
				out.println("g()");
				Thread.yield();
			}
		}
	}
	
	public void h() {
		synchronized (syncObject) {
			for(int i = 0; i < 5; i++) {
				out.println("h()");
				Thread.yield();
			}
		}
	}

}
