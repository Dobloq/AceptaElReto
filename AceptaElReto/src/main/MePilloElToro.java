package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//funciona
public class MePilloElToro {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		carga(sc.nextInt());
	}

	public static void carga(int n) {
		// Se crean listas para almacenar las notas y los nombres
		List<Integer> notas = new ArrayList<>();
		List<String> nombres = new ArrayList<>();
		// Se limpia la entrada
		sc.nextLine();
		// Para cada ejercicio
		for (int i = 0; i < n; i++) {
			String nombreTemp = sc.nextLine();
			String notaTemp = sc.nextLine();
			// Si ya existe el nombre, se actualiza la nota
			if (nombres.contains(nombreTemp)) {
				int posicion = nombres.indexOf(nombreTemp);
				notas.set(posicion, notas.get(posicion) + calcularNota(notaTemp));
				// Si no se añaden
			} else {
				nombres.add(nombreTemp);
				// Se añade el nuevo y se ordena
				Collections.sort(nombres);
				// Se busca donde se ha colocado el nuevo y se coloca su nota en
				// la misma posicion
				int posicion = nombres.indexOf(nombreTemp);
				notas.add(posicion, calcularNota(notaTemp));
			}
		}
		// Se muestra cuando la nota no sea 0
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i).equals(0)) {
				continue;
			}
			System.out.println(nombres.get(i) + ", " + notas.get(i));
		}
		System.out.println("---");
		int m = sc.nextInt();
		if (m != 0) {
			carga(m);
		}
	}

	public static int calcularNota(String nota) {
		if (nota.equals("CORRECTO")) {
			return 1;
		} else
			return -1;
	}

}
