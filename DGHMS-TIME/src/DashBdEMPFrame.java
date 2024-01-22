import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBdEMPFrame {

	 JFrame frame;

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

		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 145, 32);
		panel.add(lblNewLabel);

		JLabel EMPNameLbl = new JLabel("Name");
		EMPNameLbl.setFont(new Font("Tahoma", Font.BOLD, 30));
		EMPNameLbl.setBounds(168, 34, 320, 32);
		panel.add(EMPNameLbl);

		JButton EMPClockOutbtn = new JButton("Clock Out");
		EMPClockOutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Good Bye! You have Clocked Out for today. All Clock In/Out buttons disabled",
			               "Clock In/Out", JOptionPane.DEFAULT_OPTION);
				
				EMPClockOutbtn.setEnabled(false);
			}
		});
		EMPClockOutbtn.setBackground(new Color(70, 130, 180));
		EMPClockOutbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		EMPClockOutbtn.setEnabled(false);
		EMPClockOutbtn.setBounds(501, 145, 185, 65);
		frame.getContentPane().add(EMPClockOutbtn);
		
		JButton EMPClockInbtn = new JButton("Clock In");
		EMPClockInbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Congratulations! You have Clocked In for today.",
			               "Clock In/Out", JOptionPane.DEFAULT_OPTION);
				
				EMPClockInbtn.setEnabled(false);
				EMPClockOutbtn.setEnabled(true);
			}
		});
		EMPClockInbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		EMPClockInbtn.setBackground(new Color(70, 130, 180));
		EMPClockInbtn.setBounds(75, 145, 185, 65);
		frame.getContentPane().add(EMPClockInbtn);

		JButton ChgPassWbtn = new JButton("Change Password");
		ChgPassWbtn.setBackground(new Color(0, 153, 204));
		ChgPassWbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ChgPassWbtn.setBounds(288, 292, 185, 65);
		frame.getContentPane().add(ChgPassWbtn);

		JButton LogoutEMPbtn = new JButton("Logout");
		LogoutEMPbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPageFrame LgnPg = new	LoginPageFrame();
				
				LgnPg.frame.setVisible(true);
				frame.dispose();
			}
		});
		LogoutEMPbtn.setBackground(new Color(205, 92, 92));
		LogoutEMPbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		LogoutEMPbtn.setForeground(new Color(0, 0, 0));
		LogoutEMPbtn.setBounds(288, 400, 185, 65);
		frame.getContentPane().add(LogoutEMPbtn);
	}
}
