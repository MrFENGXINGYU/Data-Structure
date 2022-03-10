package com.thread;

public class JoinYield {
	public static void main(String[] args) throws InterruptedException {
		Test1 test1 = new Test1();
		test1.start();

		for (int i = 0; i < 20; i++) {
			System.out.println("hi" + i + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 5) {
				test1.join();
			}
		}
	}
}

class Test1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("hello" + i + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
