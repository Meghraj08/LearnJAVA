package Exceptions;

public class ErrorHandling {
    public static void main(String[] args) throws AgeInvalidException {
        try {
            System.out.println(args[0]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello World");

        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Integer a = Integer.parseInt("abc");
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int[] a = new int[3];
            a[3] = 10 / 0;
            String name = null;
            System.out.println(name.length());
            Integer an = Integer.parseInt("111022s");
            System.out.println(an);
        } catch (NumberFormatException | ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("--------------------------");
            System.out.println(e);
            System.out.println("--------------------------");
        } finally {
            System.out.println("Final");
        }

        try {
            int a = 10;
        } catch (Exception e) {
            System.out.println("--------------------------");
            System.out.println(e);
            System.out.println("--------------------------");
        } finally {
            System.out.println("Final2");
        }
        ErrorHandling errorHandling = new ErrorHandling();
        errorHandling.ageCheck(10);
        errorHandling.ageCheck(100);
    }

    void ageCheck(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Invalid");
        }

        if (age >= 100) {
            throw new AgeInvalidException();
        }
    }
}
