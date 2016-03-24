
public class RomanNumerals {

	public String convertRoman(int i) {
		String roman = "";
		for (int c = i; c > 0;) {
			roman += "I";
			c -= 1;
		}
		return roman;
	}

}
