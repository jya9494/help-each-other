import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerMain window = new ManagerMain();
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
	public ManagerMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 10, 282, 691);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(12, 10, 258, 45);
		panel_1.add(panel_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(41, 65, 200, 200);
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lbProfilePhoto = new JLabel("");
		lbProfilePhoto.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\PRO.png"));
		lbProfilePhoto.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lbProfilePhoto);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(253, 65, 17, 200);
		panel_1.add(panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(12, 65, 17, 200);
		panel_1.add(panel_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(12, 275, 258, 17);
		panel_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(12, 302, 17, 379);
		panel_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(253, 302, 17, 379);
		panel_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(41, 302, 200, 197);
		panel_1.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lbName = new JLabel("\uC774\uB3D9\uC6B1");
		lbName.setBounds(44, 5, 45, 18);
		panel_11.add(lbName);
		lbName.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		JLabel lbPosition = new JLabel("MANAGER");
		lbPosition.setBounds(94, 6, 61, 15);
		panel_11.add(lbPosition);
		
		JLabel lbLocation = new JLabel("\uC2E0\uC138\uACC4 \uAD11\uC8FC \uC720\uC2A4\uD018\uC5B4\uC810");
		lbLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lbLocation.setBounds(1, 28, 198, 15);
		panel_11.add(lbLocation);
		
		JLabel lbStaffNum = new JLabel("\uC9C1\uC6D0 5\uBA85");
		lbStaffNum.setHorizontalAlignment(SwingConstants.CENTER);
		lbStaffNum.setBounds(36, 53, 128, 15);
		panel_11.add(lbStaffNum);
		
		JButton btnLogOut = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				m.main(null);
				frame.dispose();
			}
		});
		btnLogOut.setBounds(41, 582, 200, 63);
		panel_1.add(btnLogOut);
		btnLogOut.setBackground(Color.WHITE);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(41, 655, 200, 26);
		panel_1.add(panel_12);
		
		JButton btnEvaluationCheck = new JButton("\uD3C9\uAC00 \uC870\uD68C");
		btnEvaluationCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ManCheckEvaluation mce = new ManCheckEvaluation();
				mce.main(null);
				frame.dispose();
			}
		});
		btnEvaluationCheck.setBackground(Color.WHITE);
		btnEvaluationCheck.setBounds(41, 509, 200, 63);
		panel_1.add(btnEvaluationCheck);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(306, 10, 214, 691);
		frame.getContentPane().add(panel);
		
		JLabel lbMenuStaff = new JLabel("\uC9C1\uC6D0 \uAD00\uB9AC");
		lbMenuStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lbMenuStaff.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lbMenuStaff.setBounds(12, 133, 190, 86);
		panel.add(lbMenuStaff);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\ICONS3.jpg"));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(32, 230, 150, 150);
		panel.add(label_4);
		
		JButton btnSignUpStaff = new JButton("\uC9C1\uC6D0\uB4F1\uB85D");
		btnSignUpStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManSignUpStaff signUp = new ManSignUpStaff();
				signUp.main(null);
			}
		});
		btnSignUpStaff.setBackground(Color.WHITE);
		btnSignUpStaff.setBounds(60, 427, 97, 23);
		panel.add(btnSignUpStaff);
		
		JButton btnCheckStaff = new JButton("\uC9C1\uC6D0\uC870\uD68C");
		btnCheckStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManCheckStaff check = new ManCheckStaff();
				check.main(null);
				frame.dispose();
			}
		});
		btnCheckStaff.setBackground(Color.WHITE);
		btnCheckStaff.setBounds(60, 460, 97, 23);
		panel.add(btnCheckStaff);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(532, 10, 214, 691);
		frame.getContentPane().add(panel_2);
		
		JLabel lbMenuSal = new JLabel("\uAE09\uC5EC \uAD00\uB9AC");
		lbMenuSal.setHorizontalAlignment(SwingConstants.CENTER);
		lbMenuSal.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lbMenuSal.setBounds(12, 133, 190, 86);
		panel_2.add(lbMenuSal);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\ICONS2.jpg"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(32, 230, 150, 150);
		panel_2.add(label_5);
		
		JButton btnCheckIncentive = new JButton("\uC778\uC13C\uD2F0\uBE0C");
		btnCheckIncentive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManCheckIncentive mci = new ManCheckIncentive();
				mci.main(null);
				frame.dispose();
			}
		});
		btnCheckIncentive.setBackground(Color.WHITE);
		btnCheckIncentive.setBounds(60, 427, 97, 23);
		panel_2.add(btnCheckIncentive);
		
		JButton btnCheckSal = new JButton("\uAE09\uC5EC\uC815\uC0B0");
		btnCheckSal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManCheckSalary mcs = new ManCheckSalary();
				mcs.main(null);
				frame.dispose();
			}
		});
		btnCheckSal.setBackground(Color.WHITE);
		btnCheckSal.setBounds(60, 460, 97, 23);
		panel_2.add(btnCheckSal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(758, 10, 214, 691);
		frame.getContentPane().add(panel_3);
		
		JLabel lbMenuCheck = new JLabel("\uC9C0\uC810 \uC870\uD68C");
		lbMenuCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lbMenuCheck.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lbMenuCheck.setBounds(12, 133, 190, 86);
		panel_3.add(lbMenuCheck);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\ICONS1.jpg"));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(32, 230, 150, 150);
		panel_3.add(label_6);
		
		JButton btnCheck = new JButton("\uC870\uD68C\uD558\uAE30");
		btnCheck.setBackground(Color.WHITE);
		btnCheck.setBounds(60, 444, 97, 23);
		panel_3.add(btnCheck);
		frame.setBounds(100, 100, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
