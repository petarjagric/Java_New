package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	public static void main(String[] args) {
		//Program unosi 2 broja i ispisuje zbroj
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		
		System.out.println(a+b);
	}
	
	
	
}
