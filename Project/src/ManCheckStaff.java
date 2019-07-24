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
import javax.swing.JTable;

public class ManCheckStaff {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManCheckStaff window = new ManCheckStaff();
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
	public ManCheckStaff() {
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
		
		JLabel lbTitleCheckStaff = new JLabel("\uB0B4 \uC9C1\uC6D0 \uC870\uD68C\uD558\uAE30");
		lbTitleCheckStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitleCheckStaff.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lbTitleCheckStaff.setBounds(0, 10, 870, 51);
		panel.add(lbTitleCheckStaff);
		
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
		
		JLabel lbNameSearch = new JLabel("\uC774\uB984\uC73C\uB85C \uAC80\uC0C9\uD558\uAE30");
		lbNameSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lbNameSearch.setBounds(12, 10, 108, 30);
		panel_3.add(lbNameSearch);
		
		txtName = new JTextField();
		txtName.setBounds(132, 15, 220, 21);
		panel_3.add(txtName);
		txtName.setColumns(10);
		
		JButton btnSearchName = new JButton("");
		btnSearchName.setBorderPainted(false);
		btnSearchName.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\rjator.png"));
		btnSearchName.setBackground(Color.WHITE);
		btnSearchName.setBounds(364, 10, 30, 30);
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
		panel_6.setBounds(12, 22, 378, 244);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(405, 22, 378, 244);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(405, 276, 378, 244);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(12, 276, 378, 244);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(430, 10, 406, 50);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lbNumSearch = new JLabel("\uC0AC\uC6D0\uBC88\uD638\uB85C \uAC80\uC0C9\uD558\uAE30");
		lbNumSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lbNumSearch.setBounds(12, 10, 126, 30);
		panel_5.add(lbNumSearch);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(148, 15, 204, 21);
		panel_5.add(txtNum);
		
		JButton btnNumSearch = new JButton("");
		btnNumSearch.setBorderPainted(false);
		btnNumSearch.setBackground(Color.WHITE);
		btnNumSearch.setIcon(new ImageIcon("C:\\Users\\SM09\\Desktop\\PROJECT FILES\\icon\\rjator.png"));
		btnNumSearch.setBounds(364, 10, 30, 30);
		panel_5.add(btnNumSearch);
		
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
