package edunova;

public class K1_ForBeskonacnaPetlja {
	
	public static void main(String[] args) {
		// Ovo nije beskona�na petlja jer
		//Integer.MAX_VALUE + 1 nije ve�e on 0
		for(int i=2;i>0;i++) {
			
		}
		
		//"prljava" beskona�na petlja
		for(int i=2;i>0;i++) {
			i--;
		}
		
		// java sintaksa for beskona�ne petlje
		for(;;) {
			
		}
	}

}
