import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

public class ManageUsers {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUsers window = new ManageUsers();
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
	public ManageUsers() {
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
		
		JTextArea EmpIDBox = new JTextArea();
		EmpIDBox.setFont(new Font("Monospaced", Font.PLAIN, 18));
		EmpIDBox.setBounds(188, 160, 400, 260);
		frame.getContentPane().add(EmpIDBox);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manage User Accounts");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 500, 35);
		panel.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBackground(new Color(154, 205, 50));
		btnBack.setBounds(75, 110, 102, 35);
		frame.getContentPane().add(btnBack);
		
		JButton btnAddUsr = new JButton("Add User");
		btnAddUsr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddUsr.setBackground(new Color(154, 205, 50));
		btnAddUsr.setBounds(370, 430, 102, 35);
		frame.getContentPane().add(btnAddUsr);
		
		JButton btnEditUsr = new JButton("Edit User");
		btnEditUsr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditUsr.setBackground(new Color(154, 205, 50));
		btnEditUsr.setBounds(487, 430, 102, 35);
		frame.getContentPane().add(btnEditUsr);
		
	}
}
