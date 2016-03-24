
public class RomanNumerals {

	public String convertRoman(int i) {
		String roman = "";
		for (int c = i; c > 0;) {
			if (c == 4) {
				roman += "IV";
				c -= 4;
			} else {
			    roman += "I";
			    c -= 1;
			}
		}
		return roman;
	}

}
