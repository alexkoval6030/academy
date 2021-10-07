package by.it.academy.classwork.lesson21;

public class DiningRoom {

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < 5; i++) {
            Object leftFork = forks[i];
            Object rigthFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(leftFork, rigthFork);

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }

}
