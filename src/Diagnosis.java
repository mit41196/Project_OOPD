import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Diagnosis extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagnosis frame = new Diagnosis();
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
	public Diagnosis() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientDiagnosis = new JLabel("PATIENT DIAGNOSIS");
		lblPatientDiagnosis.setBounds(135, 12, 145, 15);
		contentPane.add(lblPatientDiagnosis);
		
		JLabel lblPatientId = new JLabel("PATIENT ID:");
		lblPatientId.setBounds(35, 54, 107, 15);
		contentPane.add(lblPatientId);
		
		JLabel lblDiagnosis = new JLabel("DIAGNOSIS:");
		lblDiagnosis.setBounds(35, 106, 94, 15);
		contentPane.add(lblDiagnosis);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(198, 106, 189, 106);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(270, 224, 117, 25);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Doctor_Home dh=new Doctor_Home();
				dh.setVisible(true);
			}
		});
		btnBack.setBounds(25, 224, 117, 25);
		contentPane.add(btnBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(198, 49, 189, 24);
		contentPane.add(comboBox);
	}
}
