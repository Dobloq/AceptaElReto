package main;

import java.util.Scanner;

public class Atropodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			Integer nPatas = 0;
			Integer insectos = sc.nextInt();
			nPatas += insectos*6;
			Integer aracnidos = sc.nextInt();
			nPatas += aracnidos*8;
			Integer crustaceos = sc.nextInt();
			nPatas += crustaceos*10;
			Integer nMiriapodos = sc.nextInt();
			Integer anillos = sc.nextInt();
			nPatas += nMiriapodos*anillos*2;
			System.out.println(nPatas);
		}
		sc.close();
	}
}
