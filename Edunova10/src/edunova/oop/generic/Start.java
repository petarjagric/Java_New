package edunova.oop.generic;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public Start() {
		
		// Lista je parametrizirana s generi�ki parametrom tipa String
		// �to zna�i da �e lista mo�i sadr�avati samo
		// instance klase String
		List<String> lista = new ArrayList<String>();
		lista.add("Edunova");
		//lista.add(22); // ne mo�e
		
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
