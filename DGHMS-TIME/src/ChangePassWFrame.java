import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class ChangePassWFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassWFrame window = new ChangePassWFrame();
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
	public ChangePassWFrame() {
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
		
		JLabel lblNewLabel = new JLabel("Change Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 239, 32);
		panel.add(lblNewLabel);
		
		JTextArea CurrentPassW = new JTextArea();
		CurrentPassW.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CurrentPassW.setBounds(203, 178, 355, 35);
		frame.getContentPane().add(CurrentPassW);
		
		JButton backToLogin = new JButton("←");
		backToLogin.setBackground(new Color(205, 92, 92));
		backToLogin.setFont(new Font("MS PGothic", Font.BOLD, 26));
		backToLogin.setBounds(40, 125, 85, 35);
		frame.getContentPane().add(backToLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Current Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(203, 155, 154, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea NewPassW = new JTextArea();
		NewPassW.setFont(new Font("Monospaced", Font.PLAIN, 18));
		NewPassW.setBounds(203, 263, 355, 35);
		frame.getContentPane().add(NewPassW);
		
		JLabel lblNewLabel_2 = new JLabel("New Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(203, 240, 144, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton sendForgotEmail = new JButton("Enter");
		sendForgotEmail.setBackground(new Color(144, 238, 144));
		sendForgotEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		sendForgotEmail.setBounds(558, 414, 116, 44);
		frame.getContentPane().add(sendForgotEmail);
		
		JTextArea RENewPassW = new JTextArea();
		RENewPassW.setBounds(203, 345, 355, 35);
		frame.getContentPane().add(RENewPassW);
		
		JLabel lblNewLabel_3 = new JLabel("Re-enter New Password :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(203, 324, 208, 13);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
