package Assignment7;
/**
 * 2. File Reader. Based on the question 4 of assignment 6. 
 * Create a button and text area in Swing, every time you click the button, 
 * the text area will show the next line of a file.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileReader extends JFrame {

	private JScrollPane scroll;
	private JTextArea content;
	private JButton nextLine;
	int index = 0;

	public FileReader(String file) {
		setTitle("FileReader");
		createComponents();
		addComponents();
		addListeners(file);
		makeItVisible();
	}

	private void createComponents() {
		scroll = new JScrollPane();
		content = new JTextArea();
		nextLine = new JButton("NextLine");
	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(scroll, "Center");
		scroll.setViewportView(content);
		con.add(nextLine, "South");
	}

	private void addListeners(String file) {
		nextLine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File f = new File(file);
					FileInputStream fis = new FileInputStream(f);
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader br = new BufferedReader(isr);

					ArrayList<String> res = new ArrayList<String>();

					while (true) {
						String line = br.readLine();
						if (line == null)
							break;
						res.add(line);
					}
					br.close();
					isr.close();
					fis.close();
					if (index == res.size())
						JOptionPane.showMessageDialog(null, "End of the file!");
					else {
						content.append(res.get(index++) + "\n");
					}

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	private void makeItVisible() {
		content.setLineWrap(true);
		this.setSize(500, 500);
		setLocation(400, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FileReader("/Users/workspace/JavaTest/src/Assignment6/reverse.txt");

	}

}
