/**
 * @author Литвинцова Юлия
 */
public class Calculator {
    public Calculator() {

    }

    public double sum(double num1, double num2) {
        return (num1 + num2);
    }

    public double difference(double num1, double num2) {
        return (num1 - num2);
    }

    public double product(double num1, double num2) {
        return (num1 * num2);
    }

    public double quotient(double num1, double num2) {
        double res;
        try {
            res = (num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e + "!");
            res = e.hashCode();
        }
        return res;

    }
}
