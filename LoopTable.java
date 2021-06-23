public class LoopTable {
    public static void main(String[] args) {
        int n = 15, i;
        char yes = 'y';
        do {
            System.out.println("Enter Number :- " + n);
            for (i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
        while (yes != 'y');
    }
}
