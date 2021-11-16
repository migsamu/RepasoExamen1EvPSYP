package org.iesfm.repaso.ejdiapositivas2;

import java.util.concurrent.Semaphore;

public class AdiosTask implements Runnable {
    private Semaphore semaphoreHola;
    private Semaphore semaphoreAdios;
    private String adios;

    public AdiosTask(Semaphore semaphoreHola, Semaphore semaphoreAdios, String adios) {
        this.semaphoreHola = semaphoreHola;
        this.semaphoreAdios = semaphoreAdios;
        this.adios = adios;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                semaphoreAdios.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(adios);
            semaphoreHola.release();
        }
    }
}
