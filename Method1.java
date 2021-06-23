public class Method1 {
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
    public static void main(String[] args) {
        displayCalc(args[0], args[1]);
     }
}
