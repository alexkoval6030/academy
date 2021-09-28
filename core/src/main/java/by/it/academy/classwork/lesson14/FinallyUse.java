package java.by.it.academy.classwork.lesson14;

public class FinallyUse {

	public static void procA() throws RuntimeException {
		try {
			System.out.println("Внутри procA");
			throw new RuntimeException("demo");
		}finally {
			System.out.println("procA and finally");
		}
	}
	
	public static void procB() {
		try {
			System.out.println("Внутри procB");
			return;
		}finally {
			System.out.println("finally для procB");
		}
	}
	
	public static void procC() {
		try {
			System.out.println("Внутри procC");
//			System.exit(0);
		}finally {
			System.out.println("finally для procC");
		}
	}
	
	public static void main(String[] args) {
//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Исключение выброшено");
//		}
		
//		procB();
		procC();
		System.out.println("test");
	}
}
