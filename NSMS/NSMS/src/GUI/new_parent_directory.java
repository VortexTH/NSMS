package NSMS.src.GUI;

import NSMS.dir_operations.*;
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
	
    public String parentpath;
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
		
		JLabel lblThisWillCreate = new JLabel("<html>This will create a new Folder in your machine's home directory, which will ultimately contain your LOCAL NSMS file-system and serve as a storage for all imported files. If you want to specify a different location for the NSSM Parent folder, do so below:</html>");
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
		txtparentpath.setBounds(10, 259, 292, 20);
		contentPanel.add(txtparentpath);
		txtparentpath.setColumns(10);
		
		txtparentpath.setText(System.getProperty("user.home"));
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooseparentpath = new JFileChooser();
				chooseparentpath.setCurrentDirectory(new File(System.getProperty("user.home")));
				chooseparentpath.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooseparentpath.setAcceptAllFileFilterUsed(false);
				
				int selection = chooseparentpath.showOpenDialog(null);		
				
				   if(selection == JFileChooser.APPROVE_OPTION){
					   txtparentpath.setText(chooseparentpath.getSelectedFile().getAbsolutePath());
			        	
			          }
			      
			        else if (selection == JFileChooser.CANCEL_OPTION){
			           txtparentpath.setText(System.getProperty("user.home"));
			          }
		          
				
				
			}
		});
		btnBrowse.setBounds(312, 258, 89, 23);
		contentPanel.add(btnBrowse);
		
		JLabel lblCustomLocationwill = new JLabel("Custom Location (Will set to default when left empty)");
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
						
						String outputpath;
						
						
						outputpath = txtparentpath.getText();
						
						parentpath = outputpath + "\\NSMS_ParentDir";
						
						File parentdir = new File(parentpath);
						
						if (!parentdir.exists()){				
						  parentdir.mkdir();
						  }
						
						else{
							JOptionPane.showMessageDialog(null, "An NSMS Parent Folder already exists in this location! It will be imported!");
						    }
						 
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
}
