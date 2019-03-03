package calculate;

public class Product extends MathOperation {
    public Product(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int DoSomeMathOperation() {
        return (getNum1() * getNum2());
    }

    @Override
    public String toString() {
        return ("Произведение чисел: " + DoSomeMathOperation());
    }
}
