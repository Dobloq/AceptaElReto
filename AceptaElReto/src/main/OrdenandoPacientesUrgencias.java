package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoPacientesUrgencias {

	// funciona pero TLE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		String entrada;
		sc.nextLine();
		List<Paciente> p = new ArrayList<Paciente>();
		for (int i = 0; i < casos; i++) {
			entrada = sc.nextLine();
			if (entrada.contains("I")) {
				p.add(new Paciente(i, entrada.substring(entrada.indexOf(' ') + 1, entrada.lastIndexOf(' ')),
						Integer.parseInt(entrada.substring(entrada.lastIndexOf(' ') + 1))));
			} else if (entrada.equals("A")) {
				Collections.sort(p);
				Collections.reverse(p);
				System.out.println(p.get(0));
				p.remove(0);
			}
			if (i == casos - 1) {
				System.out.println("----");
			}
		}
		sc.close();
	}

}

class Paciente implements Comparable<Paciente> {
	private Integer llegada;
	private String nombre;
	private Integer gravedad;

	Paciente(Integer llegada, String nombre, Integer gravedad) {
		this.llegada = llegada;
		this.nombre = nombre;
		this.gravedad = gravedad;
	}

	public int compareTo(Paciente p) {
		int respuesta = this.gravedad.compareTo(p.gravedad);
		if (respuesta == 0) {
			respuesta = p.llegada.compareTo(this.llegada);
		}
		return respuesta;
	}

	public String toString() {
		return this.nombre;
	}

}
