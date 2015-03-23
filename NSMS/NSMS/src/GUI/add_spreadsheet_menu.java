package NSMS.src.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
import javax.swing.filechooser.FileNameExtensionFilter;

public class add_spreadsheet_menu extends JDialog {


	private final JPanel contentPanel = new JPanel();
	private JTextField txtspreadsheetfilepath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			add_graphics_menu dialog = new add_graphics_menu();
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
	public add_spreadsheet_menu() {
		
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setTitle("Add A Spreadsheet File");
		setBounds(100, 100, 440, 470);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtspreadsheetfilepath = new JTextField();
		txtspreadsheetfilepath.setBounds(10, 50, 279, 20);
		contentPanel.add(txtspreadsheetfilepath);
		txtspreadsheetfilepath.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                //Initializes JFileChooser
				JFileChooser choosespreadsheet = new JFileChooser();	
				
				//Creates a filename extension filter
				FileNameExtensionFilter filefilter = new FileNameExtensionFilter("Spreadsheet Files","xlr","xls","xlsx");
				
				//sets filter
				choosespreadsheet.setFileFilter(filefilter);
				
				//Sets starting directory of choosepdf
				choosespreadsheet.setCurrentDirectory(new File(System.getProperty("user.home")));
				
				//This method wont work!!!
				/**
				//Properties of dialog
				spreadsheet.setSize(450,500);
				spreadsheet.getContentPane().add(chooseimage);
				
				spreadsheet.setModal(true);
				spreadsheet.setAlwaysOnTop(true);
				spreadsheet.requestFocus();
				spreadsheet.setVisible(true);
				**/
				
				//Initializes variable containing return value of JFileChooser				
				int selection = choosespreadsheet.showOpenDialog(null);				
			
		        if(selection == JFileChooser.APPROVE_OPTION){
		        	txtspreadsheetfilepath.setText(choosespreadsheet.getSelectedFile().getAbsolutePath());
		        	
		          }
		      
		        else if (selection == JFileChooser.CANCEL_OPTION){
		        	//spreadsheet.dispose();
		          }
	          
	          
			}
		});
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
		separator_1.setBounds(116, 178, 308, 2);
		contentPanel.add(separator_1);
		
		JRadioButton rdbtnEveryone = new JRadioButton("Everyone");
		rdbtnEveryone.setBounds(10, 193, 109, 23);
		contentPanel.add(rdbtnEveryone);
		
		JRadioButton rdbtnClassmates = new JRadioButton("Others in my course");
		rdbtnClassmates.setBounds(10, 218, 144, 23);
		contentPanel.add(rdbtnClassmates);
		
		JRadioButton rdbtnJustMeprivate = new JRadioButton("Just Me (private)");
		rdbtnJustMeprivate.setBounds(10, 244, 144, 23);
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