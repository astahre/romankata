
public class ArabicNumerals {

	public int convertArabic(String roman) {
		int x = roman.length();
		int []numArray = new int[roman.length()];
		for (int i = 0; i < x; i++) {
			char romanChar = roman.charAt(i);
			
			switch (romanChar) {
            	case 'I':  numArray[i] = 1;
                     break;
            	case 'V':  numArray[i] = 5;
            		break; 
            	case 'X':  numArray[i] = 10;
            		break; 
            	case 'L':  numArray[i] = 50;
        			break;
            	case 'C':  numArray[i] = 100;
        			break;  
            	case 'D':  numArray[i] = 500;
        			break; 
            	case 'M':  numArray[i] = 1000;
    				break; 
			}
		}
		
		int total = 0;
		for (int i = 0; i < x; i++) {
			total += numArray[i];
		}
		return total;
	}

}
