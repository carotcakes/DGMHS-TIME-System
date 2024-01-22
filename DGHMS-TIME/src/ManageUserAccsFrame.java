import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ManageUserAccsFrame {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUserAccsFrame window = new ManageUserAccsFrame();
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
	public ManageUserAccsFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 775, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Manage User Accounts");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 33, 340, 37);
		panel.add(lblNewLabel);

		JButton AddNewUserbtn = new JButton("Add New User");
		AddNewUserbtn.setBackground(new Color(143, 188, 143));
		AddNewUserbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AddNewUserbtn.setBounds(150, 209, 185, 65);
		frame.getContentPane().add(AddNewUserbtn);

		JButton ChangeUserPWbtn = new JButton("Change Password");
		ChangeUserPWbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChangeUserPWbtn.setBackground(new Color(143, 188, 143));
		ChangeUserPWbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ChangeUserPWbtn.setForeground(new Color(0, 0, 0));
		ChangeUserPWbtn.setBounds(296, 349, 185, 65);
		frame.getContentPane().add(ChangeUserPWbtn);
		
		JButton EdtExstUserbtn = new JButton("Edit Existing User");
		EdtExstUserbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		EdtExstUserbtn.setBackground(new Color(143, 188, 143));
		EdtExstUserbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EdtExstUserbtn.setBounds(460, 209, 185, 65);
		frame.getContentPane().add(EdtExstUserbtn);
		
		JButton backToADMDbtn = new JButton("←");
		backToADMDbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBdADMFrame ADMDB = new	DashBdADMFrame();
				
				ADMDB.frame.setVisible(true);
				frame.dispose();
			}
		});
		backToADMDbtn.setBackground(new Color(204, 204, 51));
		backToADMDbtn.setFont(new Font("MS PGothic", Font.BOLD, 26));
		backToADMDbtn.setBounds(45, 125, 85, 35);
		frame.getContentPane().add(backToADMDbtn);
	}
	
}
