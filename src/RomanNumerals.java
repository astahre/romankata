
public class RomanNumerals {

	public String convertRoman(int i) {
		String roman = "";
		for (int c = i; c > 0;) {
			if (c >= 1000) {
				roman += "M";
				c -= 1000;
			} else if (c >= 900) {
				roman += "CM";
				c -= 900;
			} else if (c >= 500) {
				roman += "D";
				c -= 500;
			} else if (c >= 400) {
				roman += "CD";
				c -= 400;
			} else if (c >= 100) {
				roman += "C";
				c -= 100;
			} else if (c >= 90) {
				roman += "XC";
				c -= 90;
			} else  if (c >= 50) {
				roman += "L";
				c -= 50;
			} else if (c >= 10) {
				roman += "X";
				c -= 10;
			} else if(c == 9) {
				roman += "IX";
				c -= 9;
			} else if (c >= 5) {
				roman += "V";
				c -= 5;
			} else if (c == 4){
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
