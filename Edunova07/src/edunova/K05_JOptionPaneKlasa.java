package edunova;

import javax.swing.JOptionPane;

public class K05_JOptionPaneKlasa {
	
	public static void main(String[] args) {
		String s ="Pero";
		
		// ovo nije mogu�e
		//JOptionPane j = "";
		
		// MO�emo s klase koristiti stati�ne metode
		if(JOptionPane.showConfirmDialog(null, "Sigurno?")
				==JOptionPane.OK_OPTION) {
			System.out.println("Kliknuo si OK");
		}
		
		// showConfirmDialog je stati�na metoda
		// stati�nim metoda pristupamo putem naziva klase pa .
		
		// pozvati mail metodu iz K01_While
		//K01_While.main(null);
	}

}
