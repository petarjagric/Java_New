package edunova.primjer2;

import javax.swing.JOptionPane;

public class Program {

	private Mjesto mjesto;

	public Program() {
		mjesto = new Mjesto();
		ucitajMjesto();
		ispisiDetalje();
	}
	
	private void ispisiDetalje() {
		// ispi�i broj stanovnika mjesta

		// ispi�i naziv mjesta

		// ispi�i naziv �upanije

	}

	private void ucitajMjesto() {
		mjesto.setNaziv(JOptionPane.showInputDialog("Unesi naziv mjesta"));
		mjesto.setBrojStanovnika(Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stanovnika")));
		mjesto.setZupanija(ucitajZupaniju());
	}

	private Zupanija ucitajZupaniju() {
		Zupanija zupanija = new Zupanija();

		zupanija.setNaziv(JOptionPane.showInputDialog("Unesi naziv �upanije"));
		zupanija.setZupan(JOptionPane.showInputDialog("Unesi �upana"));

		return zupanija;
	}

	public static void main(String[] args) {
		new Program();
	}

}
