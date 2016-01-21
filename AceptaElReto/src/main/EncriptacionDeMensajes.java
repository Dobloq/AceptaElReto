package main;

import java.util.Scanner;

public class EncriptacionDeMensajes {

	// puede que RTE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String b = "abcdefghijklmnopqrstuvwxyz";
		String descifrado = "";
		do {
			descifrado = "";
			Integer vocales = 0;
			String c = sc.nextLine();
			String cifrado;
			Integer desplazamiento;
			Integer cambio;
			String vocal = "aeiouAEIOU";
			if (c.charAt(0) == 'p') {
				descifrado = c.substring(1);
			} else {
				Character d = c.charAt(0);
				cifrado = c.substring(1);
				desplazamiento = d.compareTo('p');
				for (int i = 0; i < cifrado.length(); i++) {
					if (Character.isUpperCase(cifrado.charAt(i))) {
						cambio = a.indexOf(cifrado.charAt(i));
						descifrado += a.charAt(Math.abs(cambio - desplazamiento) % 26);
					} else {
						cambio = b.indexOf(cifrado.charAt(i));
						descifrado += b.charAt(Math.abs(cambio - desplazamiento) % 26);
					}

				}
			}
			for (int i = 0; i < descifrado.length(); i++) {
				if (vocal.indexOf(descifrado.charAt(i)) != -1) {
					vocales++;
				}

			}
			System.out.println(vocales);
			vocales = 0;
		} while (descifrado != "FIN");
		sc.close();
	}
}