package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VacasPensantesVersionAnterior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short cubos;
		do {
			cubos = sc.nextShort();
			List<Short> comida = new ArrayList<Short>();
			short maximo = 0;
			short tmp = 0;
			for (int i = 0; i < cubos; i++) {
				comida.add(i, sc.nextShort());
			}
			short tamaño = (short) comida.size();
			for (int i = 0; i < tamaño; i++) {
				if (comida.get(0) > comida.get(comida.size() - 1)) {
					if (i % 2 == 0) {
						maximo += comida.get(0);
					} else {
						tmp += comida.get(0);
					}
					comida.remove(0);
				} else {
					if (i % 2 == 0) {
						maximo += comida.get(comida.size() - 1);
					} else {
						tmp += comida.get(comida.size() - 1);
					}
					comida.remove(comida.size() - 1);
				}
			}
			if (maximo > tmp) {
				System.out.println(maximo);
			} else {
				System.out.println(tmp);
			}
		} while (cubos != 0);
		sc.close();
	}

}
