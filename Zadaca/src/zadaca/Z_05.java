package zadaca;

import javax.swing.JOptionPane;

public class Z_05 {
	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		
		if (a+b>10 & a-b<0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Donji Miholjac");
		}
	}

}
