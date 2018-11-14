import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class FindByIDPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindByIDPage frame = new FindByIDPage();
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
	public FindByIDPage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchDoctorBy = new JLabel("Search Doctor By Dr. ID");
		lblSearchDoctorBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchDoctorBy.setBounds(129, 11, 257, 14);
		contentPane.add(lblSearchDoctorBy);
		
		JLabel lblEnterId = new JLabel("Enter ID:");
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterId.setBounds(30, 74, 132, 14);
		contentPane.add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(129, 72, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNameOfDr = new JLabel("Name of Dr.");
		lblNameOfDr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNameOfDr.setBounds(30, 131, 91, 14);
		contentPane.add(lblNameOfDr);
		
		JList list = new JList();
		list.setBounds(129, 131, 115, 66);
		contentPane.add(list);
		
		JButton btnView = new JButton("VIEW");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnView.setBounds(129, 227, 89, 23);
		contentPane.add(btnView);
	}
}
