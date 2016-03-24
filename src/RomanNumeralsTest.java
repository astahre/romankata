import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RomanNumeralsTest {
	private RomanNumerals rn;
	
	@Before
	public void beforeEachTest() {
		rn = new RomanNumerals();
	}

	@Test
	public void inputOf1returnsI() {
		assertEquals("I", rn.convertRoman(1));
	}

	@Test
	public void inputOf2returnsII() {
		assertEquals("II", rn.convertRoman(2));
	}
	
	@Test
	public void inputOf4returnsIV() {
		assertEquals("IV", rn.convertRoman(4));
	}

}
