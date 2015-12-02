package main;

import java.util.Scanner;

public class PalabrasPentavocalicas {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			datos();
		}

		sc.close();
	}

	public static void datos() {

		calcular(sc.nextLine());

	}

	private static void calcular(String palabra) {
		String respuesta = "NO";
		if (palabra.indexOf('a') != -1) {
			if (palabra.indexOf('e') != -1) {
				if (palabra.indexOf('i') != -1) {
					if (palabra.indexOf('o') != -1) {
						if (palabra.indexOf('u') != -1) {
							respuesta = "SI";
						}
					}
				}
			}
		}
		System.out.println(respuesta);
	}
}

// Scanner sc = new Scanner(System.in);
// Integer casos = sc.nextInt();
// sc.nextLine();
// for (int i = 0; i < casos; i++) {
// String palabra = sc.nextLine();
// String respuesta = "NO";
// if (palabra.indexOf('a') != -1) {
// if (palabra.indexOf('e') != -1) {
// if (palabra.indexOf('i') != -1) {
// if (palabra.indexOf('o') != -1) {
// if (palabra.indexOf('u') != -1) {
// respuesta = "SI";
// }
// }
// }
// }
// System.out.println(respuesta);
// }
// }
// sc.close();
