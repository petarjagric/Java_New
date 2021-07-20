package edunova;

import javax.swing.JOptionPane;

public class PrimjerUPraksi {
	
	private Osoba osoba;
	
	public PrimjerUPraksi() {
		osoba = new Osoba();
		ucitajIme();
		ucitajGodine();
		System.out.println(osoba);
	}
	
	private void ucitajGodine() {
		while(true) {
			try {
				osoba.setGodine(
						Integer.parseInt(
						JOptionPane
						.showInputDialog("Unesi godine")
						));
				return;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	private void ucitajIme() {
		String ime;
		while(true) {
			ime = JOptionPane.showInputDialog("Unesi ime");
			if(ime.trim().equals("")) {
				continue;
			}
			if(ime.length()>50) {
				continue;
			}
			osoba.setIme(ime);
			return;
		}
	}

	public static void main(String[] args) {
		new PrimjerUPraksi();
	}
	
	
	private class Osoba{
		private String ime;
		private int godine;
		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime = ime;
		}
		public int getGodine() {
			return godine;
		}
		public void setGodine(int godine) {
			this.godine = godine;
		}
		
		@Override
		public String toString() {
			return getIme() + " " + getGodine();
		}
	}

}
