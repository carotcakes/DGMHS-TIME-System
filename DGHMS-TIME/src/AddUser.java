import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Panel;

public class AddUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser window = new AddUser();
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
	public AddUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 775, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add User");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 500, 35);
		panel.add(lblNewLabel);
		
		JLabel fName = new JLabel("First Name:");
		fName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fName.setBounds(80, 200, 125, 20);
		frame.getContentPane().add(fName);
		
		JTextArea firstName = new JTextArea();
		firstName.setFont(new Font("Monospaced", Font.PLAIN, 18));
		firstName.setBounds(80, 230, 175, 35);
		frame.getContentPane().add(firstName);
		
		JLabel lName = new JLabel("Last Name:");
		lName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lName.setBounds(80, 280, 125, 20);
		frame.getContentPane().add(lName);
		
		JTextArea lastName = new JTextArea();
		lastName.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lastName.setBounds(80, 315, 175, 35);
		frame.getContentPane().add(lastName);
		
		JLabel posLabel = new JLabel("Position:");
		posLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		posLabel.setBounds(80, 360, 125, 20);
		frame.getContentPane().add(posLabel);
		
		JTextArea posField = new JTextArea();
		posField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		posField.setBounds(80, 390, 175, 35);
		frame.getContentPane().add(posField);
		
		JLabel birthDate = new JLabel("Date of Birth:");
		birthDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		birthDate.setBounds(315, 200, 125, 20);
		frame.getContentPane().add(birthDate);
		
		JTextArea bdayField = new JTextArea();
		bdayField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		bdayField.setBounds(315, 230, 175, 35);
		frame.getContentPane().add(bdayField);
		
		JLabel emailAddress = new JLabel("Email Address:");
		emailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailAddress.setBounds(315, 280, 125, 20);
		frame.getContentPane().add(emailAddress);
		
		JTextArea emailField = new JTextArea();
		emailField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		emailField.setBounds(315, 315, 175, 35);
		frame.getContentPane().add(emailField);
		
		JLabel cityofResidence = new JLabel("City of Residence:");
		cityofResidence.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cityofResidence.setBounds(315, 360, 200, 20);
		frame.getContentPane().add(cityofResidence);
		
		JTextArea cityField = new JTextArea();
		cityField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		cityField.setBounds(315, 390, 175, 35);
		frame.getContentPane().add(cityField);
		
		JLabel contactNo = new JLabel("Contact Number:");
		contactNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contactNo.setBounds(550, 200, 125, 20);
		frame.getContentPane().add(contactNo);
		
		JTextArea numberField = new JTextArea();
		numberField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		numberField.setBounds(550, 230, 175, 35);
		frame.getContentPane().add(numberField);
		
		JButton btnAddUsr = new JButton("Add User");
		btnAddUsr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddUsr.setBackground(new Color(154, 205, 50));
		btnAddUsr.setBounds(585, 315, 102, 35);
		frame.getContentPane().add(btnAddUsr);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBackground(new Color(154, 205, 50));
		btnBack.setBounds(75, 110, 102, 35);
		frame.getContentPane().add(btnBack);

		
	}
}
