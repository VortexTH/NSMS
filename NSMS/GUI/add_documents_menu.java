package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.filechooser.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class add_documents_menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtdocumentfilepath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			add_documents_menu dialog = new add_documents_menu();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public add_documents_menu() {
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setTitle("Add a Text Document");
		setBounds(100, 100, 343, 333);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtdocumentfilepath = new JTextField();
		txtdocumentfilepath.setBounds(10, 50, 222, 20);
		contentPanel.add(txtdocumentfilepath);
		txtdocumentfilepath.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                //Initializes JFileChooser
				JFileChooser choosedocument = new JFileChooser();	
				
				//Creates a filename extension filter
				FileNameExtensionFilter filefilter = new FileNameExtensionFilter("Text Documents","doc","docx","txt","odt","rtf");
				
				//sets filter
				choosedocument.setFileFilter(filefilter);

				//Sets starting directory of choosedocument
				choosedocument.setCurrentDirectory(new File(System.getProperty("user.home")));
				
				//This method wont work!!!
				/**
				//Properties of dialog
				documents.setSize(450,500);
				documents.getContentPane().add(choosedocument);
				
				documents.setModal(true);
				documents.setAlwaysOnTop(true);
				documents.requestFocus();
				documents.setVisible(true);
				**/
				
				//Initializes variable containing return value of JFileChooser				
				int selection = choosedocument.showOpenDialog(null);				
			
		        if(selection == JFileChooser.APPROVE_OPTION){
		        	txtdocumentfilepath.setText(choosedocument.getSelectedFile().getAbsolutePath());
		        	
		          }
		      
		        else if (selection == JFileChooser.CANCEL_OPTION){
		        	//documents.dispose();
		          }
	          
	          
			}
		});
		btnBrowse.setBounds(242, 49, 89, 23);
		contentPanel.add(btnBrowse);
		
		JLabel lblFilepath = new JLabel("Filepath");
		lblFilepath.setBounds(10, 27, 46, 14);
		contentPanel.add(lblFilepath);
		
		JLabel lblShareWith = new JLabel("Share with");
		lblShareWith.setBounds(52, 81, 81, 20);
		contentPanel.add(lblShareWith);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 93, 37, 8);
		contentPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(116, 93, 211, 2);
		contentPanel.add(separator_1);
		
		JRadioButton rdbtnEveryone = new JRadioButton("Everyone");
		rdbtnEveryone.setBounds(10, 108, 109, 23);
		contentPanel.add(rdbtnEveryone);
		
		JRadioButton rdbtnClassmates = new JRadioButton("Others in my course");
		rdbtnClassmates.setBounds(10, 134, 144, 23);
		contentPanel.add(rdbtnClassmates);
		
		JRadioButton rdbtnJustMeprivate = new JRadioButton("Just Me (private)");
		rdbtnJustMeprivate.setBounds(10, 160, 144, 23);
		contentPanel.add(rdbtnJustMeprivate);
		
		txtdocumentfilepath = new JTextField();
		txtdocumentfilepath.setBounds(10, 50, 222, 20);
		contentPanel.add(txtdocumentfilepath);
		txtdocumentfilepath.setColumns(10);
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
