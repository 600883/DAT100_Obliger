package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class ObligO3 {

	public static void main(String[] args) {
		
	
		
		String tallFakultet = showInputDialog("Skriv inn et tall: ");
		int n = Integer.parseInt(tallFakultet);
		int x = 1;
		
	    for (; n > 0; n--) {
	    	
	    	x = n*x;
			
	    }
		
	    showMessageDialog(null, "Fakultet " + tallFakultet + "!" + " er " +  x);
	}

}
