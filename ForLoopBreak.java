public class ForLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                break;
            }
            for (int j = 0; j < 3; j++) {
                if (j == 2)
                    break;
                System.out.println(i + j);
            }
        }
    }
}
