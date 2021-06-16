package zadaca;

import javax.swing.JOptionPane;

public class Z_06 {
	public static void main(String[] args) {
		
		//Program učitava 5 decimalnih brojeva u niz
		//Program ispisuje prvi i posljednji element niza

		float[] a = { Float.parseFloat(JOptionPane.showInputDialog("Broj 1")),
				Float.parseFloat(JOptionPane.showInputDialog("Broj 2")),
				Float.parseFloat(JOptionPane.showInputDialog("Broj 3")),
				Float.parseFloat(JOptionPane.showInputDialog("Broj 4")),
				Float.parseFloat(JOptionPane.showInputDialog("Broj 5")) };
		System.out.println(a[0] + " - " + a[4]);
	}

}
