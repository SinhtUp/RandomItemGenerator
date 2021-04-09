package randomItemgenerator;

import java.awt.EventQueue;



public class Mainprogramm {

	Bow bow = new Bow();
	
	static Generatorui window = new Generatorui();
	
	
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
	
		
	
	
	}

	
	
	
	
	
	
	
	
	
}
