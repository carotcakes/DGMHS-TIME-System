import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ForgotPassWFrame {

	private JFrame frame;
	private JTextField ForgotEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassWFrame window = new ForgotPassWFrame();
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
	public ForgotPassWFrame() {
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
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Forgot Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 239, 35);
		panel.add(lblNewLabel);
		
		JTextArea ForgotEmpID = new JTextArea();
		ForgotEmpID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ForgotEmpID.setBounds(203, 204, 355, 35);
		frame.getContentPane().add(ForgotEmpID);
		
		JButton backToLogin = new JButton("←");
		backToLogin.setBackground(new Color(205, 92, 92));
		backToLogin.setFont(new Font("MS PGothic", Font.BOLD, 26));
		backToLogin.setBounds(40, 125, 85, 35);
		frame.getContentPane().add(backToLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(203, 181, 125, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea ForgotEMAIL = new JTextArea();
		ForgotEMAIL.setFont(new Font("Monospaced", Font.PLAIN, 18));
		ForgotEMAIL.setBounds(203, 295, 355, 35);
		frame.getContentPane().add(ForgotEMAIL);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(203, 272, 100, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton sendForgotEmail = new JButton("Enter");
		sendForgotEmail.setBackground(new Color(144, 238, 144));
		sendForgotEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		sendForgotEmail.setBounds(558, 414, 116, 44);
		frame.getContentPane().add(sendForgotEmail);
	}
}
