package com.app.java;

import java.util.Scanner;

public class CalcScanner {
    private Scanner scanner;
    int a, b;
    String n;

    CalcScanner() {
        scanner = new Scanner(System.in);
        System.out.println(" Enter A Number :- ");
        try {
            this.a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" Enter Another Number :- ");
        try {
            this.b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" Press + For Addition ");
        System.out.println(" Press - For Subtraction ");
        System.out.println(" Press * For Multiplication ");
        System.out.println(" Press / For Division ");
        System.out.println(" Press % For Modulus ");
        try {
            this.n = scanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (n) {
            case "+":
                System.out.println(" Addition Is :- " + (a + b));
                break;
            case "-":
                System.out.println(" Subtraction Is :- " + (a - b));
                break;
            case "*":
                System.out.println(" Multiplication Is :- " + (a * b));
                break;
            case "/":
                System.out.println(" Division Is :- " + (a / b));
                break;
            case "%":
                System.out.println(" Modulus Is :- " + (a % b));
                break;
            default:
                System.out.println(" Invalid Choice ");
        }
    }

    public static void main(String[] args) {
        CalcScanner calcScanner = new CalcScanner();
        System.out.println(calcScanner);
    }
}
