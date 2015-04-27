//package directory_operations;
package directory_operations;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class new_parent_directory extends JDialog {
	
	public String outputpath;
	public String parentpath;
	public String output = "a";

	private final JPanel contentPanel = new JPanel();
	private JTextField txtparentpath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			new_parent_directory dialog = new new_parent_directory();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public new_parent_directory() {
		setBounds(100, 100, 450, 402);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblThisWillCreate = new JLabel("<html>This will create a new Folder in your machine's home directory, which will ultimately contain your LOCAL NSMS file-system and serve as a storage for all imported files.</html>");
		lblThisWillCreate.setBounds(10, 57, 414, 77);
		contentPanel.add(lblThisWillCreate);
		{
			JLabel lblCreateANew = new JLabel("Create A new NSMS Parent Directory");
			lblCreateANew.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblCreateANew.setBounds(10, 11, 292, 35);
			contentPanel.add(lblCreateANew);
		}
		
		JSeparator separator = new JSeparator();
		separator.setBounds(290, 30, 134, 8);
		contentPanel.add(separator);
		
		txtparentpath = new JTextField();
		txtparentpath.setEditable(false);
		txtparentpath.setBounds(10, 259, 292, 20);
		contentPanel.add(txtparentpath);
		txtparentpath.setColumns(10);
		
		//sets the text of this jtextfield to the current user's home directory
		txtparentpath.setText(System.getProperty("user.home"));
		
		JLabel lblCustomLocationwill = new JLabel("This is the location the directory will be created in:");
		lblCustomLocationwill.setBounds(10, 234, 391, 14);
		contentPanel.add(lblCustomLocationwill);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//initiates variables containing file names
						String name = ".NSMS";
						String parentname = "ParentDir";
						
						//did this to keep the option of including custom dir functionality later
						outputpath = txtparentpath.getText();
						parentpath = outputpath + "\\.NSMS";
						
						@SuppressWarnings("unused")
						general_operations newdir = new general_operations();
						
						newdir.new_dir(outputpath, name);
						newdir.new_dir(parentpath, parentname);						
						
						//This opens course entry option:
						new_course_directories entercourses = new new_course_directories();
						entercourses.setVisible(true);
						
						dispose();
												
					}
				});
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
	
	public String renameoutputpath (){
		
		output = outputpath; 		
		return output;
	}
	
	
}
