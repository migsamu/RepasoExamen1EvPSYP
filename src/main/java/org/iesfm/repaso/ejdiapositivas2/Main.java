package org.iesfm.repaso.ejdiapositivas2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphoreHola = new Semaphore(1);
        Semaphore semaphoreAdios = new Semaphore(1);

        Thread threadHola = new Thread(new HolaTask(semaphoreHola,semaphoreAdios,"hola"));
        Thread threadAdios = new Thread(new AdiosTask(semaphoreHola,semaphoreAdios,"adios"));

        try {
            semaphoreAdios.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadHola.start();
        threadAdios.start();


    }
}
