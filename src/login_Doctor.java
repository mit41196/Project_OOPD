import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class login_Doctor extends JFrame {

	private JPanel contentPane;
	private JTextField username_Doctor;
	private JPasswordField passwordField_Doctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_Doctor frame = new login_Doctor();
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
	public login_Doctor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoctorLogin = new JLabel("Doctor Login:");
		lblDoctorLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDoctorLogin.setBounds(46, 52, 136, 22);
		contentPane.add(lblDoctorLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(46, 120, 71, 14);
		contentPane.add(lblUsername);
		
		username_Doctor = new JTextField();
		username_Doctor.setBounds(136, 117, 235, 20);
		contentPane.add(username_Doctor);
		username_Doctor.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(46, 163, 71, 14);
		contentPane.add(lblPassword);
		
		JButton btnSubmit = new JButton("Submit");
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String password = passwordField_Doctor.getText();
				String user_name = username_Doctor.getText();
				String userId ="";
				String pass = "";
						
				System.out.println(user_name + password);
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
				
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					Statement st=c.createStatement();
					ResultSet rs=st.executeQuery("Select * from logindoctor where username = '"+user_name+"'");
					while(rs.next())
					{
						userId = rs.getString("username");
						pass = rs.getString("password");
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				System.out.println(userId + pass);
				if(user_name.equals(userId) && pass.equals(password))
				{
					close();
//					Doctor_Home dh = new Doctor_Home(user_name);
//					dh.setVisible(true);
					List_Of_Patients lop = new List_Of_Patients(user_name);
					lop.setVisible(true);
				}
				else
				{
					username_Doctor.setText("");
					passwordField_Doctor.setText("");
					JOptionPane.showMessageDialog(contentPane, "Invalid Credentials!!","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnSubmit.setBounds(168, 214, 89, 23);
		contentPane.add(btnSubmit);
		
		passwordField_Doctor = new JPasswordField();
		passwordField_Doctor.setBounds(136, 160, 235, 20);
		contentPane.add(passwordField_Doctor);
	}

}
