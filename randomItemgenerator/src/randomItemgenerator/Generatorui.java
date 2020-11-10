package randomItemgenerator;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;

public class Generatorui {
	
	private JFrame frame;
	private JTextField textField;
	
	
	public Generatorui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(UIManager.getFont("ColorChooser.font"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 698, 411);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kurzschwert");
		rdbtnNewRadioButton.setBounds(8, 8, 120, 15);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnLongSword = new JRadioButton("Langschwert");
		rdbtnLongSword.setBounds(132, 8, 120, 15);
		frame.getContentPane().add(rdbtnLongSword);
		
		JRadioButton rdbtnDolch = new JRadioButton("Dolch");
		rdbtnDolch.setBounds(256, 8, 71, 15);
		frame.getContentPane().add(rdbtnDolch);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Stab");
		rdbtnNewRadioButton_1.setBounds(331, 8, 71, 15);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnBogen = new JRadioButton("Bogen");
		rdbtnBogen.setBounds(406, 8, 78, 15);
		frame.getContentPane().add(rdbtnBogen);
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setEditable(false);
		txtpnTest.setBounds(12, 88, 468, 279);
		frame.getContentPane().add(txtpnTest);
		
		textField = new JTextField();
		textField.setBounds(8, 53, 71, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(83, 57, 70, 15);
		frame.getContentPane().add(lblLevel);
		
		JButton btnNewButton_1 = new JButton("Generieren");
		btnNewButton_1.setBounds(508, 308, 174, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(492, 8, 63, 371);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnFeuer = new JRadioButton("Feuer");
		rdbtnFeuer.setBounds(508, 34, 149, 23);
		frame.getContentPane().add(rdbtnFeuer);
		
		JRadioButton rdbtnWind = new JRadioButton("Wind");
		rdbtnWind.setBounds(508, 61, 149, 23);
		frame.getContentPane().add(rdbtnWind);
		
		JRadioButton rdbtnEis = new JRadioButton("Eis");
		rdbtnEis.setBounds(508, 86, 149, 23);
		frame.getContentPane().add(rdbtnEis);
		
		JRadioButton rdbtnBlitz = new JRadioButton("Blitz");
		rdbtnBlitz.setBounds(508, 113, 149, 23);
		frame.getContentPane().add(rdbtnBlitz);
		
		JRadioButton rdbtnLicht = new JRadioButton("Licht");
		rdbtnLicht.setBounds(508, 140, 149, 23);
		frame.getContentPane().add(rdbtnLicht);
		
		JRadioButton rdbtnFinsterniss = new JRadioButton("Finsterniss");
		rdbtnFinsterniss.setBounds(508, 167, 149, 23);
		frame.getContentPane().add(rdbtnFinsterniss);
		
		JLabel lblEffekt = new JLabel("Effekte");
		lblEffekt.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEffekt.setBounds(508, 12, 120, 15);
		frame.getContentPane().add(lblEffekt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("Button.disabledText"));
		separator_1.setBounds(0, 29, 694, 7);
		frame.getContentPane().add(separator_1);
	}

	public JFrame getFrame() {
		return frame;
	}
}
