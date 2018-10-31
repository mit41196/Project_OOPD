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
		btnCategory.setBounds(94, 51, 238, 23);
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
		btnNameOfDoctor.setBounds(94, 85, 238, 23);
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
		btnAddressOfDoctor.setBounds(94, 119, 238, 23);
		getContentPane().add(btnAddressOfDoctor);
		
		JButton btnIdOfDoctor = new JButton("ID of Doctor");
		btnIdOfDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//close();
				FindByIDPage findbyidpage = new FindByIDPage();
				findbyidpage.setVisible(true);
			}
		});
		
		btnIdOfDoctor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIdOfDoctor.setBounds(94, 153, 238, 23);
		getContentPane().add(btnIdOfDoctor);
	}
}
