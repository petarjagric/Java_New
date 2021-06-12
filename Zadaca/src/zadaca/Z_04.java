package zadaca;

import javax.swing.JOptionPane;

public class Z_04 {
	public static void main(String[] args) {
		
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("unestie broj od 1-4"));
		
		if (a<1 || a>4) {
			System.out.println("Greška");
		} else {
			
			float b,c;
			b = Float.parseFloat(JOptionPane.showInputDialog("Unesite decimalni broj"));
			c = Float.parseFloat(JOptionPane.showInputDialog("Unesite decimalni broj"));
			
			float zbroj = b + c;
			float oduzimanje = b - c;
			float umnozak = b * c;
			float dijeljne = b / c;
			
			
		}
	}

}
