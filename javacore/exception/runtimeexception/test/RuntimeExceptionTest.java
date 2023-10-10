package br.com.abc.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		Object o = "notNull";
		
		if(b != 0) {
			int c = a / b;
			System.out.println(c);
		}		
				
		for (int indexArray = 0; indexArray < 2; indexArray++) {
			int[] array1 = new int[2];
			array1[indexArray] = indexArray+1;
			if(indexArray < 2) {				
				System.out.println(array1[indexArray]);
			}
		}
	}
}
