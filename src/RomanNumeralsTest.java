import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTest {

	@Test
	public void inputOf1returnsI() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals("I", rn.convertRoman(1));
	}

}
