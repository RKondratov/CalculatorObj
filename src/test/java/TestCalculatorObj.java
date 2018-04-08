import org.junit.*;

import java.util.ArrayList;

/**
 * Created by Kondratov on 07.04.2018.
 */
public class TestCalculatorObj {
    static int count = 0;
    static int countFalse = 0;
    ArrayList<String> array = new ArrayList<>();
    String text = "The test is faild! It's ";

    @Before
    public void newBeggining() {
        array.add(0, "");
        array.add(1, "1");
        array.add(2, "2");
    }

    @Test
    public void testAddition() {
        try {
            Assert.assertTrue(text+"testAddition!", new Addition(array).calculate(array) == 3);
        } catch (Throwable e) {
            countFalse++;
            System.out.println(e.toString());
        }
    }

    @Test
    public void testDivision() {
        try {
            Assert.assertTrue(text+"testDivision!", new Division(array).calculate(array) == 0.5);
        } catch (Throwable e) {
            countFalse++;
            System.out.println(e.toString());
        }
    }

    @Test
    public void testMultiplication() {
        try {
            Assert.assertTrue(text+"testMultiplication!", new Multiplication(array).calculate(array) == 2);
        } catch (Throwable e) {
            countFalse++;
            System.out.println(e.toString());
        }
    }

    @Test
    public void testSubtraction() {
        try {
            Assert.assertTrue(text+"testSubtraction!", new Subtraction(array).calculate(array) == -1);
        } catch (Throwable e) {
            countFalse++;
            System.out.println(e.toString());
        }
    }

    @After
    public void theEnd() {
        count++;
        System.out.println("Tests passed: " + (count - countFalse) + " of " + count);
    }
}