package by.academy.classwork.lesson20;

public class Consumer implements Runnable {
	
	private Dock dock;
	
	public Consumer(Dock dock) {
		this.dock = dock;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			dock.get();
		}
	}

}
