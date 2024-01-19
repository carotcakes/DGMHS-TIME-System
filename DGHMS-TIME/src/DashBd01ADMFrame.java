import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBd01ADMFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBd01ADMFrame window = new DashBd01ADMFrame();
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
	public DashBd01ADMFrame() {
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

		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 145, 32);
		panel.add(lblNewLabel);

		JLabel EMPNameLbl = new JLabel("Name");
		EMPNameLbl.setFont(new Font("Tahoma", Font.BOLD, 30));
		EMPNameLbl.setBounds(168, 34, 320, 32);
		panel.add(EMPNameLbl);

		JButton ADMClockInbtn = new JButton("Clock In");
		ADMClockInbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		ADMClockInbtn.setBackground(new Color(46, 139, 87));
		ADMClockInbtn.setBounds(75, 145, 185, 65);
		frame.getContentPane().add(ADMClockInbtn);

		JButton ADMClockOutbtn = new JButton("Clock Out");
		ADMClockOutbtn.setBackground(new Color(143, 188, 143));
		ADMClockOutbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		ADMClockOutbtn.setEnabled(false);
		ADMClockOutbtn.setBounds(501, 145, 185, 65);
		frame.getContentPane().add(ADMClockOutbtn);

		JButton GenAttReportbtn = new JButton("Generate Attendance Report");
		GenAttReportbtn.setHorizontalAlignment(SwingConstants.LEADING);
		GenAttReportbtn.setBackground(new Color(143, 188, 143));
		GenAttReportbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GenAttReportbtn.setBounds(75, 285, 185, 65);
		frame.getContentPane().add(GenAttReportbtn);

		JButton LogoutADMbtn = new JButton("Logout");
		LogoutADMbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LogoutADMbtn.setBackground(new Color(205, 92, 92));
		LogoutADMbtn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		LogoutADMbtn.setForeground(new Color(0, 0, 0));
		LogoutADMbtn.setBounds(288, 400, 185, 65);
		frame.getContentPane().add(LogoutADMbtn);
		
		JButton ManUserAccsbtn = new JButton("Manage User Accounts");
		ManUserAccsbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ManUserAccsbtn.setBackground(new Color(143, 188, 143));
		ManUserAccsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ManUserAccsbtn.setBounds(501, 286, 185, 65);
		frame.getContentPane().add(ManUserAccsbtn);
	}

}
