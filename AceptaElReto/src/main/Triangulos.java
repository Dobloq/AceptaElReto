package main;

import java.util.Arrays;
import java.util.Scanner;

public class Triangulos {

	// funciona pero no enviado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		int[] lados = { 0, 0, 0 };
		for (int i = 0; i < casos; i++) {
			lados[0] = sc.nextInt();
			lados[1] = sc.nextInt();
			lados[2] = sc.nextInt();
			Arrays.sort(lados);
			if (lados[0] + lados[1] > lados[2]) {
				if (Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2)) > lados[2]) {
					System.out.println("ACUTANGULO");
				} else if (Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2)) < lados[2]) {
					System.out.println("OBTUSANGULO");
				} else {
					System.out.println("RECTANGULO");
				}
			} else {
				System.out.println("IMPOSIBLE");
			}
		}
		sc.close();
	}

}
