package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	
	public static void main(String[] args) {
		
	// Program uèitava cijele brojeve od korisnika
	// sve dok se ne uèita broj 0. Tada se program završava
	
		int a;
		
		for (;;) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj \nNula prekida unos"));
			
		if (a==0) {
			break;
		}
		System.out.println(a);
		
		
	
}
}
}

