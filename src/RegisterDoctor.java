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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class RegisterDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField contact;
	private JLabel lblEmail;
	private JTextField email;
	private JLabel lblCategorydepartment;
	private JLabel lblSchedule;
	private JTextField scheduledDays;
	private JLabel lblTimings;
	private JTextField timings;
	private JLabel lblDoctorPrecedence;
	private JButton btnRegister;
	private JComboBox comboBox_category;
	private JButton btnLogout;
	private JButton btnBack;
	private JComboBox comboBox_doc_precedence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterDoctor frame = new RegisterDoctor();
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
	/**
	 * 
	 */
	public RegisterDoctor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 377);
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblDoctorRegistration = new JLabel("Doctor Registration");
		lblDoctorRegistration.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblDoctorRegistration, "2, 2");
		
		JLabel lblName = new JLabel("Name:");
		contentPane.add(lblName, "2, 4, right, default");
		
		name = new JTextField();
		contentPane.add(name, "4, 4, fill, default");
		name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Address:");
		contentPane.add(lblNewLabel, "2, 6, right, default");
		
		address = new JTextField();
		contentPane.add(address, "4, 6, fill, default");
		address.setColumns(10);
		
		JLabel label = new JLabel("Contact:");
		contentPane.add(label, "2, 8, right, default");
		
		contact = new JTextField();
		contentPane.add(contact, "4, 8, fill, default");
		contact.setColumns(10);
		
		lblEmail = new JLabel("E-mail:");
		contentPane.add(lblEmail, "2, 10, right, default");
		
		email = new JTextField();
		contentPane.add(email, "4, 10, fill, default");
		email.setColumns(10);
		
		lblCategorydepartment = new JLabel("Category/Department:");
		contentPane.add(lblCategorydepartment, "2, 12, right, default");
		
		comboBox_category = new JComboBox();
		comboBox_category.addItem("Dept1");
		comboBox_category.addItem("Dept2");
		comboBox_category.addItem("Dept3");
		comboBox_category.addItem("Dept4");
		comboBox_category.addItem("Dept5");
		
		contentPane.add(comboBox_category, "4, 12, fill, default");
		
		lblSchedule = new JLabel("Schedule Days:");
		contentPane.add(lblSchedule, "2, 14, right, default");
		
		scheduledDays = new JTextField();
		contentPane.add(scheduledDays, "4, 14, fill, default");
		scheduledDays.setColumns(10);
		
		lblTimings = new JLabel("Timings:");
		contentPane.add(lblTimings, "2, 16, right, default");
		
		timings = new JTextField();
		contentPane.add(timings, "4, 16, fill, default");
		timings.setColumns(10);
		
		lblDoctorPrecedence = new JLabel("Doctor Precedence:");
		contentPane.add(lblDoctorPrecedence, "2, 18, right, default");
		
		comboBox_doc_precedence = new JComboBox();
		comboBox_doc_precedence.addItem("Junior Residents");
		comboBox_doc_precedence.addItem("Senior Residents");
		comboBox_doc_precedence.addItem("Specialists");
		comboBox_doc_precedence.addItem("Senior Specialists");
		
		contentPane.add(comboBox_doc_precedence, "4, 18, fill, default");
		
		
		btnRegister = new JButton("Register");
		
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nameField = name.getText();
				String addressField = address.getText();
				String contactField = contact.getText();
				String emailField = email.getText();
				String categoryField = (String)comboBox_category.getSelectedItem();
				String scheduleField = scheduledDays.getText();
				String timingField = timings.getText();
				String doctorPrecedenceField = (String)comboBox_doc_precedence.getSelectedItem();
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					Statement s2=c.createStatement();
					s2.executeUpdate("Insert into doctor (name, address, contact, email, category, scheduled_days, timings, doctor_position) values ('"+nameField+"', '"+addressField+"', '"+contactField+"', '"+emailField+"', '"+categoryField+"', '"+scheduleField+"', '"+timingField+"', '"+doctorPrecedenceField+"')");
					s2.executeUpdate("Insert into "+categoryField+"(name, address, contact, email, category, scheduled_days, timings, doctor_position) values ('"+nameField+"', '"+addressField+"', '"+contactField+"', '"+emailField+"', '"+categoryField+"', '"+scheduleField+"', '"+timingField+"', '"+doctorPrecedenceField+"')");
					name.setText("");
					address.setText("");
					contact.setText("");
					email.setText("");
					scheduledDays.setText("");
					timings.setText("");
					comboBox_category.setSelectedItem(0);
					comboBox_doc_precedence.setSelectedItem(0);
					
					JOptionPane.showMessageDialog(contentPane, "Doctor Registered Successfully...!","Success", JOptionPane.INFORMATION_MESSAGE);
				}	
				catch (SQLException | ClassNotFoundException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnRegister, "4, 22");
		btnBack = new JButton("Back");
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				AdminPage adminPage = new AdminPage();
				adminPage.setVisible(true);
			}
		});
		
		contentPane.add(btnBack, "2, 22");
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				start st = new start();
				st.setVisible(true);
			}
		});
		
		
		contentPane.add(btnLogout, "4, 24");
	}

}
