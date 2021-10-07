package by.it.academy.classwork.lesson10;

public class Box {
    Box[] box = new Box[3];
//	ArrayList<Integer> obj = new ArrayList<>(box);

    static class HeavyBox {
        int weight;
        int width;
        int heigth;
        int depth;

        HeavyBox(int w, int h, int d, int m) {
            width = w;
            heigth = h;
            depth = d;
            weight = m;
        }
    }

}
