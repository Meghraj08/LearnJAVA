package Collection;

public class LambdaCalc {
    interface MathOperation<M> {
        M operation(M t1, M t2);
    }

    protected int operate(int a, int b, MathOperation mathOperation) {
        return (int) mathOperation.operation(a, b);
    }

    public void LambdaRun() {
        LambdaCalc lambdaCalc = new LambdaCalc();
        MathOperation<Integer> addition = (Integer a, Integer b) -> a + b;
        MathOperation<Integer> subtraction = (Integer a, Integer b) -> a - b;
        MathOperation<Integer> multiplication = (Integer a, Integer b) -> a * b;
        MathOperation<Integer> division = (Integer a, Integer b) -> a / b;
        MathOperation<Integer> modulus = (Integer a, Integer b) -> a % b;

        System.out.println("10 + 5 = " + lambdaCalc.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambdaCalc.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambdaCalc.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambdaCalc.operate(10, 5, division));
        System.out.println("10 % 5 = " + lambdaCalc.operate(10, 5, modulus));
    }

    public static void main(String[] args) {
        LambdaCalc lambdaCalc = new LambdaCalc();
        lambdaCalc.LambdaRun();
    }
}
