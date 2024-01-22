import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginPageFrame {

	 JFrame frame;
	 private JTextField EmpIDBox;
	 private JTextField PasswordBoxxxxx;
	 private JPasswordField PasswordBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageFrame window = new LoginPageFrame();
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
	public LoginPageFrame() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(260, 58, 246, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JButton EnterDetailsbtn = new JButton("Enter");
		EnterDetailsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBdADMFrame ADMDB = new	DashBdADMFrame();
				DashBdEMPFrame EMPDB = new	DashBdEMPFrame();
				
				String empid = EmpIDBox.getText();
				String paswd = PasswordBox.getText();
				
				if (empid.equals("01") && paswd.equals("Time")) {
					ADMDB.frame.setVisible(true);
					frame.dispose();
				}
				else if (empid.equals("02") && paswd.equals("DGHMS")) {
					EMPDB.frame.setVisible(true);
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid Input. Try Again", "Login", JOptionPane.WARNING_MESSAGE);
					EmpIDBox.setText("");
					PasswordBox.setText("");
				}
			}
		});
		EnterDetailsbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EnterDetailsbtn.setBounds(210, 380, 102, 35);
		frame.getContentPane().add(EnterDetailsbtn);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(210, 277, 125, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee ID :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(210, 181, 125, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Forgot Password?");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ForgotPassWFrame FPW = new ForgotPassWFrame();
				
				FPW.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(433, 390, 132, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		EmpIDBox = new JTextField();
		EmpIDBox.setBounds(210, 204, 355, 35);
		frame.getContentPane().add(EmpIDBox);
		EmpIDBox.setColumns(0);
		
		PasswordBox = new JPasswordField();
		PasswordBox.setBounds(210, 300, 355, 35);
		frame.getContentPane().add(PasswordBox);
	}
}
