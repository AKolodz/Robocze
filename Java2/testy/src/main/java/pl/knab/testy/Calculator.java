package pl.knab.testy;

/**
 *
 *
 * @since 2016-03-15, 23:08:07
 * @author Kacper Roszczyna
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiplication(int a, int b) {
    	return a * b;
    }
    public int division(int a, int b) throws RuntimeException{
    	
    	if (b==0){
    		
    	throw new RuntimeException();
    	}
    	else
    		return a/b;
    }
}
