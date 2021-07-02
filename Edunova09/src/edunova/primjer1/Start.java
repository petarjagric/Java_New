package edunova.primjer1;

import javax.swing.JOptionPane;

public class Start {
	
	private Olovka[] olovke;
	
	public Start() {
		olovke = new Olovka[3];
		ucitajOlovke();
		ispisiUcitano();
	}
	
	private void ispisiUcitano() {
		for(Olovka olovka: olovke) {
			System.out.println(olovka.getMaterijal() +
					" " + olovka.getBoja());
		}
		//ispisati ukupnu du�inu svih unesenih olovaka
		System.out.println(ukupnaDuzinaOlovaka());
	}

	private int ukupnaDuzinaOlovaka() {
		int u=0;
		for(Olovka o: olovke) {
			u+=o.getDuzina();
		}
		return u;
	}

	private void ucitajOlovke() {
		Olovka olovka;
		for(int i=0;i<3;i++) {
			olovka = new Olovka();
			olovka.setBoja(JOptionPane.showInputDialog((i+1) + ". boja"));
			olovka.setMaterijal(JOptionPane.showInputDialog((i+1) + ". materijal"));
			olovka.setDuzina(
					Integer.parseInt(
							JOptionPane.showInputDialog((i+1) + ". du�ina")
							)
					);
			olovke[i]=olovka;
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
