package main;

import java.util.Scanner;

public class ArbolesFibonacci {
	static Scanner sc = new Scanner(System.in);

	// funciona pero no enviado
	public static void main(String[] args) {
		carga(sc.nextInt());
	}

	private static void carga(int n) {
		if (n >= 0) {
			System.out.println(fib(n));
			String espacio = "   ";
			for (int i = n; i > 1; i--) {
				System.out.println(espacio + fib(n - 2));
				System.out.println(espacio + fib(n - 1));
				n--;
				espacio += "   ";
			}
			System.out.println("====");
			carga(sc.nextInt());
		}
	}

	private static Integer fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
