package main;

import java.util.Scanner;

public class CuerdaCometa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respuesta[] = new String[3];
		for (int j = 0; j < 3; j++) {
			Integer cordeles = sc.nextInt();
			Integer cuerda[] = new Integer[cordeles];
			Integer longitud = sc.nextInt();
			Integer coste[] = new Integer[cordeles];
			Integer casos = 0;
			Integer cuerdasMinimo = 0;
			Integer precio = 500;
			for (int i = 0; i < cordeles; i++) {
				cuerda[i] = sc.nextInt();
				coste[i] = sc.nextInt();
			}
			for (int i = 0; i < cuerda.length; i++) {
				if (cuerda[i] == longitud) {
					cuerdasMinimo = 2;
					if (coste[i] < precio) {
						precio = coste[i];
					}
					casos++;
					break;
				}
			}
			for (int i = 0; i < cuerda.length - 1; i++) {
				if (cuerda[i] + cuerda[i + 1] == longitud) {
					cuerdasMinimo = 2;
					if (coste[i] + coste[i + 1] < precio) {
						precio = coste[i] + coste[i + 1];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 2; i++) {
				if (cuerda[i] + cuerda[i + 2] == longitud) {
					cuerdasMinimo = 2;
					if (coste[i] + coste[i + 2] < precio) {
						precio = coste[i] + coste[i + 2];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 3; i++) {
				if (cuerda[i] + cuerda[i + 3] == longitud) {
					cuerdasMinimo = 2;
					if (coste[i] + coste[i + 3] < precio) {
						precio = coste[i] + coste[i + 3];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 2; i++) {
				if (cuerda[i] + cuerda[i + 1] + cuerda[i + 2] == longitud) {
					cuerdasMinimo = 3;
					if (coste[i] + coste[i + 1] + coste[i + 2] < precio) {
						precio = coste[i] + coste[i + 1] + coste[i + 2];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 3; i++) {
				if (cuerda[i] + cuerda[i + 1] + cuerda[i + 3] == longitud) {
					cuerdasMinimo = 3;
					if (coste[i] + coste[i + 1] + coste[i + 3] < precio) {
						precio = coste[i] + coste[i + 1] + coste[i + 3];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 3; i++) {
				if (cuerda[i] + cuerda[i + 3] + cuerda[i + 2] == longitud) {
					cuerdasMinimo = 3;
					if (coste[i] + coste[i + 3] + coste[i + 2] < precio) {
						precio = coste[i] + coste[i + 3] + coste[i + 2];
					}
					casos++;
				}
			}
			for (int i = 0; i < cuerda.length - 4; i++) {
				if (cuerda[i] + cuerda[i + 1] + cuerda[i + 2] + cuerda[i + 3] == longitud) {
					cuerdasMinimo = 4;
					if (coste[i] + coste[i + 1] + coste[i + 2] + coste[i + 3] < precio) {
						precio = coste[i] + coste[i + 1] + coste[i + 2] + coste[i + 3];
					}
					casos++;
				}
			}
			if (casos == 0) {
				respuesta[j] = "NO";
			} else {
				respuesta[j] = "SI " + casos + " " + cuerdasMinimo + " " + precio;
			}
		}
		for (int i = 0; i < respuesta.length; i++) {
			System.out.println(respuesta[i]);
		}
		sc.close();
	}
}
