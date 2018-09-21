package pack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pack.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1,2));
		assertEquals(15, Calc.sum(5,10));
		assertEquals(12, Calc.sum(6,6));
	}

}
