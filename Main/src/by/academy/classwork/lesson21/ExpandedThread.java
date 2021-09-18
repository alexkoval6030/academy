package by.academy.classwork.lesson21;

public class ExpandedThread extends Thread {
	
	private StringBuilder str;
	
	public ExpandedThread(StringBuilder str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		synchronized str;
		for(int i = 0; i<100; i++) {
			System.out.println(a);
		}
		
		
	}

}
