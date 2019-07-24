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
import javax.swing.JComboBox;

public class ManSignUpStaff {

	private JFrame frame;
	private JTextField txtFieldName;
	private JTextField txtFieldID;
	private JTextField txtFieldNumber;
	private JTextField txtFieldPhoneNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManSignUpStaff window = new ManSignUpStaff();
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
	public ManSignUpStaff() {
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
		panel_3.setBounds(88, 150, 472, 418);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnEnroll = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "신규 직원 등록이 완료되었습니다.");
				frame.dispose();
			}
		});
		btnEnroll.setBounds(169, 329, 122, 56);
		panel_3.add(btnEnroll);
		btnEnroll.setBackground(Color.WHITE);
		
		txtFieldName = new JTextField();
		txtFieldName.setBounds(176, 80, 153, 21);
		panel_3.add(txtFieldName);
		txtFieldName.setColumns(10);
		
		JLabel lbName = new JLabel("\uC774\uB984");
		lbName.setHorizontalAlignment(SwingConstants.TRAILING);
		lbName.setBounds(51, 83, 113, 15);
		panel_3.add(lbName);
		
		JLabel lbEmpNo = new JLabel("\uC0AC\uC6D0\uBC88\uD638");
		lbEmpNo.setHorizontalAlignment(SwingConstants.TRAILING);
		lbEmpNo.setBounds(51, 122, 113, 15);
		panel_3.add(lbEmpNo);
		
		txtFieldID = new JTextField();
		txtFieldID.setColumns(10);
		txtFieldID.setBounds(176, 119, 153, 21);
		panel_3.add(txtFieldID);
		
		txtFieldNumber = new JTextField();
		txtFieldNumber.setColumns(10);
		txtFieldNumber.setBounds(176, 157, 153, 21);
		panel_3.add(txtFieldNumber);
		
		txtFieldPhoneNum = new JTextField();
		txtFieldPhoneNum.setColumns(10);
		txtFieldPhoneNum.setBounds(176, 199, 153, 21);
		panel_3.add(txtFieldPhoneNum);
		
		JLabel lbPersonalNum = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
		lbPersonalNum.setHorizontalAlignment(SwingConstants.TRAILING);
		lbPersonalNum.setBounds(51, 160, 113, 15);
		panel_3.add(lbPersonalNum);
		
		JLabel lbPhone = new JLabel("\uC5F0\uB77D\uCC98");
		lbPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lbPhone.setBounds(51, 202, 113, 15);
		panel_3.add(lbPhone);
		
		JLabel lbLocation = new JLabel("\uADFC\uBB34\uC9C0\uC810");
		lbLocation.setHorizontalAlignment(SwingConstants.TRAILING);
		lbLocation.setBounds(51, 241, 113, 15);
		panel_3.add(lbLocation);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(176, 238, 153, 21);
		panel_3.add(comboBox);
		
		JButton button = new JButton("\u2190");
		button.setBounds(12, 10, 78, 34);
		panel_2.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setBorderPainted(false);
		button.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\uC0C8 \uC9C1\uC6D0 \uB4F1\uB85D\uD558\uAE30");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(88, 61, 472, 64);
		panel_2.add(label);
		frame.setBounds(400, 130, 690, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
