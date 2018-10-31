import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class CategoryPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoryPage frame = new CategoryPage();
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
	public CategoryPage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategoriesAvailabale = new JLabel("Categories Availabale");
		lblCategoriesAvailabale.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoriesAvailabale.setBounds(127, 11, 213, 14);
		contentPane.add(lblCategoriesAvailabale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Cardiologist");
		comboBox.addItem("Opthalmologist");
		comboBox.addItem("Dermatologist");
		comboBox.addItem("ENT(Ear-Nose-Throat) Specialist");
		comboBox.setBounds(84, 52, 276, 20);
		contentPane.add(comboBox);
	}
}
