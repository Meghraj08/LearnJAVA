package com.app.java;

import java.util.Scanner;

public class CardScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Your Name :- ");
        String name = scanner.next();
        System.out.println(" Enter Your Age :- ");
        int age = scanner.nextInt();
        System.out.println(" Enter Your Phone Number :- ");
        String number = scanner.next();
        System.out.println(" Enter Your Address :- ");
        String address = scanner.next();
        System.out.println("***********************************");
        System.out.println("* Name Is          :- " + name);
        System.out.println("* Age Is           :- " + age);
        System.out.println("* Phone Number Is  :- " + number);
        System.out.println("* Address Is       :- " + address);
        System.out.println("***********************************");
    }
}
