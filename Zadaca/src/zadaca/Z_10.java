package zadaca;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z_10 {
	public static void main(String[] args) {
		
		int a,b,c,e,d;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		d = Integer.parseInt(JOptionPane.showInputDialog("Unesi cetvrti broj"));
		e = Integer.parseInt(JOptionPane.showInputDialog("Unesi peti broj"));
		
		int[] niz = {a,b,c,d,e};
		int najveciBroj = 0;
		
		System.out.println(Arrays.toString(niz));
		
		for (int i=0;i<niz.length;i++) {
			if (niz[i] > najveciBroj) {
				najveciBroj = niz[i];
			}
		}System.out.println(najveciBroj);
	}

}
