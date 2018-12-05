import javax.swing.*;
import java.awt.*;
public class MassGui extends JFrame{
	
	//fields
	JTextField lbsInput = new JTextField(10);
	JTextField ozInput = new JTextField(10);
	JTextField gramInput = new JTextField(10);
	JTextField output = new JTextField(15);
	//Button
	JButton toLbs = new JButton("to Lbs");
	JButton toOz = new JButton("to Oz");
	JButton toGram = new JButton("to Grams");
	//Labels
	JLabel lbs = new JLabel("Lbs");
	JLabel oz = new JLabel("Oz");
	JLabel grams = new JLabel("Grams");
	//Panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());
	JPanel p5 = new JPanel(new FlowLayout());
	
	
	public MassGui(String title) {
		super(title);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,1));
		
		createp1();
		createp2();
		createp3();
		createp4();
		createp5();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
	}

	public void createp1() {
		p1.add(lbs);
		p1.add(lbsInput);
	}
	
	public void createp2() {
		p2.add(oz);
		p2.add(ozInput);
	}
	
	public void createp3() {
		p3.add(grams);
		p3.add(gramInput);
	}
	
	public void createp4() {
		p4.add(toLbs);
		p4.add(toOz);
		p4.add(toGram);
	}
	
	public void createp5() {
		p5.add(output);
	}
	
	public static void main(String[] args) {
		MassGui frame = new MassGui("Mass");
		frame.setVisible(true);
		
		
	}
}
