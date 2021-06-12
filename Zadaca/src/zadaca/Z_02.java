package zadaca;

import javax.swing.JOptionPane;

public class Z_02 {
	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		if (a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}

}
