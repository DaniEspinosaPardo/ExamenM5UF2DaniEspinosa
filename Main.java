package joc;

import java.util.Scanner;
import java.util.Random;

/**
 * Classe Main per inicialitzar el programa
 * 
 * @author Dani Espinosa
 * @version 1.0
 *
 */

public class Main {

	/**
	 * Mètode main per iniciar el programa
	 * 
	 * @param args
	 *            Vector d'arguments
	 * 
	 */

	public static void main(String[] args) {
		String paraulesSecretes[] = { "hola", "programació", "casa" };
		String paraulaATrobar = "";
		int index;
		System.out.println("Comença el joc!");

		Random rand = new Random();
		index = rand.nextInt(3);
		for (int i = 0; i < paraulesSecretes[index].length(); i++) {
			paraulaATrobar += "_";
		}

		System.out.println(paraulaATrobar);

		Scanner reader = new Scanner(System.in);

		int numErrors = 0;

		while (!paraulaATrobar.equals(paraulesSecretes[index]) && numErrors < 5) {
			if (!existeixLletra(reader.next().charAt(0), paraulesSecretes, paraulaATrobar, index)) {
				numErrors++;
			}
			System.out.println(paraulaATrobar);
		}
		reader.close();
	}

	/**
	 * Mètode que retorna true si la lletra introduida està en la paraula de la
	 * variable "paraulaATrobar" i si no retorna false.
	 * 
	 * @param nova
	 *            - Lletra que introdueix l'usuari
	 * @return boolean trobada
	 * 
	 */

	static public boolean existeixLletra(char novaLletra, String[] paraulesSecretes, String paraulaATrobar, int index) {
		boolean trobada = false;
		String paraulaSecreta = paraulaATrobar;
		paraulaATrobar = "";
		for (int i = 0; i < paraulesSecretes[index].length(); i++) {
			if (paraulesSecretes[index].charAt(i) == novaLletra) {
				paraulaATrobar += paraulesSecretes[index].charAt(i);
				trobada = true;
			} else {
				paraulaATrobar += paraulaSecreta.charAt(i);
			}
		}
		return trobada;
	}

}
