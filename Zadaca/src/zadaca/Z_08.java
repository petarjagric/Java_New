package zadaca;

import javax.swing.JOptionPane;

public class Z_08 {
	public static void main(String[] args) {
		
		//Korisnik unosi cijeli broj
		//Program ispisuje broj 7 jedno ispod drugog
		//onoliko puta koliko je korisnik unio
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		
		for (int i=0;i<a;i++) {
			System.out.println(7);
		}
		
		
		
	}

}
