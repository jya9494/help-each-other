import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class StaffSalary {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSalary window = new StaffSalary();
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
	public StaffSalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(12, 10, 650, 652);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(88, 150, 472, 445);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.setBounds(12, 10, 78, 34);
		panel_2.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\uB0B4 \uAE09\uC5EC \uC870\uD68C\uD558\uAE30");
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(88, 61, 472, 64);
		panel_2.add(label);
		frame.setBounds(400, 130, 690, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
