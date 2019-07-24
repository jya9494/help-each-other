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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollBar;

public class ManCheckSalary {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManCheckSalary window = new ManCheckSalary();
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
	public ManCheckSalary() {
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
		panel.setBounds(102, 10, 870, 691);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\uC9C1\uC6D0 \uAE09\uC5EC \uC815\uC0B0\uD558\uAE30");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label.setBounds(0, 10, 870, 51);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 71, 848, 610);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 10, 406, 50);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984\uC73C\uB85C \uAC80\uC0C9\uD558\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 108, 30);
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(132, 15, 220, 21);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\rjator.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(364, 10, 30, 30);
		panel_3.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(12, 127, 824, 473);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(795, 10, 17, 453);
		panel_4.add(scrollBar);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(430, 10, 406, 50);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_1 = new JLabel("\uC0AC\uC6D0\uBC88\uD638\uB85C \uAC80\uC0C9\uD558\uAE30");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 10, 126, 30);
		panel_5.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 15, 204, 21);
		panel_5.add(textField_1);
		
		JButton button_1 = new JButton("");
		button_1.setBorderPainted(false);
		button_1.setBackground(Color.WHITE);
		button_1.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\rjator.png"));
		button_1.setBounds(364, 10, 30, 30);
		panel_5.add(button_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(12, 70, 824, 50);
		panel_2.add(panel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 10, 78, 691);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain mm = new ManagerMain();
				mm.main(null);
				frame.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(0, 17, 78, 34);
		panel_1.add(btnBack);
		frame.setBounds(100, 100, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
