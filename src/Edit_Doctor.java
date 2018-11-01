import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Edit_Doctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Doctor frame = new Edit_Doctor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		WindowEvent closeEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
	}
	/**
	 * Create the frame.
	 */
	public Edit_Doctor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditDoctor = new JLabel("EDIT DOCTOR");
		lblEditDoctor.setBounds(33, 12, 146, 15);
		contentPane.add(lblEditDoctor);
		
		JLabel lblNam = new JLabel("NAME:");
		lblNam.setBounds(89, 39, 70, 15);
		contentPane.add(lblNam);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setBounds(89, 66, 70, 15);
		contentPane.add(lblAddress);
		
		JLabel lblContact = new JLabel("CONTACT:");
		lblContact.setBounds(89, 93, 70, 15);
		contentPane.add(lblContact);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setBounds(89, 117, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCategorydept = new JLabel("CATEGORY/DEPT.:");
		lblCategorydept.setBounds(89, 144, 146, 15);
		contentPane.add(lblCategorydept);
		
		JLabel lblScheduleDays = new JLabel("SCHEDULE DAYS:");
		lblScheduleDays.setBounds(89, 171, 132, 15);
		contentPane.add(lblScheduleDays);
		
		JLabel lblTimings = new JLabel("TIMINGS:");
		lblTimings.setBounds(89, 198, 132, 15);
		contentPane.add(lblTimings);
		
		JLabel lblDoctorPrecedence = new JLabel("DOCTOR PRECEDENCE:");
		lblDoctorPrecedence.setBounds(89, 220, 167, 15);
		contentPane.add(lblDoctorPrecedence);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(89, 247, 146, 15);
		contentPane.add(lblPassword);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				View_Doctor_Profile vdp =  new View_Doctor_Profile();
				vdp.setVisible(true);
			}
		});
		btnBack.setBounds(12, 293, 117, 25);
		contentPane.add(btnBack);
		
		JButton btnLogout = new JButton("UPDATE");
		btnLogout.setBounds(285, 293, 117, 25);
		contentPane.add(btnLogout);
		
		textField = new JTextField();
		textField.setBounds(266, 37, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 64, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(266, 91, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(266, 115, 114, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(266, 169, 114, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(266, 196, 114, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(266, 245, 114, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 139, 117, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(266, 215, 114, 24);
		contentPane.add(comboBox_1);
	}
}
