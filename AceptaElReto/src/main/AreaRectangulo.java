package main;

import java.util.Scanner;

public class AreaRectangulo {
	static Scanner sc = new Scanner(System.in);

	// funciona pero no enviado
	public static void main(String[] args) {
		carga();
		sc.close();
	}

	private static void carga() {
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		if (a1 < b1 && a2 < b2) {
			System.out.println((b1 - a1) * (b2 - a2));
			carga();
		}
	}

}
