import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		panel.setBounds(275, 225, 225, 300);
		frame.getContentPane().add(panel);
		
		JButton btnManager = new JButton("MANAGER");
		btnManager.setBackground(Color.WHITE);
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogin ml = new ManagerLogin();
				ml.main(null);
			}
		});
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		btnManager.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		panel.add(btnManager);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(502, 226, 225, 299);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JButton btnEmp = new JButton("STAFF");
		panel_1.add(btnEmp, "name_1075308424019800");
		btnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin sl = new StaffLogin();
				sl.main(null);
			}
		});
		btnEmp.setBackground(Color.WHITE);
		btnEmp.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
