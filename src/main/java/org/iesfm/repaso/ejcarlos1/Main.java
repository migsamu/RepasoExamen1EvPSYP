package org.iesfm.repaso.ejcarlos1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(2.5, 3.0, 0.5);

        Thread threadAverage = new Thread(new AverageTask(numbers));
        Thread threadsum = new Thread(new SumTask(numbers));

        threadsum.start();
        threadAverage.start();
    }


}
