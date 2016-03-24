import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArabicNumeralsTest {
	private ArabicNumerals an;
	
	@Before
	public void beforeEachTest() {
		an = new ArabicNumerals();
	}

	@Test
	public void inputofIReturns1() {
		assertEquals(1, an.convertArabic("I"));
	}
	
	@Test
	public void inputofIIReturns2() {
		assertEquals(2, an.convertArabic("II"));
	}
	
	@Test
	public void inputofIIIReturns3() {
		assertEquals(3, an.convertArabic("III"));
	}

}
