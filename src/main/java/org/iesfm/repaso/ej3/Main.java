package org.iesfm.repaso.ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new IncrementTask(accumulator, 100000));
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(accumulator.getTotalTimes());
    }
}
