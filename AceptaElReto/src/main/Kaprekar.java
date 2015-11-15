package main;

import java.util.Scanner;

public class Kaprekar {

	private static int[] numeros = new int[4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			System.out.println("Introduzca el numero");
			String num = sc.next();

			// separar numeros para el array
			for (int j = 0; j < num.length(); j++) {
				numeros[j] = num.charAt(j) - '0';
			}
			
			for (int k = 1; k < numeros.length; k++) {
				for (int l = 0; l < numeros.length - 1; l++) {
					if (numeros[l] < numeros[l+1])
	                {
	                    int tmp = numeros[l];
	                    numeros[l] = numeros[l+1];
	                    numeros[l] = tmp;
	                }
				}
				
			}
			for (int m = 0; m < numeros.length; m++) {
				System.out.println(numeros[m]+"\t");
				
			}
		}
		sc.close();
	}

}
