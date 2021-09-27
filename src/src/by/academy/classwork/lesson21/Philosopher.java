package by.academy.classwork.lesson21;

public class Philosopher extends Thread{
	
	private Object leftFork;
	private Object rightFork;
	
	public Philosopher(Object leftFork, Object rightFork) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}
	
	private void doAction(String action) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + action);
		Thread.sleep(((int) (Math.random() * 100)));
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				// thinking
				doAction(System.nanoTime() + ": Thinking");
				synchronized (leftFork) {
					doAction(System.nanoTime() + ": Picked up left fork");
					while(true) {
						synchronized (rightFork) {
							// eating
							doAction(System.nanoTime() + ": Picked up right fork - eating");
							doAction(System.nanoTime() + ": Put down right fork");
						}
					}

					// Back to thinking
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}
}
