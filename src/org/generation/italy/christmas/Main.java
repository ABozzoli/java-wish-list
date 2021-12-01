package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// scanner init
		Scanner scanner = new Scanner(System.in);

		// dichiaraz. array
		ArrayList<String> wishlist = new ArrayList<String>();

		// loop
		boolean continuare = true;
		while (continuare) {

			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			String wish = scanner.nextLine();
			wishlist.add(wish);

			// counter lista
			if (wishlist.size() < 2) {
				System.out.println("La tua lista contine " + wishlist.size() + " desiderio");
			} else {
				System.out.println("La tua lista contine " + wishlist.size() + " desideri");
			}

			// scelta utente
			System.out.print("Continuare? (s/n) ");
			String yesNo = scanner.nextLine();

			// validatore
			boolean valid = false;
			while (!valid) {

				if (yesNo.equals("n")) {
					valid = true;
					continuare = false;
				} else if (yesNo.equals("s")) {
					valid = true;
					continuare = true;
				} else {
					System.out.print("Scelta non valida, rispondere con s/n ");
					yesNo = scanner.nextLine();
				}

			}

		}

		// riordina wishlist
		Collections.sort(wishlist);

		// print wishlist
		System.out.println("Ecco la tua lista:");
		for (String s : wishlist) {
			System.out.println(s);
		}

		// scanner close
		scanner.close();

	}

}
