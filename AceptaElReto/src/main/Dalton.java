package main;

import java.util.Scanner;

public class Dalton {

	// funciona pero no enviado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int viñetas = 1;
		String respuesta = "";
		do {
			viñetas = sc.nextInt();
			if (viñetas == 0) {
				break;
			}
			int a = sc.nextInt();
			for (int i = 1; i < viñetas; i++) {
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
		} while (viñetas != 0);
		sc.close();
	}

}
