package Collection;

public class Lambda {
    interface MathOperation<T> {
        int operation(T t1, T t2);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    protected int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public void LambdaRun() {
        Lambda tester = new Lambda();
        //with type declaration
        MathOperation<Integer> addition = (Integer a, Integer b) -> a + b;

        //with out type declaration
        MathOperation<Integer> subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation<Integer> multiplication = (Integer a, Integer b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation<Integer> division = (Integer a, Integer b) -> (a / b);

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.LambdaRun();
    }
}
