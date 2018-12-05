import javax.swing.*;
import java.awt.*;

public class CurrencyGui extends JFrame{
	//choice strings
	private String[] FROM = new String[] {"USD","EURO","POUND","PESO","YEN","CSD"};
	private String[] TO = new String[] {"USD","EURO","POUND","PESO","YEN","CSD"};
	//labels
	JLabel input = new JLabel("Input currency");
	JLabel fromCurrency = new JLabel("From");
	JLabel toCurrency = new JLabel("To");
	JLabel outputL = new JLabel("Output");
	//Fields
	JTextField inputF = new JTextField(10);
	JTextField outputF = new JTextField(10);
	//Choice box
	JComboBox fromChoice = new JComboBox(FROM);
	JComboBox toChoice = new JComboBox(TO);
	//Button
	JButton run = new JButton("Convert");
	//panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());
	
	public CurrencyGui(String title) {
		super(title);
		setSize(300,250);
		setLayout(new GridLayout(4,1));
		
		createp1();
		createp2();
		createp3();
		createp4();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
	}
	
	public void createp1() {
		p1.add(input);
		p1.add(inputF);
	}
	
	public void createp2() {
		p2.add(fromCurrency);
		p2.add(fromChoice);
		p2.add(toCurrency);
		p2.add(toChoice);
	}
	
	public void createp3() {
		p3.add(run);
	}
	
	public void createp4() {
		p4.add(outputL);
		p4.add(outputF);
	}
	
	public static void main(String[] args) {
		CurrencyGui frame = new CurrencyGui("Currency");
		frame.setVisible(true);
	}
}