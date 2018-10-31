import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class FindByAddressPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindByAddressPage frame = new FindByAddressPage();
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
	public FindByAddressPage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchDoctorBy = new JLabel("Search Doctor By Address");
		lblSearchDoctorBy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearchDoctorBy.setBounds(122, 11, 218, 14);
		contentPane.add(lblSearchDoctorBy);
		
		JLabel lblEnterAddress = new JLabel("Enter Address:");
		lblEnterAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterAddress.setBounds(23, 59, 124, 14);
		contentPane.add(lblEnterAddress);
		
		textField = new JTextField();
		textField.setBounds(157, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
