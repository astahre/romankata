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
	
	@Test
	public void inputOf5returnsV() {
		assertEquals("V", rn.convertRoman(5));
	}
	
	@Test
	public void inputOf6returnsVI() {
		assertEquals("VI", rn.convertRoman(6));
	}
	
	@Test
	public void inputOf9returnsIX() {
		assertEquals("IX", rn.convertRoman(9));
	}
	
	@Test
	public void inputOf10returnsX() {
		assertEquals("X", rn.convertRoman(10));
	}
	
	@Test
	public void inputOf49returnsXXXXIX() {
		assertEquals("XXXXIX", rn.convertRoman(49));
	}
	
	@Test
	public void inputOf50returnsL() {
		assertEquals("L", rn.convertRoman(50));
	}
	
	@Test
	public void inputOf75returnsLXXV() {
		assertEquals("LXXV", rn.convertRoman(75));
	}
	
	@Test
	public void inputOf90returnsXC() {
		assertEquals("XC", rn.convertRoman(90));
	}
	
	@Test
	public void inputOf99returnsXCIX() {
		assertEquals("XCIX", rn.convertRoman(99));
	}
	
	@Test
	public void inputOf100returnsC() {
		assertEquals("C", rn.convertRoman(100));
	}
	
	@Test
	public void inputOf400returnsCD() {
		assertEquals("CD", rn.convertRoman(400));
	}
	
	@Test
	public void inputOf500returnsD() {
		assertEquals("D", rn.convertRoman(500));
	}
	
	@Test
	public void inputOf900returnsCM() {
		assertEquals("CM", rn.convertRoman(900));
	}

}
