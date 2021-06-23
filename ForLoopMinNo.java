public class ForLoopMinNo {
    public static void main(String[] args) {
        int[] num = new int[5];
        int min = 0;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Enter Number :- " + i + 1);
            }
            while (num[i] > 0);
            min = num[i];
        }
        for (int j = 0; j < 5; j++) {
            if (num[j] > min) {
                min = num[j];
            }
        }
        System.out.println(" Your Minimum Number Is :- " + min);
    }
}
