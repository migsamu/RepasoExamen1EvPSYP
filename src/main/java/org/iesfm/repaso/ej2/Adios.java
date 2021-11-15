package org.iesfm.repaso.ej2;

public class Adios implements Runnable{

    private int times;
    private String adios;

    public Adios(int times, String adios) {
        this.times = times;
        this.adios = adios;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(adios);
        }
    }
}
