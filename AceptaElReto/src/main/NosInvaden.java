package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NosInvaden {

	public static Scanner sc = new Scanner(System.in);
	public static List<Integer> enemigos = new ArrayList<Integer>();
	public static List<Integer> efectivos = new ArrayList<Integer>();
	public static Integer ciudades;
	public static Integer victorias = 0;

	public static void main(String[] args) {
		datos();
		calcular();
		victorias = 0;
		datos();
		calcular();
		sc.close();
	}

	private static void datos() {
		ciudades = sc.nextInt();

		for (int i = 0; i < ciudades; i++) {
			enemigos.add(i, sc.nextInt());
		}
		for (int i = 0; i < ciudades; i++) {
			efectivos.add(i, sc.nextInt());
		}
		Collections.sort(enemigos);
		// Collections.reverse(enemigos);
		Collections.sort(efectivos);
		Collections.reverse(efectivos);
	}

	private static void calcular() {
		for (int i = ciudades - 1; i > -1; i--) {
			if (enemigos.get(i) > efectivos.get(0)) {
				// System.out.println("Elimina el numero " + i + " de
				// enemigos -->" + enemigos.get(i));
				enemigos.remove(i);
			} else if (enemigos.get(i) <= efectivos.get(0)) {
				victorias++;
				// System.out.println("Elimina el numero " + i + " de
				// enemigos-->" + enemigos.get(i));
				// System.out.println("Elimina el numero " + 0 + " de
				// efectivos -->" + efectivos.get(0));
				efectivos.remove(0);
				enemigos.remove(i);
			}
		}
		// control
		// System.out.println(ciudades + "\t" + enemigos + "\t" +
		// efectivos);
		System.out.println(victorias);
	}
}
