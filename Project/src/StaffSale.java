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
import javax.swing.JSpinner;

public class StaffSale {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSale window = new StaffSale();
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
	public StaffSale() {
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
		panel_3.setBounds(88, 150, 472, 324);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnInitialization = new JButton("\uCD08\uAE30\uD654");		
		btnInitialization.setBounds(115, 203, 122, 56);
		panel_3.add(btnInitialization);
		btnInitialization.setBackground(Color.WHITE);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(201, 81, 128, 21);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\uC0C1\uD488\uC815\uBCF4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(132, 84, 57, 15);
		panel_3.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uD310\uB9E4\uC218\uB7C9");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(132, 127, 57, 15);
		panel_3.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(201, 124, 128, 22);
		panel_3.add(spinner);
		
		JButton btnOK = new JButton("\uC785\uB825\uD558\uAE30");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnOK.setBackground(Color.WHITE);
		btnOK.setBounds(249, 203, 122, 56);
		panel_3.add(btnOK);
		
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
		
		JLabel label = new JLabel("\uC624\uB298 \uC2E4\uC801 \uC785\uB825\uD558\uAE30");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(88, 61, 472, 64);
		panel_2.add(label);
		
		JButton btnSave = new JButton("\uC785\uB825\uC644\uB8CC");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "입력이 완료되었습니다.");
				frame.dispose();
			}
		});
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(268, 525, 122, 56);
		panel_2.add(btnSave);
		frame.setBounds(400, 130, 690, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
