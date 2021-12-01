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

			System.out.print("Continuare? (s/n)");
			String yesNo = scanner.nextLine();

			if (yesNo.equals("n")) {
				continuare = false;
			} else if (yesNo.equals("s")) {
				continuare = true;
			} else {
				// ERRORE
			}
		}

		// riordina
		Collections.sort(wishlist);

		// print wishlist
		for (String s : wishlist) {
			System.out.println(s);
		}

		// scanner close
		scanner.close();

	}

}
