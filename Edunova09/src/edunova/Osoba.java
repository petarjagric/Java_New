package edunova;

// klasa je opisnik objekta
public class Osoba {
	
	//OOP princip u�ahurivanja
	//Klasa �e u�ahuriti (sakriti) svoja svojstva
	private String ime;
	
	//konstruktor
	// izvr�ava se pri izvo�enju dijal koda ... new ...
	public Osoba() {
		ime="Marko";
	}

	
	//i u�initi ih dostupna putem javnim get set metoda
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	

}
