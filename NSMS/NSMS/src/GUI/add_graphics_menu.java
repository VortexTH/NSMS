package NSMS.src.GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_graphics_menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			add_graphics_menu dialog = new add_graphics_menu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public add_graphics_menu() {
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setTitle("Add A Graphics File");
		setBounds(100, 100, 440, 470);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 279, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(299, 49, 89, 23);
		contentPanel.add(btnBrowse);
		
		JLabel lblFilepath = new JLabel("Filepath");
		lblFilepath.setBounds(10, 27, 46, 14);
		contentPanel.add(lblFilepath);
		
		JLabel lblShareWith = new JLabel("Share with");
		lblShareWith.setBounds(51, 166, 81, 20);
		contentPanel.add(lblShareWith);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 178, 37, 8);
		contentPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(105, 178, 319, 2);
		contentPanel.add(separator_1);
		
		JRadioButton rdbtnEveryone = new JRadioButton("Everyone");
		rdbtnEveryone.setBounds(10, 193, 109, 23);
		contentPanel.add(rdbtnEveryone);
		
		JRadioButton rdbtnClassmates = new JRadioButton("Others in my course");
		rdbtnClassmates.setBounds(10, 218, 144, 23);
		contentPanel.add(rdbtnClassmates);
		
		JRadioButton rdbtnJustMeprivate = new JRadioButton("Just Me (private)");
		rdbtnJustMeprivate.setBounds(10, 244, 109, 23);
		contentPanel.add(rdbtnJustMeprivate);
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
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						dispose();
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
