import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class RegisterPatient extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField contact;
	private JTextField email;
	private JTextField bloodgroup;
	private JLabel lblGender;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lblLocation;
	private JRadioButton rdbtnOpd;
	private JRadioButton rdbtnLocal;
	private JButton btnRegister;
	private JLabel lblPassword;
	private JLabel lblDepartment;
	private JComboBox comboBox_Department;
	private JPasswordField passwordField;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPatient frame = new RegisterPatient();
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
	public RegisterPatient() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblPatientRegistration = new JLabel("Patient Registration");
		lblPatientRegistration.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblPatientRegistration, "2, 2");
		
		JLabel lblName = new JLabel("Name:");
		contentPane.add(lblName, "2, 4, right, default");
		
		name = new JTextField();
		contentPane.add(name, "4, 4, fill, default");
		name.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		contentPane.add(lblAddress, "2, 6, right, default");
		
		address = new JTextField();
		contentPane.add(address, "4, 6, fill, default");
		address.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact:");
		contentPane.add(lblContact, "2, 8, right, default");
		
		contact = new JTextField();
		contentPane.add(contact, "4, 8, fill, default");
		contact.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		contentPane.add(lblEmail, "2, 10, right, default");
		
		email = new JTextField();
		contentPane.add(email, "4, 10, fill, default");
		email.setColumns(10);
		
		JLabel lblBloodgroup = new JLabel("Bloodgroup:");
		contentPane.add(lblBloodgroup, "2, 12, right, default");
		
		bloodgroup = new JTextField();
		contentPane.add(bloodgroup, "4, 12, fill, default");
		bloodgroup.setColumns(10);
		
		lblGender = new JLabel("Gender:");
		contentPane.add(lblGender, "2, 14");
		
		rdbtnMale = new JRadioButton("Male");
		contentPane.add(rdbtnMale, "4, 14");
		
		rdbtnFemale = new JRadioButton("Female");
		contentPane.add(rdbtnFemale, "4, 16");
		
		lblLocation = new JLabel("Location:");
		contentPane.add(lblLocation, "2, 18");
		
		rdbtnOpd = new JRadioButton("OPD");
		contentPane.add(rdbtnOpd, "4, 18");
		
		rdbtnLocal = new JRadioButton("LOCAL");
		contentPane.add(rdbtnLocal, "4, 20");
		
		lblPassword = new JLabel("Password:");
		contentPane.add(lblPassword, "2, 22, right, default");
		
		passwordField = new JPasswordField();
		contentPane.add(passwordField, "4, 22, fill, default");
		
		lblDepartment = new JLabel("Department:");
		contentPane.add(lblDepartment, "2, 24, right, default");
		
		comboBox_Department = new JComboBox();
		
		comboBox_Department.addItem("Dept1");
		comboBox_Department.addItem("Dept2");
		comboBox_Department.addItem("Dept3");
		comboBox_Department.addItem("Dept4");
		comboBox_Department.addItem("Dept5");
		
		contentPane.add(comboBox_Department, "4, 24, fill, default");
		
	
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nameField = name.getText();
				String addressField = address.getText();
				String contactField = contact.getText();
				String emailField = email.getText();
				String bloodgroupField = bloodgroup.getText();
				String password = passwordField.getText();
				String departmentField = (String)comboBox_Department.getSelectedItem();
				String locationField = null;
				String genderField = null;
				
				if (rdbtnOpd.isSelected())
					locationField = rdbtnOpd.getText();
				else if(rdbtnLocal.isSelected())
					locationField = rdbtnLocal.getText();
				
				if (rdbtnFemale.isSelected())
					genderField = rdbtnFemale.getText();
				else if(rdbtnMale.isSelected())
					genderField = rdbtnMale.getText();
				
				String unique_Id = departmentField + "_" + contactField;
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					Statement s2=c.createStatement();
					s2.executeUpdate("Insert into patient(name, address, contact, email, bloodgroup, gender, location, password, department, uniqueId) values ('"+nameField+"', '"+addressField+"', '"+contactField+"', '"+emailField+"', '"+bloodgroupField+"', '"+genderField+"', '"+locationField+"','"+password+"', '"+departmentField+"', '"+unique_Id+"')");
					s2.executeUpdate("Insert into loginPatient(uniqueId, password) values ('"+unique_Id+"', '"+password+"')");
					name.setText("");
					address.setText("");
					contact.setText("");
					email.setText("");
					bloodgroup.setText("");
					comboBox_Department.setSelectedIndex(0);
					passwordField.setText("");
					
					JOptionPane.showMessageDialog(contentPane, "Patient Registered Successfully...!\n" + "Patient ID:" + unique_Id,"Success", JOptionPane.INFORMATION_MESSAGE);
				}	
				catch (SQLException | ClassNotFoundException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				login_Patient loginP = new login_Patient();
				loginP.setVisible(true);
				
			}
		});
		contentPane.add(btnBack, "2, 27");
		
		contentPane.add(btnRegister, "4, 27");	
	}

}
