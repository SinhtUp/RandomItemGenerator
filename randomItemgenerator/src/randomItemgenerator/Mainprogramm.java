package randomItemgenerator;

import java.awt.EventQueue;



public class Mainprogramm {

	Bow bow = new Bow();
	static Shortsword shortSword;
	static Generatorui window = new Generatorui();
	static Generateitem generateItem = new Generateitem();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generatorui window = new Generatorui();
					window.initialize();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	System.out.println(window.shortSwordselect);
	generateItem.Itemgeneration();
	
	
	}

	
	
	
	
	
	
	
	
	
}
