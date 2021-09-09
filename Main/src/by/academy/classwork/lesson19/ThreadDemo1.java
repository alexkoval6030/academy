package by.academy.classwork.lesson19;

public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
				Thread newThread = new Thread();
				newThread.start();
				try {
					Thread.sleep(100);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		ThreadDemo1 runnable = new ThreadDemo1();
		Thread threadDemo1 = new Thread(runnable);
		threadDemo1.start();
	}

}
