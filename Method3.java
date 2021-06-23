public class Method3 {
    public static void displayCalc(String no1, String no2) {
        double a = Double.parseDouble(no1);
        double b = Double.parseDouble(no2);
        char op = '*';
        System.out.println("Enter Number :- " + no1);
        System.out.println("Enter Number :- " + no2);
        System.out.println("Enter Operational Character :- " + op);
        switch (op) {
            case '+':
                System.out.println("Addition Is = " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction Is = " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication Is = " + (a * b));
                break;
            case '/':
                System.out.println("Division Is = " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void displayStudent(String name, String age, String gender, String mob, String add) {
        System.out.println("NAME :- " + name);
        System.out.println("AGE :- " + age);
        System.out.println("GENDER :- " + gender);
        System.out.println("MOBILE :- " + mob);
        System.out.println("ADDRESS :- " + add);
    }

    public static void main(String[] args) {
        String n = args[0];
        int d = Integer.parseInt(n);
        switch (n) {
            case "1":
                displayCalc(args[1], args[2]);
                break;
            case "2":
                displayStudent(args[1], args[2], args[3], args[4], args[5]);
                break;
        }
    }
}
