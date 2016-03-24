import static org.junit.Assert.*;

import org.junit.Test;


public class ArabicNumeralsTest {

	@Test
	public void inputofIReturns1() {
		ArabicNumerals an = new ArabicNumerals();
		assertEquals(1, an.convertArabic("I"));
	}

}
