package by.academy.classwork.lesson20;

import java.util.List;

public class Dock {
	
	List<Dock> docs = ArrayList<Dock>();
	
	private int dockCapacity = 20;
	
	public synchronized void get() {
		while (dockCapacity < 1) {
			try {
				wait();
				System.out.println("Wait container");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dockCapacity--;
		System.out.println(Thread.currentThread().getName() + "Ship got 1 container. Number of containers: " + dockCapacity);
		notify();
	}
	
	public synchronized void put() {
		while (dockCapacity >= 9) {
			try {
				wait();
				System.out.println("Wait dock");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dockCapacity++;
		System.out.println(Thread.currentThread().getName() + "Ship added 1 container. Number of containers: " + dockCapacity);
		notify();
	}

}
