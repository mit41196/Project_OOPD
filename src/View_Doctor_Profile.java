import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class View_Doctor_Profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Doctor_Profile frame = new View_Doctor_Profile();
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
	public View_Doctor_Profile() {
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
		lblCategory.setBounds(56, 143, 129, 15);
		contentPane.add(lblCategory);
		
		JLabel lblScheduleDays = new JLabel("SCHEDULE DAYS:");
		lblScheduleDays.setBounds(56, 170, 141, 15);
		contentPane.add(lblScheduleDays);
		
		JLabel lblTimings = new JLabel("TIMINGS:");
		lblTimings.setBounds(56, 197, 70, 15);
		contentPane.add(lblTimings);
		
		JLabel lblDoctorPrecedence = new JLabel("DOCTOR PRECEDENCE:");
		lblDoctorPrecedence.setBounds(56, 224, 180, 15);
		contentPane.add(lblDoctorPrecedence);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(56, 251, 129, 15);
		contentPane.add(lblPassword);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Doctor_Home dh=new Doctor_Home();
				dh.setVisible(true);
			}
		});
		btnBack.setBounds(12, 292, 117, 25);
		contentPane.add(btnBack);
		
		JButton btnUpdate = new JButton("EDIT");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Edit_Doctor ed =  new Edit_Doctor();
				ed.setVisible(true);
			}
		});
		
		
		btnUpdate.setBounds(293, 292, 117, 25);
		contentPane.add(btnUpdate);
	}

}
