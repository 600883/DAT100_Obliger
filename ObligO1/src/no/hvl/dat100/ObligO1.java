package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class ObligO1 {

	public static void main(String[] args) {
			
		String bruttoLonn = showInputDialog("Din bruttolønn: ?");
		int lonn = Integer.parseInt(bruttoLonn);
		
		double trinn0 = 0;
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		
		
		if (lonn >=0 && lonn <= 164100) {
			showMessageDialog(null, "Bruttolønnen din er " + bruttoLonn + "." + " Trinnskatten din er " + lonn * trinn0 + " kr");
		}
		
		else if (lonn >= 164101 && lonn <= 230950) {
			showMessageDialog(null, "Bruttolønnen din er " + bruttoLonn + "." + " Trinnskatten din er " + lonn * trinn1 + " kr");
		}
		
		else if (lonn >= 230951 && lonn <= 580650) {
			showMessageDialog(null, "Bruttolønnen din er " + bruttoLonn + "." + " Trinnskatten din er " + lonn * trinn2 + " kr");
		}
			
		else if (lonn >= 580651 && lonn <= 934050) {
			showMessageDialog(null, "Bruttolønnen din er " + bruttoLonn + "." + " Trinnskatten din er " + lonn * trinn3 + " kr");
		}	
		
		else if (lonn >= 934051) {
			showMessageDialog(null, "Bruttolønnen din er " + bruttoLonn + "." + " Trinnskatten din er " + lonn * trinn4 + " kr");
		}
		
		

	}

}
