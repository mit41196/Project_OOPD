import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import java.sql.*;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ViewDetails_Admin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnViewDoctor;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetails_Admin frame = new ViewDetails_Admin();
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
	 * @throws SQLException 
	 */
	public ViewDetails_Admin() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Select");
		comboBox.addItem("Doctor");
		comboBox.addItem("Patient");
	
		
		comboBox.setBounds(97, 11, 267, 20);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 66, 613, 361);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnViewDoctor = new JButton("View Doctor");
		
		btnViewDoctor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					Statement st = c.createStatement();
					ResultSet rs = st.executeQuery("Select * from doctor");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch (ClassNotFoundException | SQLException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
			}
		});
		btnViewDoctor.setBounds(156, 42, 89, 23);
		contentPane.add(btnViewDoctor);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				close();
				AdminPage adminPage = new AdminPage();
				adminPage.setVisible(true);
				
			}
		});
		btnBack.setBounds(399, 32, 89, 23);
		contentPane.add(btnBack);
	}
}
