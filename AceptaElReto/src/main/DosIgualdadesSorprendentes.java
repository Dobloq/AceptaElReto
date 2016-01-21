package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DosIgualdadesSorprendentes {
	static List<Integer> base = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);

	// funciona pero no enviado
	public static void main(String[] args) {
		base.add(0, 0);
		base.add(1, 1);
		base.add(2, 1);
		base.add(3, 1);
		carga(sc.nextInt());
		sc.close();
	}

	private static void carga(Integer n) {
		List<Integer> matriz = new ArrayList<>(base);
		List<Integer> temp = new ArrayList<>(matriz);
		for (int i = 1; i < n; i++) {
			matriz.set(0, temp.get(0) * base.get(0) + temp.get(1) * base.get(2));
			matriz.set(1, temp.get(0) * base.get(1) + temp.get(1) * base.get(3));
			matriz.set(2, temp.get(2) * base.get(0) + temp.get(3) * base.get(2));
			matriz.set(3, temp.get(2) * base.get(1) + temp.get(3) * base.get(3));
			temp = new ArrayList<>(matriz);
		}
		Integer respuesta = matriz.get(1) % 46337;
		System.out.println(respuesta);
		Integer m = sc.nextInt();
		if (m != 0) {
			carga(m);
		}
	}
}
