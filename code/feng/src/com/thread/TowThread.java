package com.thread;

public class TowThread {
	public static void main(String[] args) {
		Thread01 thread01 = new Thread01();
		Thread02 thread02 = new Thread02();

		Thread thread1 = new Thread(thread01);
//		thread1.start();
		Thread thread2 = new Thread(thread02);
//		thread2.start();

		Doge doge = new Doge();
		doge.start();

	}
}

class Doge extends Thread {
	@Override
	public void run() {
		System.out.println("doge is jiao" + Thread.currentThread().getName());
	}
//	public void run()
//	{
//		System.out.println("doge is jiao"+Thread.currentThread().getName());
//	}
}

class Thread01 implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("thread 01 " + i + Thread.currentThread().getName());
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread02 implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("thread 02 " + i + Thread.currentThread().getName());
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
