import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Toolkit;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Add Doctor");
		btnNewButton.setBounds(54, 51, 301, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				RegisterDoctor registerDoctor = new RegisterDoctor();
				registerDoctor.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblWelcomeadmin = new JLabel("Welcome ADMIN!!");
		lblWelcomeadmin.setBounds(138, 23, 151, 17);
		lblWelcomeadmin.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblWelcomeadmin);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reassignment of Doctor");
		btnNewButton_1.setBounds(54, 187, 301, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(54, 221, 301, 23);
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				start st = new start();
				st.setVisible(true);
			}
		});
		
		contentPane.add(btnLogout);
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				ViewDetails_Admin viewDetail;
				try {
					viewDetail = new ViewDetails_Admin();
					viewDetail.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnViewDetails.setBounds(54, 119, 301, 23);
		contentPane.add(btnViewDetails);
		
		JButton btnAddDepartment = new JButton("Add Department");
		btnAddDepartment.setBounds(54, 153, 301, 23);
		btnAddDepartment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				AddDepartment addDepartment = new AddDepartment();
				addDepartment.setVisible(true);
				
			}
		});
		contentPane.add(btnAddDepartment);
		
		JButton btnRemoveDoctor = new JButton("Remove Doctor");
		btnRemoveDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RemoveDoctor rd = new RemoveDoctor();
				rd.setVisible(true);
			}
		});
		btnRemoveDoctor.setBounds(54, 85, 301, 23);
		contentPane.add(btnRemoveDoctor);
		
			}
}
