package GUI;

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

public class add_pdf_menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtpdffilepath;

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
	public add_pdf_menu() {
		
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setTitle("Add A PDF File");
		setBounds(100, 100, 440, 470);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtpdffilepath = new JTextField();
		txtpdffilepath.setBounds(10, 50, 279, 20);
		contentPanel.add(txtpdffilepath);
		txtpdffilepath.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                //Initializes JFileChooser
				JFileChooser choosepdf = new JFileChooser();	
				
				//Creates a filename extension filter
				FileNameExtensionFilter filefilter = new FileNameExtensionFilter("PDF Files","pdf","pct","indd");
				
				//sets filter
				choosepdf.setFileFilter(filefilter);
				
				//Sets starting directory of choosepdf
				choosepdf.setCurrentDirectory(new File(System.getProperty("user.home")));
				
				//This method wont work!!!
				/**
				//Properties of dialog
				pdf.setSize(450,500);
				pdf.getContentPane().add(chooseimage);
				
				pdf.setModal(true);
				pdf.setAlwaysOnTop(true);
				pdf.requestFocus();
				pdf.setVisible(true);
				**/
				
				//Initializes variable containing return value of JFileChooser				
				int selection = choosepdf.showOpenDialog(null);				
			
		        if(selection == JFileChooser.APPROVE_OPTION){
		        	txtpdffilepath.setText(choosepdf.getSelectedFile().getAbsolutePath());
		        	
		          }
		      
		        else if (selection == JFileChooser.CANCEL_OPTION){
		        	//pdf.dispose();
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