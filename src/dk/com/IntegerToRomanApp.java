package dk.com;

public class IntegerToRomanApp {
	static int numbers[] = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
	static String letters[] = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
	
	public static String convertIntToRoman(int nb) {
		String romanValue = "";
		while (nb > 0) {
			for (int i = 0; i < numbers.length; i++) {
				if (nb < numbers[i]) {
					nb -= numbers[i-1];
					romanValue += letters[i-1];
					break;
				}
			}
		}
		return romanValue;
	}
}
