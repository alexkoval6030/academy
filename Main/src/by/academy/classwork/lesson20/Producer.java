package by.academy.classwork.lesson20;

class Producer implements Runnable {

	private Dock dock;

	public Producer(Dock dock) {
		this.dock = dock;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			dock.put();
		}
	}
}