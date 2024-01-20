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

public class DashBd02ADMFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBd02ADMFrame window = new DashBd02ADMFrame();
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
	public DashBd02ADMFrame() {
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

		JButton GenAttReportbtn = new JButton("Change Password");
		GenAttReportbtn.setBackground(new Color(143, 188, 143));
		GenAttReportbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GenAttReportbtn.setBounds(75, 209, 185, 65);
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
		
		JButton ManUserAccsbtn = new JButton("Feature 5");
		ManUserAccsbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ManUserAccsbtn.setBackground(new Color(143, 188, 143));
		ManUserAccsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ManUserAccsbtn.setBounds(500, 209, 185, 65);
		frame.getContentPane().add(ManUserAccsbtn);
		
		JButton backToPageOne = new JButton("←");
		backToPageOne.setBackground(new Color(204, 204, 51));
		backToPageOne.setFont(new Font("MS PGothic", Font.BOLD, 26));
		backToPageOne.setBounds(75, 413, 85, 35);
		frame.getContentPane().add(backToPageOne);
	}

}
