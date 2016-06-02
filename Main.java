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

	public static final int TOTAL_ERRORS = 5;

	/**
	 * Mètode main per iniciar el programa
	 * 
	 * @param args
	 *            Vector d'arguments
	 * 
	 */

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		String paraulesSecretes[] = { "hola", "programació", "casa" };
		String paraulaATrobar = "";
		int index;

		System.out.println("Comença el joc!");

		index = rand.nextInt(3);
		for (int i = 0; i < paraulesSecretes[index].length(); i++) {
			paraulaATrobar += "_";
		}

		System.out.println(paraulaATrobar);

		int numErrors = 0;

		while (!paraulaATrobar.equals(paraulesSecretes[index]) && numErrors < TOTAL_ERRORS) {
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
	 * @param novaLletra
	 *            - Lletra que introdueix l'usuari
	 * @param paraulesSecretes
	 *            - Conjunt de paraules secretes
	 * @param paraulaATrobar
	 *            - Paraula que ha de trobar l'usuari
	 * @param index
	 *            - posició de l'array on està la paraula secreta escollida.
	 * 
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
