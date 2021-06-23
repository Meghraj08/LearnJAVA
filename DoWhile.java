public class DoWhile {
    public static void main(String[] args) {
        int math = 50, sci = 80, eng = 100;
        int total;
        float avg;
        do {
            System.out.println("Maths Marks = " + math);
        }
        while (math < 0 || math > 100);
        do {
            System.out.println("Science Marks = " + sci);
        }
        while (sci < 0 || sci > 100);
        do {
            System.out.println("English Marks = " + eng);
        }
        while (eng < 0 || eng > 100);
        total = math + sci + eng;
        avg = total / 3;
        System.out.println("Your Total Is = " + total);
        System.out.println("Your Average Is = " + avg);
        if (avg >= 0 && avg <= 100) {
            if (avg > 80) {
                System.out.println("Grade A");
            } else if (avg > 50) {
                System.out.println("Grade B");
            } else if (avg > 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
