package by.academy.classwork.lesson15;

public class LambdaPrintable {
	
	public interface Printable {
		
		void print();
	}
	
	public static void main(String[] args) {
		Printable pr = s -> System.out.println(s);
		pr.print(s);
	}
}
