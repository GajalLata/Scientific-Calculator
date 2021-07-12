import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
    double a;
    double b;
    double c;
    
    String operation;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private final ButtonGroup buttonGroup_2 = new ButtonGroup();
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		
		lblNewLabel.setBackground(new Color(0, 139, 139));
		lblNewLabel.setOpaque(true);
		add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		//lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 268, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(10, 45, 248, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=1/(Double.parseDouble( textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setBounds(10, 173, 51, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble( textField.getText());
				double c=a*a*a;
				textField.setText("");
				textField.setText(Double.toString(c));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_3.setBounds(10, 250, 51, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble( textField.getText());
				double sq=a*a;
				textField.setText("");
				textField.setText(Double.toString(sq));
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_4.setBounds(10, 288, 51, 40);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 double a=Double.parseDouble(textField.getText());
				 		double fact=1;
				 		 for(int i=1;i<=a;i++)
					  	  {
				 
					    	   fact=fact*a;
					    	   
				 	 	  }
				 		textField.setText("");
				 		textField.setText(Double.toString(fact));
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_5.setBounds(10, 329, 51, 40);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_4_1 = new JButton("4");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4_1.getText();
				textField.setText(number);
			}
		});
		
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_4_1.setBounds(60, 288, 51, 40);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("1");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_5_1.setBounds(60, 329, 51, 40);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("0");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_6_1.setBounds(60, 370, 101, 40);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_3_1 = new JButton("7");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_1.getText();
				textField.setText(number);
				
			}
			
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3_1.setBounds(60, 250, 51, 40);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_1.setBounds(60, 173, 51, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_4_2 = new JButton("5");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_4_2.setBounds(110, 288, 51, 40);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_5_2 = new JButton("2");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String number=textField.getText()+btnNewButton_5_2.getText();
					textField.setText(number);
				
			}
		});
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_5_2.setBounds(110, 329, 51, 40);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_3_2 = new JButton("8");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3_2.setBounds(110, 250, 51, 40);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_2_2 = new JButton("C");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_2_2.setBounds(110, 211, 51, 40);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.sin(Double.parseDouble( textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8.setBounds(110, 134, 51, 40);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_6_2_1_1 = new JButton(".");
		btnNewButton_6_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_2_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_6_2_1_1.setBounds(160, 370, 51, 40);
		frame.getContentPane().add(btnNewButton_6_2_1_1);
		
		JButton btnNewButton_5_2_1_1 = new JButton("3");
		btnNewButton_5_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String number=textField.getText()+btnNewButton_5_2_1_1.getText();
					textField.setText(number);
				
			}
		});
		btnNewButton_5_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_5_2_1_1.setBounds(160, 329, 51, 40);
		frame.getContentPane().add(btnNewButton_5_2_1_1);
		
		JButton btnNewButton_4_2_1_1 = new JButton("6");
		btnNewButton_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String number=textField.getText()+btnNewButton_4_2_1_1.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_4_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_4_2_1_1.setBounds(160, 288, 51, 40);
		frame.getContentPane().add(btnNewButton_4_2_1_1);
		
		JButton btnNewButton_3_2_1_1 = new JButton("9");
		btnNewButton_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_2_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3_2_1_1.setBounds(160, 250, 51, 40);
		frame.getContentPane().add(btnNewButton_3_2_1_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("<");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 //a=Double.parseDouble(textField.getText());
				 textField.setText(textField.getText().substring(0,textField.getText().length() - 1));
			}
		});
		btnNewButton_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_2_2_1_1.setBounds(160, 211, 51, 40);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_8_1_1 = new JButton("Cosh");
		btnNewButton_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton_8_1_1.setBounds(160, 173, 51, 40);
		frame.getContentPane().add(btnNewButton_8_1_1);
		
		JButton btnNewButton_2_2_1_1_1 = new JButton("+");
		btnNewButton_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
			     operation="+";
				//b=Double.parseDouble(textField.getText());
				
			}
		});
		btnNewButton_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_2_2_1_1_1.setBounds(210, 211, 51, 40);
		frame.getContentPane().add(btnNewButton_2_2_1_1_1);
		
		JButton btnNewButton_3_2_1_1_1 = new JButton("-");
		btnNewButton_3_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_3_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3_2_1_1_1.setBounds(210, 250, 51, 40);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1);
		
		JButton btnNewButton_4_2_1_1_1 = new JButton("*");
		btnNewButton_4_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_4_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_4_2_1_1_1.setBounds(210, 288, 51, 40);
		frame.getContentPane().add(btnNewButton_4_2_1_1_1);
		
		JButton btnNewButton_5_2_1_1_1 = new JButton("/");
		btnNewButton_5_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_5_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_5_2_1_1_1.setBounds(210, 329, 51, 40);
		frame.getContentPane().add(btnNewButton_5_2_1_1_1);
		
		JButton btnNewButton_6_2_1_1_1 = new JButton("=");
		btnNewButton_6_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(textField.getText());
				if(operation.equals("+"))
				{
					c=a+b;
					textField.setText(Double.toString(c));
				}
			  	if(operation=="-") {
					c=a-b;
					textField.setText(Double.toString(c));
				}
				if(operation=="*") {
					c=a*b;
					textField.setText(Double.toString(c));
				}
				if(operation=="/") {
					c=a/b;
					textField.setText(Double.toString(c));
				}
				if(operation=="%") {
					c=a%b;
					textField.setText(Double.toString(c));
				}
				if(operation=="x^y") {
					double c=1;
					 for(int i=0;i<b;i++) {
						 c=a*b;
					 }
					 textField.setText("");
					textField.setText(Double.toString(c));
					
				}
			}
		});
		btnNewButton_6_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6_2_1_1_1.setBounds(210, 370, 51, 40);
		frame.getContentPane().add(btnNewButton_6_2_1_1_1);
		
		JButton btnNewButton_8_1_1_2 = new JButton("Tanh");
		btnNewButton_8_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_8_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnNewButton_8_1_1_2.setBounds(210, 173, 51, 40);
		frame.getContentPane().add(btnNewButton_8_1_1_2);
		
		JButton btnNewButton_1_3 = new JButton("R");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.sqrt(Double.parseDouble( textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(10, 134, 51, 40);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("e^x");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.exp(Double.parseDouble( textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_4.setBounds(60, 134, 51, 40);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_5_3 = new JButton("+/-");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_5_3.setBounds(10, 370, 51, 40);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("Cos");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
				
			}
		});
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_4.setBounds(160, 134, 51, 40);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_6 = new JButton("Sinh");
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_5_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_6.setBounds(110, 172, 51, 40);
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("x^y");
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble( textField.getText());
			 	textField.setText("");
			 	operation="x^y";
				
			}
		});
		btnNewButton_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_7.setBounds(10, 211, 51, 40);
		frame.getContentPane().add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("%");
		btnNewButton_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_5_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_8.setBounds(60, 211, 51, 40);
		frame.getContentPane().add(btnNewButton_5_8);
		
		JButton btnNewButton_5_4_1 = new JButton("Tan");
		btnNewButton_5_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(Double.toString(t));
			}
		});
		btnNewButton_5_4_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_4_1.setBounds(210, 134, 51, 40);
		frame.getContentPane().add(btnNewButton_5_4_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6_2_1_1_1.setEnabled(true);
				btnNewButton_6_2_1_1.setEnabled(true);
	 btnNewButton_6_1.setEnabled(true);
				btnNewButton_5_2_1_1.setEnabled(true);
				btnNewButton_5_2_1_1_1.setEnabled(true);
		btnNewButton_5_3.setEnabled(true);
		btnNewButton_5_2.setEnabled(true);
		btnNewButton_5_1.setEnabled(true);
		btnNewButton_5.setEnabled(true);
		btnNewButton_4_2_1_1.setEnabled(true);
		btnNewButton_4_2_1_1_1.setEnabled(true);
btnNewButton_4_2.setEnabled(true);
btnNewButton_4_1.setEnabled(true);
btnNewButton_4.setEnabled(true);
btnNewButton_3.setEnabled(true);
btnNewButton_3_2_1_1.setEnabled(true);
btnNewButton_3_2_1_1_1.setEnabled(true);
btnNewButton_3_2.setEnabled(true);
btnNewButton_3_1.setEnabled(true);

btnNewButton_5_7.setEnabled(true);
btnNewButton_5_8.setEnabled(true);
btnNewButton_2_2.setEnabled(true);
btnNewButton_2_2_1_1_1.setEnabled(true);
btnNewButton_2_2_1_1.setEnabled(true);

btnNewButton_1_1.setEnabled(true);
btnNewButton_5_6.setEnabled(true);
btnNewButton_1.setEnabled(true);
btnNewButton_8_1_1.setEnabled(true);
btnNewButton_8_1_1_2.setEnabled(true);

btnNewButton_1_3.setEnabled(true);
btnNewButton_1_4.setEnabled(true);
btnNewButton_8.setEnabled(true);
btnNewButton_5_4.setEnabled(true);
btnNewButton_5_4_1.setEnabled(true);
			}
		});
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(20, 104, 51, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6_2_1_1_1.setEnabled(false);
				btnNewButton_6_2_1_1.setEnabled(false);
	 btnNewButton_6_1.setEnabled(false);
				btnNewButton_5_2_1_1.setEnabled(false);
				btnNewButton_5_2_1_1_1.setEnabled(false);
		btnNewButton_5_3.setEnabled(false);
		btnNewButton_5_2.setEnabled(false);
		btnNewButton_5_1.setEnabled(false);
		btnNewButton_5.setEnabled(false);
		btnNewButton_4_2_1_1.setEnabled(false);
		btnNewButton_4_2_1_1_1.setEnabled(false);
btnNewButton_4_2.setEnabled(false);
btnNewButton_4_1.setEnabled(false);
btnNewButton_4.setEnabled(false);
btnNewButton_3.setEnabled(false);
btnNewButton_3_2_1_1.setEnabled(false);
btnNewButton_3_2_1_1_1.setEnabled(false);
btnNewButton_3_2.setEnabled(false);
btnNewButton_3_1.setEnabled(false);

btnNewButton_5_7.setEnabled(false);
btnNewButton_5_8.setEnabled(false);
btnNewButton_2_2.setEnabled(false);
btnNewButton_2_2_1_1_1.setEnabled(false);
btnNewButton_2_2_1_1.setEnabled(false);

btnNewButton_1_1.setEnabled(false);
btnNewButton_5_6.setEnabled(false);
btnNewButton_1.setEnabled(false);
btnNewButton_8_1_1.setEnabled(false);
btnNewButton_8_1_1_2.setEnabled(false);

btnNewButton_1_3.setEnabled(false);
btnNewButton_1_4.setEnabled(false);
btnNewButton_8.setEnabled(false);
btnNewButton_5_4.setEnabled(false);
btnNewButton_5_4_1.setEnabled(false);	
			}
		});
		buttonGroup_2.add(rdbtnOff);
		rdbtnOff.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOff.setBounds(93, 104, 68, 23);
		frame.getContentPane().add(rdbtnOff);
	}

	private void add(JLabel lblNewLabel) {
		// TODO Auto-generated method stub
		
	}
}
