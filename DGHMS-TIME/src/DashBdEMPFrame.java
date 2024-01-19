import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBdEMPFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBdEMPFrame window = new DashBdEMPFrame();
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
	public DashBdEMPFrame() {
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
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bonjour! *Employee Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(24, 34, 665, 32);
		panel.add(lblNewLabel);
		
		JButton EMPClockInbtn = new JButton("Clock In");
		EMPClockInbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		EMPClockInbtn.setBackground(new Color(135, 206, 250));
		EMPClockInbtn.setBounds(75, 145, 185, 65);
		frame.getContentPane().add(EMPClockInbtn);
		
		JButton EMPClockOutbtn = new JButton("Clock Out");
		EMPClockOutbtn.setBackground(new Color(135, 206, 250));
		EMPClockOutbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		EMPClockOutbtn.setEnabled(false);
		EMPClockOutbtn.setBounds(501, 145, 185, 65);
		frame.getContentPane().add(EMPClockOutbtn);
		
		JButton EMPChUserPWbtn = new JButton("Change Password");
		EMPChUserPWbtn.setBackground(new Color(135, 206, 250));
		EMPChUserPWbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EMPChUserPWbtn.setBounds(288, 292, 185, 65);
		frame.getContentPane().add(EMPChUserPWbtn);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(new Color(205, 92, 92));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(288, 400, 185, 65);
		frame.getContentPane().add(btnNewButton);
	}
}
