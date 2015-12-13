package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		do {
			frase = sc.nextLine();
			frase = Character.toLowerCase(frase.charAt(0)) + frase.substring(1);
			List<Character> c = new ArrayList<>();
			List<Character> d = new ArrayList<>();
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == ' ') {
					continue;
				}
				c.add(frase.charAt(i));
				d.add(frase.charAt(i));
			}
			Collections.reverse(d);
			if (c == d) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
			System.out.println(c);
			System.out.println(d);
		} while (frase != "XXX");
		sc.close();
	}

}
