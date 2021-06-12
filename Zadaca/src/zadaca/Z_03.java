package zadaca;

import javax.swing.JOptionPane;

public class Z_03 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci cijeli broj"));
		
		if (a>b) {
			System.out.println(a);
		}else if (b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
