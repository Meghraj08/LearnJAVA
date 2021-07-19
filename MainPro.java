package ArrayString;

public class MainPro {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int[] marks2 = {1, 2, 4, 5, 3};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks2.length; i++) {
            System.out.println(marks2[i]);
        }

        for (int num : marks2) {
            System.out.println(num);
        }

        avg(marks2);
    }

    public static void avg(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Total :- " + sum);
        System.out.println("Avg :- " + sum / marks.length);
    }
}
