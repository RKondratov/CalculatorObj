import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kondratov on 29.03.2018.
 *
 * @author Kondratov
 * @version 1.1
 * @see Addition#calculate(ArrayList)
 * @see Multiplication#calculate(ArrayList)
 * @see Subtraction#calculate(ArrayList)
 * @see Division#calculate(ArrayList)
 */
public class CalculatorObj {
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the operation: +, - , /, *");
        String text = sc.next();
        array.add(text);
        while (!text.equals("=")) {
            System.out.println("Enter figure (or '=' if you want to finish entering): ");
            text = sc.next();
            if (text.equals("=")) break;
            array.add(text);
        }
        sc.close();
        try {
            switch (array.get(0).toString()) {
                case ("+"):
                    System.out.printf("Result is: %.4f", new Addition(array).calculate(array));
                    break;
                case ("*"):
                    System.out.printf("Result is: %.4f", new Multiplication(array).calculate(array));
                    break;
                case ("-"):
                    System.out.printf("Result is: %.4f", new Subtraction(array).calculate(array));
                    break;
                case ("/"):
                    System.out.printf("Result is: %.4f", new Division(array).calculate(array));
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero!" + "\n" + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid value!" + "\n" + e.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("You have chosen a nonexistent action!" + "\n" + e.toString());
        }
    }
}