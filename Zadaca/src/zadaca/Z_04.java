package zadaca;

import javax.swing.JOptionPane;

public class Z_04 {
	public static void main(String[] args) {

		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("unestie broj od 1-4"));

		float b, c;
		b = Float.parseFloat(JOptionPane.showInputDialog("Unesite decimalni broj"));
		c = Float.parseFloat(JOptionPane.showInputDialog("Unesite decimalni broj"));

		if (a < 1 || a > 4) {
			System.out.println("Greška");
		}

		if (a == 1) {
			System.out.println(b + c);
		} else if (a == 2) {
			System.out.println(b - c);
		} else if (a == 3) {
			System.out.println(b * c);
		} else if (a == 4) {
			System.out.println(b / c);
		}

	}

}
