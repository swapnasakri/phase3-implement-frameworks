package demo1.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import demo1.Calculator;

@RunWith(JUnitPlatform.class)
public class Demo3 {

	Calculator calculaor;
	
	@BeforeEach
	void initEach() {
		calculaor = new Calculator();
	}
	
	@Test
	void testCaclculator_WhenBothArgument_Greater0() {
		// Step 1 : Prepare inputs
		int a= 1;
		int b = 2;
		
		// Step 2: invoke actual code
		
		int actualValue = this.calculaor.calculate(a, b);
		
		// Step 3: Match with exepectations
		
		Assertions.assertEquals(3, actualValue);
		
	}
	
}