package java.by.it.academy.classwork.lesson15;

public class LambdaPrintable {

	public static void main(String[] args) {
		Printable pr = () -> System.out.println();

		pr.print();

	}
}
