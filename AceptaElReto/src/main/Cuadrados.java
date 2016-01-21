package main;

import java.util.Scanner;

public class Cuadrados {
	private static String tipo = "NO";
	private static int[][] c = new int[0][0];
	private static int CM = 0;

	// no terminado
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			c = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = sc.nextInt();
				}
			}
			System.out.println("0 para terminar");
		} while (n != 0);

		// filas
		for (int i = 0; i < c.length - 1; i++) {
			if (fila(i, n) != fila(i + 1, n) || columna(i, n) != columna(i + 1, n)) {
				System.out.println(tipo);
				break;
			} else {
				tipo = "ESOTERICO";
				System.out.println(tipo);
			}
		}

		// mostrar matriz
		for (int k = 0; k < c.length; k++) {
			for (int l = 0; l < c.length; l++) {
				System.out.print(c[k][l] + "\t");
			}
			System.out.println("");
		}
		sc.close();
	}

	public static Integer fila(int a, int n) {
		for (int j = 0; j < n; j++) {
			CM += c[a][j];
		}
		return CM;
	}

	public static Integer columna(int a, int n) {
		for (int j = 0; j < n; j++) {
			CM += c[j][a];
		}
		return CM;
	}

	public static Integer diagonal(int a, int n) {
		for (int j = 0; j < n; j++) {
			CM += c[a][a];
		}
		return CM;
	}

}
