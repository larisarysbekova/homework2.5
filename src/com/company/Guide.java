package com.company;

import java.util.concurrent.CountDownLatch;

public class Guide extends Thread {
    CountDownLatch latch;

    private int touristNumber;

    public Guide(int touristNumber, CountDownLatch latch) {
        this.touristNumber = touristNumber;
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.printf("Подошел %d турист\n", touristNumber);
            latch.countDown();
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
