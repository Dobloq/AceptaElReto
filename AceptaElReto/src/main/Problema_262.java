package main;

import java.util.Scanner;

public class Problema_262 {
	public static Scanner sc = new Scanner(System.in);
//	 Ada, Babbage y Bernouilli
//	 1^p + 2^p + ...n^p
//	 entrada
//	 n p
//	 1 1
//	 2 2
//	 3 3
//	 4 3
//	 100 100
//	 0 0
//	 salida
//	 1
//	 5
//	 36
//	 100
//	 17171

	public static void main(String[] args) {
		carga();
	}

	public static void carga() {
		int n = sc.nextInt();
		int p = sc.nextInt();
		if (n != 0 && p != 0) {
			System.out.println(calcular(n, p) % 46337);
			carga();
		}
	}

	public static long calcular(int n, int p) {
		if (n == 1) {
			return 1;
		} else {
			return (long) ((int) Math.pow(n, p) + calcular(n - 1, p));
		}
	}

}
