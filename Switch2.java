public class Switch2 {
    public static void main(String[] args) {
        int a = 10, b = 10;
        char op = '*';
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
}
