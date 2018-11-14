import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;

public class SelectedDoctorProfileDetails extends JFrame {

	private JPanel contentPane;
	private JLabel timings;
	private JLabel name;
	Statement s2;
	ResultSet rs;
	int range;
	int countvalue;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					View_Doctor_Profile frame = new View_Doctor_Profile();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void close()
	{
		WindowEvent closeEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
	}
	/**
	 * Create the frame.
	 */
	
	public SelectedDoctorProfileDetails(String doctor_name) {
		
		String name = "";
		String address = "";
		String contact = "";
		String email = "";
		String category = "";
		String doctor_position = "";
		String username = "";
		String timings = "";
		//int countvalue;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
			s2=c.createStatement();
			rs = s2.executeQuery("Select * from doctor where name = '"+doctor_name+"'");
			while(rs.next())
			{
				name = rs.getString("name");
				address = rs.getString("address");
				contact = rs.getString("contact");
				email = rs.getString("email");
				category = rs.getString("category");
				doctor_position = rs.getString("doctor_position");
				username = rs.getString("username");
				timings=rs.getString("timings");
				countvalue=rs.getInt("patients_count");
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		final String name1 = new String(name);
		final String timings1= new String(timings);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourProfile = new JLabel("YOUR PROFILE");
		lblYourProfile.setBounds(145, 12, 129, 15);
		contentPane.add(lblYourProfile);
		
		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setBounds(56, 39, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADDRESS:");
		lblNewLabel_1.setBounds(56, 66, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTACT:");
		lblNewLabel_2.setBounds(56, 93, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL:");
		lblNewLabel_3.setBounds(56, 120, 70, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblCategory = new JLabel("CATEGORY:");
		lblCategory.setBounds(56, 153, 129, 15);
		contentPane.add(lblCategory);
		
		JLabel lblTimings = new JLabel("TIMINGS:");
		lblTimings.setBounds(56, 197, 70, 15);
		contentPane.add(lblTimings);
		
		JLabel lblDoctorPrecedence = new JLabel("DOCTOR PRECEDENCE:");
		lblDoctorPrecedence.setBounds(56, 223, 169, 15);
		contentPane.add(lblDoctorPrecedence);
		
//		JButton btnBack = new JButton("BACK");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				close();
//				Doctor_Home dh=new Doctor_Home(user_name);
//				dh.setVisible(true);
//			}
//		});
//		btnBack.setBounds(12, 292, 117, 25);
//		contentPane.add(btnBack);
//		
//		JButton btnUpdate = new JButton("EDIT");
//		btnUpdate.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				close();
//				Edit_Doctor ed =  new Edit_Doctor(user_name);
//				ed.setVisible(true);
//			}
//		});
//		
		
//		btnUpdate.setBounds(293, 292, 117, 25);
//		contentPane.add(btnUpdate);
//		
		JLabel lblNewLabel_4 = new JLabel(name);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(240, 38, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(address);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(200, 66, 189, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(contact);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(210, 93, 179, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(email);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(220, 120, 169, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(category);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(210, 143, 169, 14);
		contentPane.add(lblNewLabel_8);
		
//		JLabel lblNewLabel_9 = new JLabel(scheduled_days);
//		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
//		lblNewLabel_9.setBounds(207, 170, 172, 14);
//		contentPane.add(lblNewLabel_9);
//		
		JLabel lblNewLabel_10 = new JLabel(doctor_position);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(220, 224, 169, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnBookAppointment = new JButton("Book Appointment");

		btnBookAppointment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				countvalue=countvalue-1;
				
				Connection c;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					c = DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					s2=c.createStatement();
					s2.executeUpdate("Update doctor SET patients_count = '"+countvalue+"' where name = '"+doctor_name+"'");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				if(countvalue>0)
				{
					//close();
					JOptionPane.showMessageDialog(contentPane,  "Doctor Assigned:" + name1+"\nTimings Alloted: "+timings1," Successfully DONE..!", JOptionPane.INFORMATION_MESSAGE);
//					AdminPage adminPage = new AdminPage();
//					adminPage.setVisible(true);
				}
				else
				{
					/*username.setText("");
			
					passwordField.setText("");*/
					JOptionPane.showMessageDialog(contentPane, "Doctor Not Available..!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnBookAppointment.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBookAppointment.setBounds(105, 293, 228, 28);
		contentPane.add(btnBookAppointment);
	}
}
