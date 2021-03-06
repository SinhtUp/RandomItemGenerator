package randomItemgenerator;

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;


public class Generatorui {
	
	private JFrame frmRandomItemGenerator;
	private JTextField textField;
	 public JTextPane txtoutput;
	//boolische werte sind vorerst �berfl�ssig geworden wird in zukunft n�tzlich sein
	boolean shortSwordselect, longSwordselect, daggerSelect, staffSelect, bowSelect, fireSelect, windSelect, iceSelect, lightningSelect, lightSelect, darknessSelect;
	private JRadioButton rdbtnShortsword, rdbtnLongSword, rdbtnDagger, rdbtnStaff, rdbtnBow, rdbtnFire, rdbtnWind, rdbtnIce, rdbtnLightning, rdbtnLight, rdbtnDarkness;
	
	/*========= zwischenablage===================
	
	*/
	
	

	
	
	


	public void initialize() {
		
		
		Weaponchoose weaponSelect = new Weaponchoose();
		
		frmRandomItemGenerator = new JFrame();
		frmRandomItemGenerator.setTitle("Random Item Generator (pre pre pre Alpha)");
		frmRandomItemGenerator.setResizable(false);
		frmRandomItemGenerator.getContentPane().setLocale(Locale.GERMANY);
		frmRandomItemGenerator.getContentPane().setMaximumSize(new Dimension(720, 430));
		frmRandomItemGenerator.getContentPane().setFont(UIManager.getFont("ColorChooser.font"));
		frmRandomItemGenerator.getContentPane().setBackground(Color.GRAY);
		frmRandomItemGenerator.setBackground(Color.LIGHT_GRAY);
		frmRandomItemGenerator.setBounds(100, 100, 720, 430);
		frmRandomItemGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRandomItemGenerator.getContentPane().setLayout(null);
		frmRandomItemGenerator.setVisible(true);
		
		rdbtnShortsword = new JRadioButton("Kurzschwert");
		rdbtnShortsword.addActionListener(weaponSelect);
		rdbtnShortsword.setBounds(8, 8, 120, 15);
		rdbtnShortsword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnShortsword);
		
		
		
		rdbtnLongSword = new JRadioButton("Langschwert");
		rdbtnLongSword.addActionListener(weaponSelect);
		rdbtnLongSword.setBounds(132, 8, 120, 15);
		rdbtnLongSword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLongSword);
		
		rdbtnDagger = new JRadioButton("Dolch");
		rdbtnDagger.addActionListener(weaponSelect);
		rdbtnDagger.setBounds(256, 8, 71, 15);
		rdbtnDagger.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnDagger);
		
		rdbtnStaff = new JRadioButton("Stab");
		rdbtnStaff.addActionListener(weaponSelect);
		rdbtnStaff.setBounds(331, 8, 71, 15);
		rdbtnStaff.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnStaff);
		
		rdbtnBow = new JRadioButton("Bogen");
		rdbtnBow.addActionListener(weaponSelect);
		rdbtnBow.setBounds(406, 8, 78, 15);
		rdbtnBow.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnBow);
		
		txtoutput = new JTextPane();
		txtoutput.setEditable(false);
		txtoutput.setBounds(12, 88, 468, 279);
		frmRandomItemGenerator.getContentPane().add(txtoutput);
		
		textField = new JTextField();
		textField.setBounds(8, 53, 71, 23);
		frmRandomItemGenerator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(83, 57, 70, 15);
		frmRandomItemGenerator.getContentPane().add(lblLevel);
		
		JButton btnGenerate = new JButton("Generieren");
		btnGenerate.setBounds(508, 308, 174, 59);
		frmRandomItemGenerator.getContentPane().add(btnGenerate);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.RED);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(492, 8, 14, 371);
		frmRandomItemGenerator.getContentPane().add(separator);
		
		rdbtnFire = new JRadioButton("Feuer");
		rdbtnFire.setBounds(508, 34, 149, 23);
		rdbtnFire.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnFire);
		
		rdbtnWind = new JRadioButton("Wind");
		rdbtnWind.setBounds(508, 61, 149, 23);
		rdbtnWind.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnWind);
		
		rdbtnIce = new JRadioButton("Eis");
		rdbtnIce.setBounds(508, 86, 149, 23);
		rdbtnIce.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnIce);
		
		rdbtnLightning = new JRadioButton("Blitz");
		rdbtnLightning.setBounds(508, 113, 149, 23);
		rdbtnLightning.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLightning);
		
		rdbtnLight = new JRadioButton("Licht");
		rdbtnLight.setBounds(508, 140, 149, 23);
		rdbtnLight.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLight);
		
		rdbtnDarkness = new JRadioButton("Finsterniss");
		rdbtnDarkness.setBounds(508, 167, 149, 23);
		rdbtnDarkness.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnDarkness);
		
		JLabel lblEffekt = new JLabel("Effekte");
		lblEffekt.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEffekt.setBounds(508, 12, 120, 15);
		frmRandomItemGenerator.getContentPane().add(lblEffekt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("Button.disabledText"));
		separator_1.setBounds(0, 29, 694, 7);
		frmRandomItemGenerator.getContentPane().add(separator_1);
		
	}

	private class Weaponchoose implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		//========================================================== H�ndler f�r radiale Buttons der waffenarten ==============================================================================//
															
																//h�ndler f�r den kurzschwert Radialbutton
																
																if (shortSwordselect == false && e.getSource() == rdbtnShortsword) {
																	shortSwordselect = true;
																	rdbtnLongSword.setSelected(false); rdbtnBow.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
																	rdbtnStaff.setSelected(false);
																	
																	longSwordselect = false; daggerSelect = false; staffSelect = false; bowSelect = false;
																	//Konstruktor initialisierung
																	Generateitem generateitemShortsword = new Generateitem("shortsword",null);
																	Generateitem generatelvl = new Generateitem(0);
																	System.out.println(generateitemShortsword.ausgabe);
																	//pr�fen ob ein output signal kommt
																	System.out.println("kurzschwert "+shortSwordselect);
																	//testen der textpaneausgabe in der anwendung
																	txtoutput.setText(generateitemShortsword.ausgabe);
																	
																}
																else if (shortSwordselect == true && e.getSource()== rdbtnShortsword) {
																	shortSwordselect = false;
																	//pr�fen ob ein output signal kommt
																	System.out.println("kurzschwert "+shortSwordselect);
																}
			
																
			//h�ndler f�r den Bogen Radialbutton
			
			if (bowSelect == false && e.getSource() == rdbtnBow) {
			bowSelect = true;
			rdbtnLongSword.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
			rdbtnStaff.setSelected(false); rdbtnShortsword.setSelected(false);
							
			shortSwordselect = false ; longSwordselect = false; daggerSelect = false; staffSelect = false;
			//Konstruktor initialisierung
			Generateitem generateitemBow = new Generateitem("bow", null);
			System.out.println(generateitemBow.ausgabe);
			//pr�fen ob ein output signal kommt
			System.out.println("Bogen " + bowSelect);
			txtoutput.setText(generateitemBow.ausgabe);
			}
			else if (bowSelect == true && e.getSource()== rdbtnBow) {
			bowSelect = false;
			//pr�fen ob ein output signal kommt
			System.out.println("Bogen "+ bowSelect);
			}											
			
																//h�ndler f�r den Langschwert Radialbutton
																
																if (longSwordselect == false && e.getSource() == rdbtnLongSword) {
																	longSwordselect = true;
																	rdbtnBow.setSelected(false); rdbtnDagger.setSelected(false); 
																	rdbtnStaff.setSelected(false); rdbtnShortsword.setSelected(false);
																	
																	shortSwordselect = false ; longSwordselect = true; daggerSelect = false; staffSelect = false; bowSelect = false;
																//Konstruktor initialisierung
																Generateitem generateitemLongsword = new Generateitem("longsword", null);
																System.out.println(generateitemLongsword.ausgabe);
																//pr�fen ob ein output signal kommt
																	System.out.println("langschwert " + longSwordselect);
																	txtoutput.setText(generateitemLongsword.ausgabe);
																}
																else if (longSwordselect == true && e.getSource()== rdbtnLongSword) {
																	longSwordselect = false;
																	
																//pr�fen ob ein output signal kommt
																	System.out.println("langschwert " + longSwordselect);
																}
																
		
			//h�ndler f�r den Dolch Radialbutton
			
			if (daggerSelect == false && e.getSource() == rdbtnDagger) {
			daggerSelect = true;
			rdbtnLongSword.setSelected(false); rdbtnBow.setSelected(false); rdbtnLongSword.setSelected(false); 
			rdbtnStaff.setSelected(false); rdbtnShortsword.setSelected(false);
																
			shortSwordselect = false ; longSwordselect = false; staffSelect = false; bowSelect = false;
			//Konstruktor initialisierung
			Generateitem generateitemDagger = new Generateitem("dagger", null);
			
			System.out.println(generateitemDagger.ausgabe);
			//pr�fen ob ein output signal kommt
			System.out.println("Dolch " + daggerSelect);
			txtoutput.setText(generateitemDagger.ausgabe);
			}
			else if (daggerSelect == true && e.getSource()== rdbtnDagger) {
			daggerSelect = false;
			//pr�fen ob ein output signal kommt
			System.out.println("Dolch " + daggerSelect);
			}
		
																//h�ndler f�r den Stab Radialbutton
																
																if (staffSelect == false && e.getSource() == rdbtnStaff) {
																	staffSelect = true;
																	rdbtnLongSword.setSelected(false); rdbtnBow.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
																	rdbtnShortsword.setSelected(false);
																	
																	shortSwordselect = false ; longSwordselect = false; daggerSelect = false; bowSelect = false;
																	//Konstruktor initialisierung
																	Generateitem generateitemStaff = new Generateitem("staff", null);
																	System.out.println(generateitemStaff.ausgabe);
																	//pr�fen ob ein output signal kommt
																	System.out.println("Stab " + staffSelect);
																	txtoutput.setText(generateitemStaff.ausgabe);
																}
																else if (staffSelect == true && e.getSource()== rdbtnStaff) {
																	staffSelect = false;
																	//pr�fen ob ein output signal kommt
																	System.out.println("Stab " + staffSelect);
																}
          
																
		//========================================================== H�ndler f�r radiale Buttons der Modifikatoren ==============================================================================//
		
			
																
		}
	}
}
