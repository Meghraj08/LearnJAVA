import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int a = 0;


        while (a < 10) {
            System.out.println(a++);
        }

        System.out.println("--------------------------");

        do {
            System.out.println(a++);
        } while (a < 10);

        System.out.println("--------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
