import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ReferDoctor extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Statement s2;
	ResultSet rs;
	ResultSet rs1;
	Connection c;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ReferDoctor frame = new ReferDoctor();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public ReferDoctor(String user_name, String patient_id) throws SQLException {
		
		
		String ss = "Senior Specialists";
		String s = "Specialists";
		String sr = "Senior Residents";
		String dept_name = "";
		String doctor_pos = "";
		String patient_name = "";
		table = new JTable();
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {

				int row=table.rowAtPoint(e.getPoint());
				int col= table.columnAtPoint(e.getPoint());
				String selected_id = table.getValueAt(row,0).toString();
//				JOptionPane.showMessageDialog(null,"Value in the cell clicked : " +table.getValueAt(row,0).toString());

				System.out.println("Value in the cell clicked :"+ " "  +table.getValueAt(row,0).toString());
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
					s2=c.createStatement();
					s2.executeUpdate("Update patient SET doctor_username='"+selected_id+"' where uniqueId='"+patient_id+"'");
					JOptionPane.showMessageDialog(contentPane, " DOCTOR UPDATED...!","Success", JOptionPane.INFORMATION_MESSAGE);
				}	
				catch(Exception e1)
				{
					e1.printStackTrace();
				}

				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReferToDoctor = new JLabel("Refer To Doctor:");
		lblReferToDoctor.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblReferToDoctor.setBounds(35, 25, 103, 16);
		contentPane.add(lblReferToDoctor);
		
		JLabel lblPossibleReferences = new JLabel("Possible References :");
		lblPossibleReferences.setBounds(35, 68, 130, 14);
		contentPane.add(lblPossibleReferences);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 94, 374, 156);
		contentPane.add(scrollPane);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost/oopd","root","root");
			s2=c.createStatement();
			rs = s2.executeQuery("Select * from doctor where username = '"+user_name+"'");
			
			while(rs.next())
			{
				dept_name = rs.getString("category");
				doctor_pos = rs.getString("doctor_position");
			}
			
			
			
//			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		rs1 = s2.executeQuery("Select * from patient where uniqueId = '"+patient_id+"'");
		while(rs1.next())
		{
			patient_name = rs1.getString("name");
		}
		
		System.out.println(dept_name);
		if (doctor_pos.equals("Junior Residents"))
		{
			rs = s2.executeQuery("Select username, name, doctor_position, category from doctor where doctor_position IN('"+ss+"', '"+s+"', '"+sr+"') and category = '"+dept_name+"'");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		else if(doctor_pos.equals("Senior Residents"))
		{
			rs = s2.executeQuery("Select username, name, doctor_position, category from doctor where doctor_position IN('"+ss+"', '"+s+"') and category = '"+dept_name+"'");
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		else if(doctor_pos.equals("Specialists"))
		{
			rs = s2.executeQuery("Select username, name, doctor_position, category from doctor where doctor_position IN('"+ss+"')");
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		else
		{
			rs = s2.executeQuery("Select username, name, doctor_position, category from doctor where doctor_position IN('"+ss+"')");
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				View_Patient_Details_Doctor vpdd = new View_Patient_Details_Doctor(patient_id, user_name);
				vpdd.setVisible(true);
			}
		});
		btnBack.setBounds(319, 22, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblName = new JLabel("Patient Name:");
		lblName.setBounds(35, 52, 103, 14);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel(patient_name);
		lblNewLabel.setBounds(168, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
	}
}
