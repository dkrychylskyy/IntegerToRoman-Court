package dk.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanAppTest {

	@Test
	public void testConvertIntToRoman1_I() {
		String expected = "I";
		String actual = IntegerToRomanApp.convertIntToRoman(1);
		assertEquals(expected, actual);
	}
	@Test
	public void testConvertIntToRoman4_IV() {
		String expected = "IV";
		String actual = IntegerToRomanApp.convertIntToRoman(4);
		assertEquals(expected, actual);
	}
	@Test
	public void testConvertIntToRoman5_V() {
		String expected = "V";
		String actual = IntegerToRomanApp.convertIntToRoman(5);
		assertEquals(expected, actual);
	}
	@Test
	public void testConvertIntToRoman10_X() {
		String expected = "X";
		String actual = IntegerToRomanApp.convertIntToRoman(10);
		assertEquals(expected, actual);
	}
	@Test
	public void testConvertIntToRoman30_XXX() {
		String expected = "XXX";
		String actual = IntegerToRomanApp.convertIntToRoman(30);
		assertEquals(expected, actual);
	}
	@Test
	public void testConvertIntToRoman50_L() {
		String expected = "L";
		String actual = IntegerToRomanApp.convertIntToRoman(50);
		assertEquals(expected, actual);
	}

}
