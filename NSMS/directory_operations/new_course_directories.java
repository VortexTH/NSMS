package directory_operations;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class new_course_directories extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			new_course_directories dialog = new new_course_directories();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public new_course_directories() {
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblAddYourCourses = new JLabel("Add Your Courses:");
			lblAddYourCourses.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblAddYourCourses.setBounds(141, 11, 173, 14);
			contentPanel.add(lblAddYourCourses);
		}
		
		JLabel lblHighLevel = new JLabel("High Level");
		lblHighLevel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHighLevel.setBounds(69, 69, 78, 27);
		contentPanel.add(lblHighLevel);
		
		JLabel lblSatndardLevel = new JLabel("Standard Level");
		lblSatndardLevel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSatndardLevel.setBounds(280, 69, 85, 27);
		contentPanel.add(lblSatndardLevel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 94, 414, 2);
		contentPanel.add(separator);
		{
			JSeparator separator_1 = new JSeparator();
			separator_1.setOrientation(SwingConstants.VERTICAL);
			separator_1.setBounds(212, 94, 9, 323);
			contentPanel.add(separator_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(29, 107, 173, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(29, 138, 173, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(29, 169, 173, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel label = new JLabel("1.)");
			label.setBounds(10, 110, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("2.)");
			label.setBounds(10, 141, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("3.)");
			label.setBounds(10, 172, 46, 14);
			contentPanel.add(label);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(29, 200, 173, 20);
			contentPanel.add(textField_3);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(29, 231, 173, 20);
			contentPanel.add(textField_4);
		}
		{
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(29, 262, 173, 20);
			contentPanel.add(textField_5);
		}
		{
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(251, 107, 173, 20);
			contentPanel.add(textField_7);
		}
		{
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(251, 138, 173, 20);
			contentPanel.add(textField_8);
		}
		{
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(251, 169, 173, 20);
			contentPanel.add(textField_9);
		}
		{
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(251, 200, 173, 20);
			contentPanel.add(textField_10);
		}
		{
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(251, 231, 173, 20);
			contentPanel.add(textField_11);
		}
		{
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(251, 262, 173, 20);
			contentPanel.add(textField_12);
		}
		{
			JLabel label = new JLabel("4.)");
			label.setBounds(10, 203, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("5.)");
			label.setBounds(10, 234, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("6.)");
			label.setBounds(10, 265, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("6.)");
			label.setBounds(231, 265, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("5.)");
			label.setBounds(231, 234, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("4.)");
			label.setBounds(231, 203, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("3.)");
			label.setBounds(231, 172, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("2.)");
			label.setBounds(231, 141, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("1.)");
			label.setBounds(231, 110, 46, 14);
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
