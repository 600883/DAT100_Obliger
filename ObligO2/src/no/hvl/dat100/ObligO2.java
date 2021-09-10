package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class ObligO2 {

	public static void main(String[] args) {

		// String poengTxt = showInputDialog("Hvor mange poeng fikk du på prøven? ");
		// int poeng = Integer.parseInt(poengTxt);

		// int antKarakter;

		String karakterA = "A";
		String karakterB = "B";
		String karakterC = "C";
		String karakterD = "D";
		String karakterE = "E";
		String karakterF = "F";

		// int sumKarakter = 0;

		for (int i = 1; i <= 10; i++) {
			// sumKarakter += poeng;

			String poengTxt = showInputDialog("Hvor mange poeng fikk du på prøven? ");
			int poeng = Integer.parseInt(poengTxt);

			if (poeng >= 0 && poeng <= 39)
				System.out.println("Du fikk karakteren " + karakterF);

			else if (poeng >= 40 && poeng <= 49)
				System.out.println("Du fikk karakteren " + karakterE);

			else if (poeng >= 50 && poeng <= 59)
				System.out.println("Du fikk karakteren " + karakterD);

			else if (poeng >= 60 && poeng <= 79)
				System.out.println("Du fikk karakteren " + karakterC);

			else if (poeng >= 80 && poeng <= 89)
				System.out.println("Du fikk karakteren " + karakterB);

			else if (poeng >= 90 && poeng <= 100)
				System.out.println("Du fikk karakteren " + karakterA);

			// while løkker for ugyldig poengsum??????

			else {
				
				System.out.println("!!! Ugyldig poengsum !!! Tast inn gyldig poengsum");
					i--;

			}

		}

	}
}