package Assignment7;

/**
 * 1. Calculator. As mentioned by professor in class.
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculater extends JFrame {
	private JTextField screen;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiple, divide,
			percentage, sign, equals, clear, point;
	int temp;
	float fNumber;
	float current; // store previous value

	int countOp; // store count of #click -> operation
	Stack<String> countEquals = new Stack<String>();
	float lastType; // store the last type of value
	boolean isFirst = true; // judge if the operation is the first one

	public Calculater() {

		setTitle("Calculator");
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	private void createComponents() {
		screen = new JTextField("0", 17);

		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");

		plus = new JButton("+");
		minus = new JButton("-");
		multiple = new JButton("*");
		divide = new JButton("/");
		percentage = new JButton("%");
		sign = new JButton("+/-");
		equals = new JButton("=");
		clear = new JButton("AC");
		point = new JButton(".");

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 1));
		JPanel level1 = new JPanel();
		level1.add(screen);
		con.add(level1);

		JPanel level2 = new JPanel();
		level2.add(clear);
		level2.add(sign);
		level2.add(percentage);
		level2.add(divide);
		con.add(level2);

		JPanel level3 = new JPanel();
		level3.add(seven);
		level3.add(eight);
		level3.add(nine);
		level3.add(multiple);
		con.add(level3);

		JPanel level4 = new JPanel();
		level4.add(four);
		level4.add(five);
		level4.add(six);
		level4.add(minus);
		con.add(level4);

		JPanel level5 = new JPanel();
		level5.add(one);
		level5.add(two);
		level5.add(three);
		level5.add(plus);
		con.add(level5);

		JPanel level6 = new JPanel();
		level6.add(zero);
		level6.add(point);
		level6.add(equals);
		con.add(level6);

	}

	private void addListeners() {

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("0");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("0");
					} else {
						screen.setText(screen.getText() + "0");
					}
				}
			}
		});

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("1");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("1");
					} else {
						screen.setText(screen.getText() + "1");
					}
				}
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if(isFirst && countOp>0){
					isFirst = false;
				}else{
				if (temp == 5) {
					screen.setText("2");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("2");
					} else {
						screen.setText(screen.getText() + "2");
					}
				}
			}}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("3");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("3");
					} else {
						screen.setText(screen.getText() + "3");
					}
				}
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("0");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("4");
					} else {
						screen.setText(screen.getText() + "4");
					}
				}
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("5");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("5");
					} else {
						screen.setText(screen.getText() + "5");
					}
				}
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("6");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("6");
					} else {
						screen.setText(screen.getText() + "6");
					}
				}
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("7");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("7");
					} else {
						screen.setText(screen.getText() + "7");
					}
				}
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("8");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("8");
					} else {
						screen.setText(screen.getText() + "8");
					}
				}
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp>0){
					isFirst = false;
				}
				countOp = 0;
				if (temp == 5) {
					screen.setText("9");
					temp = 0;
				} else {
					if (Float.parseFloat(screen.getText()) == 0) {
						screen.setText("9");
					} else {
						screen.setText(screen.getText() + "9");
					}
				}
			}
		});

		// add action to "+"
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp == 0){
					fNumber = Float.parseFloat(screen.getText());
					current = fNumber;
					screen.setText("0");
					countOp++;
					temp = 1;
					countEquals.push("+");
				}else
				if(isFirst && countOp > 0){
					temp = 1;
					countEquals.push("+");
				}else
				// single click of operation
				if (!isFirst && countOp == 0) {
					fNumber = Float.parseFloat(screen.getText());
					current = current + fNumber;
					screen.setText("0");
					temp = 1;
					countOp++;
					countEquals.push("+");
				} else {
					temp = 1;
					countEquals.push("+");
				}
			}
		});

		// add action to "-"
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp == 0){
					fNumber = Float.parseFloat(screen.getText());
					current = fNumber;
					screen.setText("0");
					countOp++;
					temp = 2;
					countEquals.push("-");
				}else
				if(isFirst && countOp > 0){
					temp = 2;
					countEquals.push("-");
				}else
				// single click of operation
				if (!isFirst && countOp == 0) {
					fNumber = Float.parseFloat(screen.getText());
					current = current - fNumber;
					screen.setText("0");
					temp = 2;
					countOp++;
					countEquals.push("-");
				} else {
					temp = 2;
					countEquals.push("-");
				}
			}
		});

		// add action to "*"
		multiple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp == 0){
					fNumber = Float.parseFloat(screen.getText());
					current = fNumber;
					screen.setText("0");
					countOp++;
					temp = 3;
					countEquals.push("*");
				}else
				if(isFirst && countOp > 0){
					temp = 3;
					countEquals.push("*");
				}else
				// single click of operation
				if (!isFirst && countOp == 0) {
					fNumber = Float.parseFloat(screen.getText());
					current = current * fNumber;
					screen.setText("0");
					temp = 3;
					countOp++;
					countEquals.push("*");
				} else {
					temp = 3;
					countEquals.push("*");
				}
			}
		});

		// add action to "/"
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirst && countOp == 0){
					fNumber = Float.parseFloat(screen.getText());
					current = fNumber;
					screen.setText("0");
					countOp++;
					temp = 4;
					countEquals.push("/");
				}else
				if(isFirst && countOp > 0){
					temp = 4;
					countEquals.push("/");
				}else
				// single click of operation
				if (!isFirst && countOp == 0) {
					fNumber = Float.parseFloat(screen.getText());
					current = current / fNumber;
					screen.setText("0");
					temp = 4;
					countOp++;
					countEquals.push("/");
				} else {
					temp = 4;
					countEquals.push("/");
				}
			}
		});

		// add action to "."
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// if num exists ".", do nothing
				if (screen.getText().contains(".")) {
				} else {
					if (screen.equals("0")) {
						screen.setText("0.");
					} else {
						screen.setText(screen.getText() + ".");
					}
				}
			}
		});
		// add action to "="
		EqualListener e = new EqualListener();
		equals.addActionListener(e);

		// add action to "AC"
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				screen.setText("0");
				fNumber = 0;
				temp = 0;
				current = 0;
				lastType = 0;
				isFirst = true;
				while (!countEquals.isEmpty()) {
					countEquals.pop();
				}
				countOp = 0;
			}
		});
		// add action to "+/-"
		sign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float num = Float.parseFloat(screen.getText());
				screen.setText(String.valueOf(-num));
			}
		});
		// add action to "%"
		percentage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				screen.setText(String.valueOf(Float.parseFloat(screen.getText()) / 100));
				temp = 5;
			}
		});

	}

	class EqualListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			isFirst = true;
			countOp = 0;
			// not consistent click of "="
			if (!countEquals.peek().equals("=")) {
				fNumber = Float.parseFloat(screen.getText());
				lastType = fNumber;
				if (temp == 1) {
					current = current + fNumber;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 2) {
					current = current - fNumber;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 3) {
					current = current * fNumber;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 4) {
					if (fNumber == 0) {
						screen.setText("Error");
					} else {
						current = current / fNumber;
						screen.setText(String.valueOf(current));
						countEquals.push("=");
					}
				}
			} else { // consistent click of "="
				fNumber = Float.parseFloat(screen.getText());
				if (temp == 1) {
					current = lastType + fNumber;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 2) {
					current = fNumber - lastType;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 3) {
					current = lastType * fNumber;
					screen.setText(String.valueOf(current));
					countEquals.push("=");
				}
				if (temp == 4) {
					if (fNumber == 0) {
						screen.setText("Error");
						countEquals.push("=");
					} else {
						current = fNumber / lastType;
						screen.setText(String.valueOf(current));
						countEquals.push("=");
					}
				}
			}
		}
	}

	private void makeItVisible() {
		this.setSize(300, 500);
		setLocation(500, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Calculater();

	}

}
