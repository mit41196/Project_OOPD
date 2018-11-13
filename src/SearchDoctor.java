//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SearchDoctor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchDoctor frame = new SearchDoctor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchDoctor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblFindAndBook = new JLabel("Find and Book By:");
		lblFindAndBook.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFindAndBook.setBounds(154, 11, 178, 14);
		getContentPane().add(lblFindAndBook);
		
		JButton btnCategory = new JButton("Category ");

		btnCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//close();
				CategoryPage categorypage = new CategoryPage();
				categorypage.setVisible(true);
			}
		});
		
		btnCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCategory.setBounds(94, 59, 238, 29);
		getContentPane().add(btnCategory);
		
		JButton btnNameOfDoctor = new JButton("Name of Doctor");
		btnNameOfDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//close();
				FindByNamePage findbynamepage = new FindByNamePage();
				findbynamepage.setVisible(true);
			}
		});
		
		btnNameOfDoctor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNameOfDoctor.setBounds(94, 108, 238, 29);
		getContentPane().add(btnNameOfDoctor);
		
		JButton btnAddressOfDoctor = new JButton("Address of Doctor");
		btnAddressOfDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//close();
				FindByAddressPage findbyaddresspage = new FindByAddressPage();
				findbyaddresspage.setVisible(true);
			}
		});
		
		btnAddressOfDoctor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddressOfDoctor.setBounds(94, 158, 238, 29);
		getContentPane().add(btnAddressOfDoctor);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(167, 213, 89, 23);
		getContentPane().add(btnBack);
	}
}
