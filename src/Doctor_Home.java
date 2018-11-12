import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Doctor_Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Doctor_Home frame = new Doctor_Home();
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
	public Doctor_Home(String user_name) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeDoctor = new JLabel("WELCOME DOCTOR");
		lblWelcomeDoctor.setBounds(140, 12, 176, 15);
		contentPane.add(lblWelcomeDoctor);
		
		JButton btnNewButton = new JButton("VIEW PROFILE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				View_Doctor_Profile vdp=new View_Doctor_Profile(user_name);
				vdp.setVisible(true);
			}
		});
		btnNewButton.setBounds(73, 64, 271, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW PATIENT LIST");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				List_Of_Patients lop=new List_Of_Patients(user_name);
				lop.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(73, 120, 271, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				start star =new start();
				star.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(73, 220, 271, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIAGNOSE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Diagnosis dg =new Diagnosis(user_name);
				dg.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(73, 172, 271, 25);
		contentPane.add(btnNewButton_3);
	}
}
