package com.gsss.batch2.advanced.threads;
public class ThreadPriority extends Thread{
    @Override
    public void run() {
        System.out.println("Inside the run method of the thread.!");
    }
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        System.out.println("T1: Priority--> " + t1.getPriority());
        System.out.println("T2: Priority--> " + t2.getPriority());
        System.out.println("T3: Priority--> " + t3.getPriority());
        t1.setPriority(1);
        t2.setPriority(6);
        t3.setPriority(10);
        System.out.println("T1: Priority--> " + t1.getPriority());
        System.out.println("T2: Priority--> " + t2.getPriority());
        System.out.println("T3: Priority--> " + t3.getPriority());
        System.out.println("Current Thread--> " +
                Thread.currentThread().getName());
        System.out.println("Current Thread Priority--> " +
                Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Current Thread Priority--> " +
                Thread.currentThread().getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}
