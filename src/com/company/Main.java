package com.company;


import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(15);
        for (int i = 1; i <= 15; i++) {
            Guide g = new Guide(i, latch);
            g.start();
            Thread.sleep(1000);
        }
        latch.await();
        System.out.println("Поехали в путешествие!!!");
    }


}







