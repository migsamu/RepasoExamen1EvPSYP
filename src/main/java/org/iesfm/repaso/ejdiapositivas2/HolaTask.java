package org.iesfm.repaso.ejdiapositivas2;

import java.util.concurrent.Semaphore;

public class HolaTask implements Runnable {

    private Semaphore semaphoreHola;
    private Semaphore semaphoreAdios;
    private String hola;

    public HolaTask(Semaphore semaphoreHola, Semaphore semaphoreAdios, String hola) {
        this.semaphoreHola = semaphoreHola;
        this.semaphoreAdios = semaphoreAdios;
        this.hola = hola;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                semaphoreHola.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(hola);
            semaphoreAdios.release();
        }
    }
}
