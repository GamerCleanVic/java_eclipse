package br.com.abc.javacore.expressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner("1 true 100 oi");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		System.out.println("-------------------------");
		Scanner sc2 = new Scanner("1 true 100 oi");
		while (sc2.hasNext()) {
			if (sc2.hasNextInt()) {
				int i = sc2.nextInt();
				System.out.println("Int: " + i);
			} else if (sc2.hasNextBoolean()) {
				boolean status = sc2.nextBoolean();
				System.out.println("Boolean: " + status);
			} else {
				System.out.println("String: " + sc2.next());
			}
		}
	}
}
