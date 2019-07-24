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
import javax.swing.JScrollBar;

public class ManCheckEvaluation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManCheckEvaluation window = new ManCheckEvaluation();
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
	public ManCheckEvaluation() {
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
		
		JLabel lbTitleCheckEval = new JLabel("\uC5C5\uBB34\uD3C9\uAC00 \uC870\uD68C\uD558\uAE30");
		lbTitleCheckEval.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitleCheckEval.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lbTitleCheckEval.setBounds(0, 10, 870, 51);
		panel.add(lbTitleCheckEval);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 71, 848, 610);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 10, 410, 50);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSearchName = new JButton("\uC9C0\uC810\uBCC4 \uD3C9\uAC00 \uC870\uD68C");
		btnSearchName.setBackground(Color.WHITE);
		btnSearchName.setBounds(12, 10, 386, 30);
		panel_3.add(btnSearchName);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(12, 70, 824, 530);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setForeground(new Color(72, 209, 204));
		scrollBar.setBackground(Color.WHITE);
		scrollBar.setBounds(795, 10, 17, 510);
		panel_4.add(scrollBar);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(434, 10, 402, 50);
		panel_2.add(panel_6);
		
		JButton button_1 = new JButton("\uD30C\uACAC\uC9C1\uC6D0 \uD3C9\uAC00 \uC870\uD68C");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(12, 10, 378, 30);
		panel_6.add(button_1);
		
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
