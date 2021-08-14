package com.app.java;

public class Threading implements Runnable {
    int start, end, sum = 0;
    static long timer = 100L;

    public static void main(String[] args) {
        // process : task
        // process subtask : thread
        Threading threading = new Threading();
        threading.start = 10;
        threading.end = 20;
        Threading threading2 = new Threading();
        threading2.start = 100;
        threading2.end = 110;
        Thread thread = new Thread(threading, "10-20");
        Thread thread2 = new Thread(threading2, "100-110");
        thread.start();
        thread2.start();
        try {
            Thread.sleep(timer * (threading.end - threading.start) + timer * (threading2.end - threading2.start));
            System.out.println("10-20 -> " + threading.sum);
            System.out.println("100-110 -> " + threading2.sum);
        } catch (Exception e) {
        }
    }

    @Override
    public void run() {
        try {
            sum = 0;
            for (int i = start; i <= end; i++) {
                Thread.sleep(timer);
                sum += i;
                System.out.print('\u2668');
//                System.out.println( Thread.currentThread().getName() + " " + i);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
