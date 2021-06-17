package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	public static void main(String[] args) {
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj
		
		int a,b;
		
		for (;;) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesite parni broj"));
			
			if (a%2==0) {
				break;	
			}
			JOptionPane.showMessageDialog(null, "Nisi unio parni broj");
		}
	
		
		for (;;) {
			b = Integer.parseInt(JOptionPane.showInputDialog("Unesite parni broj"));
			
			if (b%2==0) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Nisi unio parni broj");
		}
		
		
		
	System.out.println(a+b);	
	}
	

	

}
