package calculate;

public class Sum extends MathOperation {

    @Override
    public int DoSomeMathOperation() {
        return (getNum1() + getNum2());
    }

    public Sum(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public String toString() {
        return ("Сумма чисел: " + DoSomeMathOperation());
    }
}
