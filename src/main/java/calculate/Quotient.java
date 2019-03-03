package calculate;

public class Quotient extends MathOperation {
    public Quotient(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int DoSomeMathOperation(){
        return (getNum1() / getNum2());
    }

    @Override
    public String toString() {
        return ("Частное от целочисленного деления: " + DoSomeMathOperation());
    }
}
