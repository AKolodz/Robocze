package pl.knab.testy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kacper Roszczyna
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMultiplication() {
    	System.out.println("multiplication");
    	int a=0;
    	int b=0;
    	Calculator instance =new Calculator();
    	int expResult=0;
    	int result=instance.multiplication(a,b);
    	assertEquals(expResult,result);
    }
    /**
     * Test of division method, of class Calculator
     */
    @Test(expected = RuntimeException.class)
    public void testDivision() {
    	int a=1;
    	int b=0;
    	Calculator instance=new Calculator();
    	int result=instance.division(a, b);

    }
}
