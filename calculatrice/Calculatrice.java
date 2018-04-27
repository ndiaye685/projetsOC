import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JFrame {

	private JButton buttons [] = {
								new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), 
									new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), 
										new JButton("9"), new JButton("0"),new JButton("."), new JButton("="),
											new JButton("C"), new JButton("+"), new JButton("-"), new JButton("*"),
												new JButton("/")
						};
	private JPanel container = new JPanel();
	private JPanel keyboardContainer = new JPanel();
	private JPanel operatorContainer = new JPanel();
	private JPanel screenContainer = new JPanel();
	private	JLabel screen = new JLabel("0");
	private double number = 0.0d;
	private String operator = "";
	private boolean update = false;
	private boolean clicOperator = false;
	Dimension dim1 = new Dimension(50, 40);
	Dimension dim2 = new Dimension(50, 30);

	public Calculatrice() {
		this.setTitle("Calculette");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(260, 280);

		screen.setPreferredSize(new Dimension(220,30));
		screen.setHorizontalAlignment(JLabel.RIGHT);
		screenContainer.add(screen);
		screenContainer.setBorder(BorderFactory.createLineBorder(Color.black));

		keyboardContainer.setPreferredSize(new Dimension(165,225));
		operatorContainer.setPreferredSize(new Dimension(55,225));
		for(int i = 0; i < buttons.length; i++) {
			switch(i) {
				case 11 : 
					keyboardContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim1);
					buttons[i].addActionListener(new EqualListener());
					break;
				case 12 : 
					operatorContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim2);
					buttons[i].addActionListener(new ResetListener());
					break;
				case 13 :
					buttons[i].addActionListener(new AddListener());
					operatorContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim2);
					break;
				case 14 : 
					buttons[i].addActionListener(new SubstractListener());
					operatorContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim2);
					break;
				case 15 :
					buttons[i].addActionListener(new MultiplyListener());
					operatorContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim2);
					break;
				case 16 :
					buttons[i].addActionListener(new DivideListener());
					operatorContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim2);
					break;
				default :
					keyboardContainer.add(buttons[i]);
					buttons[i].setPreferredSize(dim1);
					buttons[i].addActionListener(new NumberListener());
			}
		}
		buttons[12].setPreferredSize(dim1);
		
	    container.add(screenContainer, BorderLayout.NORTH);
	    container.add(keyboardContainer, BorderLayout.CENTER);
	    container.add(operatorContainer, BorderLayout.EAST);
		this.setContentPane(container);
		this.setVisible(true);
	}

	class NumberListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String str = ((JButton)event.getSource()).getText();
			if(update) {
				update = false;
			} else if(screen.getText() != "0") {
				str = screen.getText() + str;
			}
			screen.setText(str);
		}
	}
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			update = true;
			operator = "+";
			if(clicOperator) {
				calcul();
				screen.setText(String.valueOf(number));
			} else {
				number = Double.valueOf(screen.getText()).doubleValue();
				clicOperator = true;
			}
		}
	}
	class SubstractListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			update = true;
			operator = "-";
			if(clicOperator) {
				calcul();
				screen.setText(String.valueOf(number));
			} else {
				number = Double.valueOf(screen.getText()).doubleValue();
				clicOperator = true;
			}
		}
	}
	class MultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			update = true;
			operator = "*";
			if(clicOperator) {
				calcul();
				screen.setText(String.valueOf(number));
			} else {
				number = Double.valueOf(screen.getText()).doubleValue();
				clicOperator = true;
			}
		}
	}
	class DivideListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			update = true;
			operator = "/";
			if(clicOperator) {
				calcul();
				screen.setText(String.valueOf(number));
			} else {
				number = Double.valueOf(screen.getText()).doubleValue();
				clicOperator = true;
			}
		}
	}
	class EqualListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			calcul();
			update = true;
			clicOperator = true;
		}
	}
	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			screen.setText("0");
			operator = "";
			update = true;
			clicOperator = true;
			number = 0;
		}
	}
	private void calcul() {
		if(operator.equals("+")) {
			number += Double.valueOf(screen.getText()).doubleValue();
			screen.setText(String.valueOf(number));
		}
		if(operator.equals("-")) {
			number -= Double.valueOf(screen.getText()).doubleValue();
			screen.setText(String.valueOf(number));
		}
		if(operator.equals("*")) {
			number *= Double.valueOf(screen.getText()).doubleValue();
			screen.setText(String.valueOf(number));
		}  
		if(operator.equals("/")) {
			number /= Double.valueOf(screen.getText()).doubleValue();
			screen.setText(String.valueOf(number));
		}
	}

}