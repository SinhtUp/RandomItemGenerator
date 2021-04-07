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
import java.awt.Dimension;
import java.util.Locale;

public class Generatorui {
	
	private JFrame frmRandomItemGenerator;
	private JTextField textField;
	
	
	public Generatorui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRandomItemGenerator = new JFrame();
		frmRandomItemGenerator.setTitle("Random Item Generator (Beta)");
		frmRandomItemGenerator.setResizable(false);
		frmRandomItemGenerator.getContentPane().setLocale(Locale.GERMANY);
		frmRandomItemGenerator.getContentPane().setMaximumSize(new Dimension(720, 430));
		frmRandomItemGenerator.getContentPane().setFont(UIManager.getFont("ColorChooser.font"));
		frmRandomItemGenerator.getContentPane().setBackground(Color.GRAY);
		frmRandomItemGenerator.setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(100, 100, 720, 430);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRandomItemGenerator.getContentPane().setLayout(null);
		
		JRadioButton rdbtnShortsword = new JRadioButton("Kurzschwert");
		rdbtnShortsword.setBorder(null);
		rdbtnShortsword.setForeground(Color.BLACK);
		rdbtnShortsword.setBounds(8, 8, 120, 15);
		rdbtnShortsword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnShortsword);
		
		JRadioButton rdbtnLongSword = new JRadioButton("Langschwert");
		rdbtnLongSword.setBounds(132, 8, 120, 15);
		rdbtnLongSword.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLongSword);
		
		JRadioButton rdbtnDagger = new JRadioButton("Dolch");
		rdbtnDagger.setBounds(256, 8, 71, 15);
		rdbtnDagger.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnDagger);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Stab");
		rdbtnNewRadioButton_1.setBounds(331, 8, 71, 15);
		rdbtnNewRadioButton_1.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnBogen = new JRadioButton("Bogen");
		rdbtnBogen.setBounds(406, 8, 78, 15);
		rdbtnBogen.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnBogen);
		
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
		
		JRadioButton rdbtnFeuer = new JRadioButton("Feuer");
		rdbtnFeuer.setBounds(508, 34, 149, 23);
		rdbtnFeuer.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnFeuer);
		
		JRadioButton rdbtnWind = new JRadioButton("Wind");
		rdbtnWind.setBounds(508, 61, 149, 23);
		rdbtnWind.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnWind);
		
		JRadioButton rdbtnEis = new JRadioButton("Eis");
		rdbtnEis.setBounds(508, 86, 149, 23);
		rdbtnEis.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnEis);
		
		JRadioButton rdbtnBlitz = new JRadioButton("Blitz");
		rdbtnBlitz.setBounds(508, 113, 149, 23);
		rdbtnBlitz.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnBlitz);
		
		JRadioButton rdbtnLicht = new JRadioButton("Licht");
		rdbtnLicht.setBounds(508, 140, 149, 23);
		rdbtnLicht.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnLicht);
		
		JRadioButton rdbtnFinsterniss = new JRadioButton("Finsterniss");
		rdbtnFinsterniss.setBounds(508, 167, 149, 23);
		rdbtnFinsterniss.setBackground(null);
		frmRandomItemGenerator.getContentPane().add(rdbtnFinsterniss);
		
		JLabel lblEffekt = new JLabel("Effekte");
		lblEffekt.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEffekt.setBounds(508, 12, 120, 15);
		frmRandomItemGenerator.getContentPane().add(lblEffekt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("Button.disabledText"));
		separator_1.setBounds(0, 29, 694, 7);
		frmRandomItemGenerator.getContentPane().add(separator_1);
	}

	public JFrame getFrame() {
		return frmRandomItemGenerator;
	}
}
