package l7.one;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConverter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel label1 = new JLabel("Mile: ");
	JLabel label2 = new JLabel("Kilometer: ");
	JLabel label3 = new JLabel("Pound: ");
	JLabel label4 = new JLabel("Kilogram: ");
	JLabel label5 = new JLabel("Gallon: ");
	JLabel label6 = new JLabel("Liters: ");
	JLabel label7 = new JLabel("Fahrenheit: ");
	JLabel label8 = new JLabel("Centrigade: ");
	
	public MetricConverter() {
		setTitle("Metric Conversion Assistance");
		setBounds(150, 150, 550, 450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		label1.setBounds(50, 45, 50, 25);
		add(label1);
		JTextField jTF1 = new JTextField();
		jTF1.setBounds(100, 45, 100, 25);
		add(jTF1);
		
		label2.setBounds(240, 45, 62, 25);
		add(label2);
		JTextField jTF2 = new JTextField();
		jTF2.setBounds(320, 45, 100, 25);
		add(jTF2);
		
		label3.setBounds(50, 100, 50, 25);
		add(label3);
		JTextField jTF3 = new JTextField();
		jTF3.setBounds(100, 100, 100, 25);
		add(jTF3);
		
		label4.setBounds(240, 100, 62, 25);
		add(label4);
		JTextField jTF4 = new JTextField();
		jTF4.setBounds(320, 100, 100, 25);
		add(jTF4);
		
		label5.setBounds(50, 155, 50, 25);
		add(label5);
		JTextField jTF5 = new JTextField();
		jTF5.setBounds(100, 155, 100, 25);
		add(jTF5);
		
		label6.setBounds(240, 155, 50, 25);
		add(label6);
		JTextField jTF6 = new JTextField();
		jTF6.setBounds(320, 155, 100, 25);
		add(jTF6);
		
		label7.setBounds(25, 210, 75, 25);
		add(label7);
		JTextField jTF7 = new JTextField();
		jTF7.setBounds(100, 210, 100, 25);
		add(jTF7);
		
		label8.setBounds(230, 210, 75, 25);
		add(label8);
		JTextField jTF8 = new JTextField();
		jTF8.setBounds(320, 210, 100, 25);
		add(jTF8);
		
		JButton button = new JButton("Convert");
		button.setBounds(220, 300, 80, 40);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = jTF1.getText();
				String text2 = jTF3.getText();
				String text3 = jTF5.getText();
				String text4 = jTF7.getText();
				DecimalFormat df = new DecimalFormat("#.00");
				
				if (text1 != null && text1 != "") {
					double mile = Double.parseDouble(text1);
					double result = mile * 1.609;
					
					jTF2.setText(df.format(result));
				} else {
					jTF6.setText(String.valueOf(0));
				}
				
				if (text2 != null && text2 != "") {
					double pound = Double.parseDouble(text3);
					double result = pound * 0.453;
					
					jTF4.setText(df.format(result));
				} else {
					jTF6.setText(String.valueOf(0));
				}
				
				if (text3 != null && text3 != "") {
					double gallon = Double.parseDouble(text3);
					double result = gallon * 3.785;
					
					jTF6.setText(df.format(result));
				} else {
					jTF6.setText(String.valueOf(0));
				}
				
				if (text4 != null && text4 != "") {
					double farenheit = Double.parseDouble(text4);
					double result = (farenheit - 32.0) / 1.80;
					
					jTF8.setText(df.format(result));
				} else {
					jTF6.setText(String.valueOf(0));
				}
			}
		});
		
		add(jTF1);
		add(button);
	}

}
