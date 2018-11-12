import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

public class UpdateDepartment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	JComboBox comboBox_id = new JComboBox();
	JComboBox comboBox_hod = new JComboBox();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDepartment frame = new UpdateDepartment();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void fillComboBoxId()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select * from department");
			while(rs.next())
			{
				String id = rs.getString("dept_id");
				comboBox_id.addItem(id);
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
	private void fillComboBoxHod()
	{
		String id = (String)comboBox_id.getSelectedItem();
		System.out.println(id);
		String position = "Senior Specialists";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select * from doctor where category = '"+id+"' and doctor_position = '"+position+"'");
			while(rs.next())
			{
				String hod = rs.getString("name");
				comboBox_hod.addItem(hod);
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	/**
	 * Create the frame.
	 */
	public UpdateDepartment() {
		
		fillComboBoxId();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeptId = new JLabel("Dept. Id:");
		lblDeptId.setBounds(33, 82, 77, 14);
		contentPane.add(lblDeptId);
		
		
		comboBox_id.setBounds(190, 79, 185, 20);
		contentPane.add(comboBox_id);
		
		JLabel lblNewLabel = new JLabel("Dept. HOD");
		lblNewLabel.setBounds(33, 136, 69, 14);
		contentPane.add(lblNewLabel);
		
		comboBox_hod.setBounds(190, 133, 185, 20);
		contentPane.add(comboBox_hod);
		
		JLabel lblUpdateDepartment = new JLabel("Update Department");
		lblUpdateDepartment.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUpdateDepartment.setBounds(33, 22, 139, 14);
		contentPane.add(lblUpdateDepartment);
		fillComboBoxHod();
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String selectedId = (String)comboBox_id.getSelectedItem();
				String selectedHod = (String)comboBox_hod.getSelectedItem();
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
				
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					Statement st=c.createStatement();
					ResultSet rs=st.executeQuery("Update department SET dept_hod='"+selectedHod+"' where dept_id='"+selectedId+"'");
					while(rs.next())
					{
						String id = rs.getString("dept_id");
						comboBox_id.addItem(id);
					}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setBounds(154, 206, 89, 23);
		contentPane.add(btnUpdate);
	}
}
