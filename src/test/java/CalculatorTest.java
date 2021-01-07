import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.bnpp.kata.Calculator;

public class CalculatorTest {

	Calculator calculatorObj = null;

	@Before
	public void initializeCalculatorObj() {
		calculatorObj = new Calculator();
	}

	@Test
	public void twoNumbersAdditionTest() {
		assertThat(calculatorObj.twoNumbersAddition(5, 5), is(10));
	}

	@Test
	public void twoNumbersSubtractionTest() {
		assertThat(calculatorObj.twoNumbersSubtraction(5, 5), is(0));
	}

}