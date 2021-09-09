package by.academy.classwork.lesson19;

public class ThreadDemo extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			Thread newThread = new Thread();
			newThread.start();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}

	public static void main(String[] args) {
		Thread threadDemo = new ThreadDemo();
		threadDemo.start();
	}
}
