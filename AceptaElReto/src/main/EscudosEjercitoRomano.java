package main;

import java.util.Scanner;

public class EscudosEjercitoRomano {

	// funciona pero TLE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soldados;
		do {
			soldados = sc.nextInt();
			int escudos = carga(soldados);
			if (escudos == 0) {
				break;
			}
			System.out.println(escudos);
		} while (soldados != 0);
		sc.close();
	}

	private static int calcularEscudos(int n) {
		if (n == 1) {
			return 5;
		}
		int interiores = (int) Math.pow((Math.sqrt(n) - 2), 2);
		int laterales = n - interiores - 4;
		return interiores * 1 + laterales * 2 + 4 * 3;
	}

	private static int carga(int n) {
		int formacion;
		int escudos = 0;
		do {
			formacion = (int) Math.pow(Math.floor(Math.sqrt(n)), 2);
			escudos += calcularEscudos(formacion);
			n -= formacion;
		} while (n != 0);
		return escudos;
	}
}