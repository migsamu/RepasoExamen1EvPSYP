package org.iesfm.repaso.ej1;

public class SaludoTask implements Runnable {

    private int times;
    private String word;

    public SaludoTask(int times, String word) {
        this.times = times;
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

