package com.gsss.batch2.advanced.threads;

public class ThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new NumberPrinterThread("Thread 1");
        Thread thread2 = new NumberPrinterThread("Thread 2");
        thread1.start();
        thread2.start();
    }
}
class NumberPrinterThread extends Thread {
    private String threadName;
    public NumberPrinterThread(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println(threadName + ": " + i);
            // Interlude == Delay
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
