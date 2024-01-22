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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Panel;
import java.text.SimpleDateFormat;

public class GenerateAttendancePg2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateAttendancePg2 window = new GenerateAttendancePg2();
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
	public GenerateAttendancePg2() {
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
		
		JDateChooser startDate = new JDateChooser();
		startDate.setBounds(210, 250, 100, 35);
        frame.getContentPane().add(startDate);
        
        JDateChooser endDate = new JDateChooser();
        endDate.setBounds(460, 250, 100, 35);
        frame.getContentPane().add(endDate);

//		JTextArea StartBox = new JTextArea();
//		StartBox.setFont(new Font("Monospaced", Font.PLAIN, 18));
//		StartBox.setBounds(210, 250, 100, 35);
//		frame.getContentPane().add(StartBox);
//			
//		JButton showDateButton = new JButton("Start Date");
//        showDateButton.setBounds(320, 150, 100, 35);
//        frame.getContentPane().add(showDateButton);
//
//        showDateButton.addActionListener(e -> {
//            // Format the date and set it to the text field when the button is clicked
//            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
//            String dateString = dateFormat.format(startDate.getDate());
//            StartBox.setText(dateString);
//        });

		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 761, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Generate Attendance Report");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 34, 500, 35);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Start Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(220, 220, 125, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("End Date:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(475, 220, 125, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnter.setBackground(new Color(154, 205, 50));
		btnEnter.setBounds(345, 300, 102, 35);
		frame.getContentPane().add(btnEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBackground(new Color(154, 205, 50));
		btnBack.setBounds(210, 380, 102, 35);
		frame.getContentPane().add(btnBack);

		
	}
}
