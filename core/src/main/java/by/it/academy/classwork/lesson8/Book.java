package by.it.academy.classwork.lesson8;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Book");
    }

    public static void printBook(Printable[] arr) {
        for (Printable p : arr) {
            if (p instanceof Book) {
                p.print();
            }
        }

    }
}
