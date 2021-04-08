package randomItemgenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;


public class Generatorui {
	
	private JFrame frmRandomItemGenerator;
	private JTextField textField;
	boolean shortSwordselect, longSwordselect, daggerSelect, staffSelect, bowSelect, fireSelect, windSelect, iceSelect, lightningSelect, lightSelect, darknessSelect;
	public JRadioButton rdbtnShortsword, rdbtnLongSword, rdbtnDagger, rdbtnStaff, rdbtnBow, rdbtnFire, rdbtnWind, rdbtnIce, rdbtnLightning, rdbtnLight, rdbtnDarkness;
	
	/*========= zwischenablage===================
	 rdbtnShortsword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shortSwordselect == false && e.getSource() == rdbtnShortsword) {
					shortSwordselect = true;
					rdbtnLongSword.setSelected(false); rdbtnBow.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
					rdbtnStaff.setSelected(false); rdbtnShortsword.setSelected(false);
					
					shortSwordselect = false ; longSwordselect = false; daggerSelect = false; staffSelect = false; bowSelect = false;
					//prüfen ob ein output signal kommt
					System.out.println(shortSwordselect);
				}
				else if (shortSwordselect == true && e.getSource()== rdbtnShortsword) {
					shortSwordselect = false;
					//prüfen ob ein output signal kommt
					System.out.println(shortSwordselect);
					
				}
			}
		});
		*/
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public void initialize() {
		
		
		Actions generatorhandler = new Actions();
		
		frmRandomItemGenerator = new JFrame();
		frmRandomItemGenerator.setTitle("Random Item Generator (Beta)");
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
		rdbtnShortsword.addActionListener(generatorhandler);
		rdbtnShortsword.setBounds(8, 8, 120, 15);
		rdbtnShortsword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnShortsword);
		
		
		
		rdbtnLongSword = new JRadioButton("Langschwert");
		rdbtnLongSword.addActionListener(generatorhandler);
		rdbtnLongSword.setBounds(132, 8, 120, 15);
		rdbtnLongSword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLongSword);
		
		rdbtnDagger = new JRadioButton("Dolch");
		rdbtnDagger.addActionListener(generatorhandler);
		rdbtnDagger.setBounds(256, 8, 71, 15);
		rdbtnDagger.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnDagger);
		
		rdbtnStaff = new JRadioButton("Stab");
		rdbtnStaff.addActionListener(generatorhandler);
		rdbtnStaff.setBounds(331, 8, 71, 15);
		rdbtnStaff.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnStaff);
		
		rdbtnBow = new JRadioButton("Bogen");
		rdbtnBow.addActionListener(generatorhandler);
		rdbtnBow.setBounds(406, 8, 78, 15);
		rdbtnBow.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnBow);
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setEditable(false);
		txtpnTest.setBounds(12, 88, 468, 279);
		frmRandomItemGenerator.getContentPane().add(txtpnTest);
		
		textField = new JTextField();
		textField.setBounds(8, 53, 71, 23);
		frmRandomItemGenerator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(83, 57, 70, 15);
		frmRandomItemGenerator.getContentPane().add(lblLevel);
		
		JButton btnNewButton_1 = new JButton("Generieren");
		btnNewButton_1.setBounds(508, 308, 174, 59);
		frmRandomItemGenerator.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(492, 8, 63, 371);
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

	private class Actions implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
																	//händler für den kurzschwert Radialbutton
																if (shortSwordselect == false && e.getSource() == rdbtnShortsword) {
																	shortSwordselect = true;
																	rdbtnLongSword.setSelected(false); rdbtnBow.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
																	rdbtnStaff.setSelected(false);
																	
																	longSwordselect = false; daggerSelect = false; staffSelect = false; bowSelect = false;
																	//prüfen ob ein output signal kommt
																	System.out.println("kurzschwert "+shortSwordselect);
																}
																else if (shortSwordselect == true && e.getSource()== rdbtnShortsword) {
																	shortSwordselect = false;
																	//prüfen ob ein output signal kommt
																	System.out.println("kurzschwert "+shortSwordselect);
																	
																}
			
																
			//händler für den Bogen Radialbutton
			if (bowSelect == false && e.getSource() == rdbtnBow) {
			bowSelect = true;
			rdbtnLongSword.setSelected(false); rdbtnDagger.setSelected(false); rdbtnLongSword.setSelected(false); 
			rdbtnStaff.setSelected(false); rdbtnShortsword.setSelected(false);
							
			shortSwordselect = false ; longSwordselect = false; daggerSelect = false; staffSelect = false;
			//prüfen ob ein output signal kommt
			System.out.println("Bogen "+bowSelect);
			}
			else if (bowSelect == true && e.getSource()== rdbtnBow) {
			bowSelect = false;
			//prüfen ob ein output signal kommt
			System.out.println("Bogen "+bowSelect);
																		
																	}											
			
																
		}
	}
}
