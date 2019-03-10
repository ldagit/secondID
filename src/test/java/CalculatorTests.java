import calculate.Difference;
import calculate.Product;
import calculate.Quotient;
import calculate.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Литвинцова Юлия
 */
public class CalculatorTests {

    private int testNum1 = 10;
    private int testNum2 = -10;

    @Test
    public void waitCorrectSumResult() {
        Sum sum = new Sum(testNum1, testNum2);
        Assertions.assertEquals(testNum1+ testNum2, sum.DoSomeMathOperation(), "Сумма чисел рассчитана не верно!");
    }

    @Test
    public void waitCorrectDifferenceResult() {
        Difference dif = new Difference(testNum1, testNum2);
        Assertions.assertEquals(testNum1-testNum2, dif.DoSomeMathOperation(), "Разность чисел рассчитана не верно!");
    }

    @Test
    public void waitCorrectProductResult() {
        Product prod = new Product(testNum1, testNum2);
        Assertions.assertEquals(testNum1*testNum2, prod.DoSomeMathOperation(), "Произведение чисел рассчитано не верно!");
    }

    @Test
    public void waitCorrectQuotientResult() {
        Quotient quotient = new Quotient(testNum1, testNum2);
        Assertions.assertEquals(testNum1/testNum2, quotient.DoSomeMathOperation(), "Частное от целочисленного деления чисел рассчитано не верно!");
    }

    @Test
    public void testForTesting() {
        String expected = "value";
        Assertions.assertEquals(expected, "value", "Values are not equals");
    }



}
