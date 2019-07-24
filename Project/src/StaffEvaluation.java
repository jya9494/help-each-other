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
import javax.swing.JOptionPane;

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

public class StaffEvaluation {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffEvaluation window = new StaffEvaluation();
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
	public StaffEvaluation() {
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
		
		JLabel lbTitleEval = new JLabel("\uADFC\uBB34\uD658\uACBD \uD3C9\uAC00\uD558\uAE30");
		lbTitleEval.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitleEval.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lbTitleEval.setBounds(0, 10, 870, 51);
		panel.add(lbTitleEval);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 71, 848, 610);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(222, 274, 413, 245);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("\uD3C9\uAC00 \uC81C\uCD9C\uD558\uAE30");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "평가가 완료되었습니다.");
				frame.dispose();
			}
		});
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(366, 529, 137, 51);
		panel_2.add(btnSubmit);
		
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
