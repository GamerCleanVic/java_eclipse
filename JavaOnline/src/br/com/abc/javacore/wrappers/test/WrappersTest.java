package br.com.abc.javacore.wrappers.test;

public class WrappersTest {
	public static void main(String[] args) {
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10;
		float floatPrimitivo = 10;
		double doublePrimitivo = 10;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;

		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = new Integer("10");
		Long longWrapper = 10L;
		Float floatWrapper = new Float("10F");
		Double doubleWrapper = 10D;
		Character characterWrapper = '2';
		Boolean booleanWrapper = new Boolean("TrUe");

		System.out.println(booleanWrapper);
		String valor = "10";
		Float f = Float.parseFloat(valor);
		System.out.println("String to Float: " + f);
		System.out.println("É dígito? " + Character.isDigit('9'));
		System.out.println(characterWrapper + " é dígito? " + Character.isLetter(characterWrapper));
		System.out.println("Lower to Upper: " + Character.toUpperCase('b'));
	}
}
