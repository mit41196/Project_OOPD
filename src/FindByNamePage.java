import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class FindByNamePage extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindByNamePage frame = new FindByNamePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FindByNamePage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterName.setBounds(39, 65, 130, 14);
		getContentPane().add(lblEnterName);
		
		JLabel lblSearchDoctorBy = new JLabel("Search Doctor By Name");
		lblSearchDoctorBy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearchDoctorBy.setBounds(123, 11, 203, 14);
		getContentPane().add(lblSearchDoctorBy);
		
		textField = new JTextField();
		textField.setBounds(142, 63, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
