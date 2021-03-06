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
	
	@Test
	public void inputofVReturns5() {
		assertEquals(5, an.convertArabic("V"));
	}
	
	@Test
	public void inputofXReturns10() {
		assertEquals(10, an.convertArabic("X"));
	}
	
	@Test
	public void inputOfLreturns50() {
		assertEquals(50, an.convertArabic("L"));
	}
	
	@Test
	public void inputOfCreturns100() {
		assertEquals(100, an.convertArabic("C"));
	}
	
	@Test
	public void inputOfDreturns500() {
		assertEquals(500, an.convertArabic("D"));
	}
	
	@Test
	public void inputOfMreturns1000() {
		assertEquals(1000, an.convertArabic("M"));
	}
	
	@Test
	public void inputOfMDCCCLXXXVIIIreturns1888() {
		assertEquals(1888, an.convertArabic("MDCCCLXXXVIII"));
	}
	
	@Test
	public void inputOfIVreturns4() {
		assertEquals(4, an.convertArabic("IV"));
	}
	
	@Test
	public void inputOfMCMXCVIIreturns1997() {
		assertEquals(1997, an.convertArabic("MCMXCVII"));
	}
	
	@Test
	public void inputOfIXreturns9() {
		assertEquals(9, an.convertArabic("IX"));
	}
	
	@Test
	public void inputOfMLXVIreturns1066() {
		assertEquals(1066, an.convertArabic("MLXVI"));
	}
	
	@Test
	public void inputOfMCMLXXXIXreturns1989() {
		assertEquals(1989, an.convertArabic("MCMLXXXIX"));
	}
	
	

}
