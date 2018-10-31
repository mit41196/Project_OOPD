import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddDepartment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDepartment frame = new AddDepartment();
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
	public AddDepartment() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddDepartment = new JLabel("ADD DEPARTMENT:");
		lblAddDepartment.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddDepartment.setBounds(39, 30, 194, 14);
		contentPane.add(lblAddDepartment);
		
		JLabel lblDepartmentName = new JLabel("Department Name:");
		lblDepartmentName.setBounds(39, 96, 97, 14);
		contentPane.add(lblDepartmentName);
		
		textField = new JTextField();
		textField.setBounds(146, 93, 251, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDepartmentHod = new JLabel("Department HOD:");
		lblDepartmentHod.setBounds(39, 144, 97, 14);
		contentPane.add(lblDepartmentHod);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(146, 141, 251, 20);
		contentPane.add(comboBox);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(291, 215, 106, 23);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(146, 215, 106, 23);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				AdminPage adminPage = new AdminPage();
				adminPage.setVisible(true);
				
			}
		});
		contentPane.add(btnBack);
	}
}
