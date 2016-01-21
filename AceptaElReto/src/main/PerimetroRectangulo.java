package main;

import java.util.Scanner;

public class PerimetroRectangulo {

	// funciona pero no enviado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < 0 || b < 0) {
				break;
			}
			System.out.println(a * 2 + b * 2);
		} while (5 < 6);
		sc.close();
	}

}
