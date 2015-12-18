package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DosIgualdadesSorprendentes {
	public static List<Integer> base = new ArrayList<Integer>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		base.add(0, 0);
		base.add(1, 1);
		base.add(2, 1);
		base.add(3, 1);
		Integer n = sc.nextInt();
		carga(n);
		sc.close();
	}

	private static void carga(Integer n) {
		List<Integer> matriz = new ArrayList<Integer>(base);
		for (int i = 1; i < n; i++) {
			List<Integer> temp = new ArrayList<>(matriz);
			matriz.set(0, temp.get(0) * base.get(0) + temp.get(1) * base.get(2));
			matriz.set(1, temp.get(0) * base.get(1) + temp.get(1) * base.get(3));
			matriz.set(2, temp.get(2) * base.get(0) + temp.get(3) * base.get(2));
			matriz.set(3, temp.get(2) * base.get(1) + temp.get(3) * base.get(3));
		}
		Integer respuesta = matriz.get(1) % 46337;
		System.out.println(respuesta);
		Integer m = sc.nextInt();
		if (m != 0) {
			carga(m);
		}
	}
}
