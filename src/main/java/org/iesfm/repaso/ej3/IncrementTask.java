package org.iesfm.repaso.ej3;

public class IncrementTask implements Runnable{

    private Accumulator accumulator;
    private int times;

    public IncrementTask(Accumulator accumulator, int times) {
        this.accumulator = accumulator;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            accumulator.inc();
        }
    }
}
