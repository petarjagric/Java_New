package zadaca;

import javax.swing.JOptionPane;

public class Z_02 {
	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input the first whole number"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Input a second whole number"));
		
		if (a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}

}
