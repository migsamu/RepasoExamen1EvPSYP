package org.iesfm.repaso.ej2;

public class Hola implements Runnable{

    private int times;
    private String hola;

    public Hola(int times, String adios) {
        this.times = times;
        this.hola = adios;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(hola);
        }
    }
}
