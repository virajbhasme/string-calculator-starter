package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
    
    @Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
    
    @Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
    
    @Test
    public void testThreeNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testNewLine(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
    
    @Test
    public void testNegativeNumver(){
    	try {
			Calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			Calculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }
    
    @Test
    public void testOverThousand(){
    	assertEquals(2, Calculator.add("1000,2"));
    }
    
    @Test
    public void testOtherDelimiter(){
    	assertEquals(3, Calculator.add("//;\n1;2"));
    }
}
