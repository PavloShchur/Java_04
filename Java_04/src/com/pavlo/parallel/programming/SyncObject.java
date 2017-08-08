package com.pavlo.parallel.programming;

public class SyncObject {

	public static void main(String[] args) {
		final DualSynch ds = new DualSynch();
		new Thread() {
			public void run() {
				ds.f();
			}
		}.start();
		
		ds.g();
		ds.h();
	}

}
