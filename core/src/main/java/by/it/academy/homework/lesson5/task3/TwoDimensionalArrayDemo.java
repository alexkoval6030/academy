package by.it.academy.homework.lesson5.task3;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3}, {1, 2, 3, 4, 5}};
        IteratorTwoDimensionalArray<Integer> iterator = new IteratorTwoDimensionalArray<>(array);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}