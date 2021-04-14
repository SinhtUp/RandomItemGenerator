package randomItemgenerator;



public class Generateitem  {
	
	//instanziierung von den waffen klassen
	
	Staff staff = new Staff();
	
	String ausgabe;
	
	
	

	public Generateitem(String weaponType, String modifikationType) {
		
		String weapon = weaponType;
		
		String modifikation = modifikationType;
		
		
		
		
			
			
			
			switch (weapon) {
			
			case "bow" : {
				ausgabe = "es ist ein Bogen";
				break;
				
			}
			
			case "dagger" : {
				ausgabe = "es ist ein Dolch";
				break;
				
			}
			
			case "longsword" : {
				ausgabe = "es ist ein Langschwert";
				break;
				
			}
			
			case "shortsword" : {
				ausgabe = "es ist ein Kurzschwert";
				break;
				
			}
			
			case "staff" : {
				ausgabe = "es ist ein Stab";
				break;
				
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + weapon);
			}
		
	}
	
	public Generateitem(int lvl) {
		int level = lvl;
		
	}




	public void berechnung() {
		
		
		
	}





}
