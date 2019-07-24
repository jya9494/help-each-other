import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerLogin {

	private JFrame frame;
	private JTextField txtFieldID;
	private JTextField txtFieldPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerLogin window = new ManagerLogin();
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
	public ManagerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 410, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBorderPainted(false);
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(12, 10, 78, 34);
		panel.add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 99, 410, 71);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtFieldID = new JTextField();
		txtFieldID.setBounds(148, 10, 116, 21);
		panel_1.add(txtFieldID);
		txtFieldID.setColumns(10);
		
		txtFieldPW = new JTextField();
		txtFieldPW.setBounds(148, 41, 116, 21);
		panel_1.add(txtFieldPW);
		txtFieldPW.setColumns(10);
		
		JLabel lbID = new JLabel("ID");
		lbID.setHorizontalAlignment(SwingConstants.TRAILING);
		lbID.setBounds(103, 13, 33, 15);
		panel_1.add(lbID);
		
		JLabel lbPW = new JLabel("PW");
		lbPW.setHorizontalAlignment(SwingConstants.TRAILING);
		lbPW.setBounds(103, 44, 33, 15);
		panel_1.add(lbPW);
		
		JButton btnLogin = new JButton("OK");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain mm = new ManagerMain();
				mm.main(null);
				frame.dispose();
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		btnLogin.setBounds(276, 9, 57, 52);
		panel_1.add(btnLogin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(12, 180, 410, 71);
		frame.getContentPane().add(panel_2);
		frame.setBounds(385, 355, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
