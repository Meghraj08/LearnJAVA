package com.app.java;

public class ConstantsJava {
    final float gst;

    static {
        System.out.println("My Program Starts from here");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.print('\u2663');
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    {
        System.out.println("I am object Block");
        // object block
        gst = 0.18f;
    }

    public ConstantsJava() {
    }

    public static void main(String[] args) {
        {
            ConstantsJava constantsJava = new ConstantsJava();
            System.out.println(constantsJava.gst);
        }

        {
            ConstantsJava constantsJava = new ConstantsJava();
            System.out.println(constantsJava.gst);
        }
    }
}
