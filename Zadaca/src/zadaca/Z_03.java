package zadaca;

import javax.swing.JOptionPane;

public class Z_03 {
	public static void main(String[] args) {
		
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Input the frist whole number"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Input a second whole number"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Input a thrid whole number"));
		
		if (a<b) {
			System.out.println(a);
		}else if (b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
