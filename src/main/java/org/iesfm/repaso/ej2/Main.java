package org.iesfm.repaso.ej2;

public class Main {
    public static void main(String[] args) {
        Thread threadHola = new Thread(new Hola(100,"hola"));
        Thread threadAdios = new Thread(new Hola(50,"adios"));
        threadHola.start();
        threadAdios.start();
    }
}
