package edunova;

public class Start {
	
	// �IVOTNI VIJEK OBJEKTA
	// 1. objekt je zami�ljen ali "ne �ivi" - vrijednost null
	private Osoba polaznik;

	public Start() {
		// osoba je objekt -- insnace variable
		// Objekt je instanca klase
		Osoba osoba = new Osoba(); // new poziva konstruktor

		System.out.println(osoba.getIme());

		// postavljanje vrijednosti
		osoba.setIme("Pero");

		// dohva�anje vrijednosti
		System.out.println(osoba.getIme());
		
		zivotniVrijekObjekta();
		
	}

	private void zivotniVrijekObjekta() {
		System.out.println(polaznik);
		// nullpointer exception
		System.out.println(polaznik.getIme());
		//2. konstruiranje objekta
		polaznik = new Osoba();
		
		//3. radni vijek
		polaznik.setIme("Marija");
		System.out.println(polaznik.getIme());
		
		//4. uni�tenje
		// NE moramo brinuti o uni�tenju jer to radi GC (Garbage Collector)
		
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
