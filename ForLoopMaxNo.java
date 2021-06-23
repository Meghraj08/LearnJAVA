public class ForLoopMaxNo {
    public static void main(String[] args) {
        int[] num = new int[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Enter Number :- " + i + 1);
            }
            while (num[i] > 0);
        }
        for (int j = 0; j < 5; j++) {
            if (num[j] > max) {
                max = num[j];
            }
        }
        System.out.println(" Your Maximum Number Is :- " + max);
    }
}
