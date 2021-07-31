package by.academy.classwork.lesson8;

public class Magazine implements Printable{

	@Override
	public void print() {
		System.out.println("Magazine");
		
	}

	public static void printMagazine(Printable[] arr) {
		for(Printable p : arr) {
			if(p instanceof Magazine) {
				p.print();
			}
		}
		
	}
}
