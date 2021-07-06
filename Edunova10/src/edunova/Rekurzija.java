package edunova;

public class Rekurzija {
	
	public Rekurzija() {
	
		//zbrajanje prvih 100 brojeva
		int zbroj =0;
		for(int i=0;i<=100;i++) {
			zbroj+=i;
		}
		System.out.println(zbroj);
		
		System.out.println(suma(100));
		
	}
	
	private int suma(int broj) {
		// klju�na stvar rekurzije: Uvjet izlaska iz rekurzije
		// izlazi se kada vi�e ne zove� samog sebe
		if(broj==0) {
			return 0;
		}
		//funkcija zove samu sebe - REKURZIJA
		return broj + suma(broj-1);
	}
	// 100 + 99 + .... + 1 + 0;
	
	public static void main(String[] args) {
		new Rekurzija();
	}

}
