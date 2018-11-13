import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FindByNamePage extends JFrame {
	
	private JPanel contentPane;
	DefaultListModel model;
	
	/**
	 * Launch the application.
	 */
	JComboBox comboBox = new JComboBox();
	
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
	private void fillComboBoxId()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select * from doctor");
			while(rs.next())
			{
				String name = rs.getString("name");
				comboBox.addItem(name);
			}
			System.out.println("query");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

	public FindByNamePage() {
		fillComboBoxId();
		model = new DefaultListModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		System.out.println("vcx");
		
		comboBox.setBounds(190, 79, 185, 20);
		

		contentPane.add(comboBox);
		
		String id = (String)comboBox.getSelectedItem();
		System.out.println(id);
		
		JLabel label = new JLabel("");
		label.setBounds(22, 131, 46, 14);
		contentPane.add(label);
		
		JButton btnView = new JButton("VIEW");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnView.setBounds(173, 145, 89, 23);
		contentPane.add(btnView);
		
		JLabel lblSelectDrBy = new JLabel("Select DR. by NAME:");
		lblSelectDrBy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectDrBy.setBounds(49, 11, 202, 28);
		contentPane.add(lblSelectDrBy);
		
		JLabel lblNameOfDr = new JLabel("NAME OF DR.");
		lblNameOfDr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNameOfDr.setBounds(49, 82, 102, 17);
		contentPane.add(lblNameOfDr);

			}
}
