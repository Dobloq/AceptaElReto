package main;

import java.util.Scanner;

public class Dalton {

	// funciona pero no enviado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vi�etas = 1;
		String respuesta = "";
		do {
			vi�etas = sc.nextInt();
			if (vi�etas == 0) {
				break;
			}
			int a = sc.nextInt();
			for (int i = 1; i < vi�etas; i++) {
				int b = sc.nextInt();
				if (a != b - 1) {
					if (respuesta.equals("DESCONOCIDOS")) {
					} else {
						respuesta = "DESCONOCIDOS";
					}
				} else {
					a = b;
					if (respuesta.equals("DALTON")) {
					} else {
						respuesta = "DALTON";
					}
				}
			}
			System.out.println(respuesta);
		} while (vi�etas != 0);
		sc.close();
	}

}
