
public class ArabicNumerals {

	public int convertArabic(String roman) {
		int x = roman.length();
		int []numArray = new int[roman.length()];
		for (int i = 0; i < x; i++) {
			char romanChar = roman.charAt(i);
			if (romanChar == 'I') {
				numArray[i] = 1;
			} else {
				numArray[i] = 5;
			}
		}
		
		int total = 0;
		for (int i = 0; i < x; i++) {
			total += numArray[i];
		}
		return total;
	}

}
