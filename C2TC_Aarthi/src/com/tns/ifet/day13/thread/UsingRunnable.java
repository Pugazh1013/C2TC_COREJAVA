package com.tns.ifet.day13.thread;

public class UsingRunnable extends RunnableDemo {
	Thread thread;
	int high, low;
	String msg;

	public UsingRunnable(int low, int high, String msg) {
		this.high = high;
		this.low = low;
		this.msg = msg;
		thread = new Thread("Child Thread");
		thread.start();
	}

	public void run() {
		for (int i = low; i <= high; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}

}
