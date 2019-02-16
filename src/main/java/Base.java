import java.util.Scanner;

/**
 * @author Литвинцова Юлия
 */
public class Base {

    public static void main(String[] args) {
        //Ввод данных
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи (1 - калькулятор, 2 - массив строк):");
        int taskNum = in.nextInt();
        if (taskNum == 1) {
            System.out.println("Введите первое число:");
            double num1 = in.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = in.nextDouble();
            System.out.println("Введите вид операции +, -, * или / :");
            String oper = in.next();
            //Анализ и рассчет
            calculate(num1, num2, oper);

        } else if (taskNum == 2) {
            System.out.println("Введите длину одномерного массива строк:");
            int stringArrLength = in.nextInt();
            String[] stringArr = new String[stringArrLength];
            for (int i = 0; i < stringArrLength; i++){
                System.out.printf("String[%d] = ", i);
                stringArr[i] = in.next();
            }
            maxStringLength(stringArr);
        } else {
            System.out.println("Неправильно введен номер задачи!");
        }

        in.close();
    }

    private static void calculate(double cNum1, double cNum2, String cOp) {
        double cRes;
        switch (cOp) {
            case ("+"): {
                cRes = cNum1 + cNum2;
                System.out.printf("Сумма чисел: %.4f \n", cRes);
                break;
            }
            case "-": {
                cRes = cNum1 - cNum2;
                System.out.printf("Разность чисел: %.4f \n", cRes);
                break;
            }
            case "*": {
                cRes = cNum1 * cNum2;
                System.out.printf("Произведение чисел: %.4f \n", cRes);
                break;
            }
            case "/": {
                cRes = cNum1 / cNum2;
                System.out.printf("Частное от деления чисел: %.4f \n", cRes);
                break;
            }
            default:
                System.out.println("Неправильно введен вид операции!");
        }
    }
    private static void maxStringLength(String[] strArg){
        int maxLen = strArg[0].length();
        int maxNum = 0;

        for (int i = 1; i < strArg.length; i++){
            if (strArg[i].length() > maxLen){
                maxLen = strArg[i].length();
                maxNum = i;
            }
        }
        System.out.printf("Самое длинное слово в массиве: %s. Длина: %d", strArg[maxNum], strArg[maxNum].length());
    }

}
