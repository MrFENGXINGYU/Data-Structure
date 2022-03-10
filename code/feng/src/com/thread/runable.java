package com.thread;

import org.omg.PortableServer.ThreadPolicy;

public class runable {
	public static void main(String[] args) {
		Cat cat = new Cat();
		ThreadProxy threadProxy = new ThreadProxy(cat);
		threadProxy.start();

	}
}

class Cat extends Aniaml implements Runnable {

	@Override
	public void run() {
		System.out.println("cat jiao");
	}

}

class ThreadProxy implements Runnable {
	private Runnable target = null;

	@Override
	public void run() {
		if (target != null) {
			target.run();
		}
	}

	public ThreadProxy(Runnable target) {
		super();
		this.target = target;
	}

	public void start() {
		start0();
	}

	public void start0() {
		run();
	}

}

class Aniaml {
}

class Dog extends Aniaml implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println("dog" + i + Thread.currentThread().getName());
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
