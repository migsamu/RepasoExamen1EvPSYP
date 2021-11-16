package org.iesfm.repaso.ejcarlos1;

import java.util.Arrays;
import java.util.List;

public class AverageTask implements Runnable {

    private List<Double> numbers = Arrays.asList(2.3, 2.5, 2.7);

    public AverageTask(List<Double> numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double result = 0;

        for (Double number : numbers) {
            result += number;
        }
        return result/numbers.size();
    }

    @Override
    public void run() {
        System.out.println("El resultado de la media es " + average());
    }
}
