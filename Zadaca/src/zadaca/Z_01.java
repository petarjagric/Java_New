package zadaca;

import javax.swing.JOptionPane;

public class Z_01 {
	public static void main(String[] args) {
		
		/* Zadatak 1
		 korisnik unosi cijeli broj
		 za parni broj se ispisuje Osijek
		 za neparni broj se ispisuje Donji Miholjac
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli braoj"));
		
		if (a%2==0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Donji Miholjac");
		}*/
		
		
		
		
		
		/*
		 dodatno zadatak 1
	 	 U sluèaju unosa parnog broja tražiti unos
		 dva cijela broja i ispisati zbroj
		 u sluèaju unosa neparnog broja tražiti unos
	 	 decimalnog broja i ispisati samo cijeli dio
		*/
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input a whole number"));
		
		if (a%2==0) {
			int b;
			b = Integer.parseInt(JOptionPane.showInputDialog("Input a second whole number"));	
			System.out.println(a+b);
		}else {
			float c;
			c = Float.parseFloat(JOptionPane.showInputDialog("Input a decimal number"));
			System.out.println((a+c)%2==0);
		}
	}

}
