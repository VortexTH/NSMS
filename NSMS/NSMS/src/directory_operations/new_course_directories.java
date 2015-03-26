package NSMS.src.directory_operations;
//package directory_operations;

//import directory_operations.new_parent_directory;
import NSMS.src.directory_operations.new_parent_directory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class new_course_directories extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txthl1;
	private JTextField txthl2;
	private JTextField txthl3;
	private JTextField txthl4;
	private JTextField txthl5;
	private JTextField txthl6;
	private JTextField txtsl1;
	private JTextField txtsl2;
	private JTextField txtsl3;
	private JTextField txtsl4;
	private JTextField txtsl5;
	private JTextField txtsl6;

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
		
		JLabel lblHighLevel = new JLabel("Higher Level");
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
			txthl1 = new JTextField();
			txthl1.setBounds(29, 107, 173, 20);
			contentPanel.add(txthl1);
			txthl1.setColumns(10);
		}
		{
			txthl2 = new JTextField();
			txthl2.setBounds(29, 138, 173, 20);
			contentPanel.add(txthl2);
			txthl2.setColumns(10);
		}
		{
			txthl3 = new JTextField();
			txthl3.setBounds(29, 169, 173, 20);
			contentPanel.add(txthl3);
			txthl3.setColumns(10);
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
			txthl4 = new JTextField();
			txthl4.setColumns(10);
			txthl4.setBounds(29, 200, 173, 20);
			contentPanel.add(txthl4);
		}
		{
			txthl5 = new JTextField();
			txthl5.setColumns(10);
			txthl5.setBounds(29, 231, 173, 20);
			contentPanel.add(txthl5);
		}
		{
			txthl6 = new JTextField();
			txthl6.setColumns(10);
			txthl6.setBounds(29, 262, 173, 20);
			contentPanel.add(txthl6);
		}
		{
			txtsl1 = new JTextField();
			txtsl1.setColumns(10);
			txtsl1.setBounds(251, 107, 173, 20);
			contentPanel.add(txtsl1);
		}
		{
			txtsl2 = new JTextField();
			txtsl2.setColumns(10);
			txtsl2.setBounds(251, 138, 173, 20);
			contentPanel.add(txtsl2);
		}
		{
			txtsl3 = new JTextField();
			txtsl3.setColumns(10);
			txtsl3.setBounds(251, 169, 173, 20);
			contentPanel.add(txtsl3);
		}
		{
			txtsl4 = new JTextField();
			txtsl4.setColumns(10);
			txtsl4.setBounds(251, 200, 173, 20);
			contentPanel.add(txtsl4);
		}
		{
			txtsl5 = new JTextField();
			txtsl5.setColumns(10);
			txtsl5.setBounds(251, 231, 173, 20);
			contentPanel.add(txtsl5);
		}
		{
			txtsl6 = new JTextField();
			txtsl6.setColumns(10);
			txtsl6.setBounds(251, 262, 173, 20);
			contentPanel.add(txtsl6);
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
				okButton.addActionListener(new ActionListener() {
					@SuppressWarnings("unused")
					public void actionPerformed(ActionEvent arg0) {
						
						boolean hl1 = false;
						boolean hl2 = false;
						boolean hl3 = false;
						boolean hl4 = false;
						boolean hl5 = false;
						boolean hl6 = false;
						
						boolean sl1 = false;
						boolean sl2 = false;
						boolean sl3 = false;
						boolean sl4 = false;
						boolean sl5 = false;
						boolean sl6 = false;
						
						
						//TODO find mistake here!!!!
						//Accesses parentdir filepath string from new parent dir class
						new_parent_directory parentdirclass = new new_parent_directory();						
						String theoutputpath = parentdirclass.outputpath;						
						
						String parentpath = theoutputpath + "\\" + ".NSMS" + "\\ParentDir";
						
						//accesses general operations class for new_dir method
						general_operations newdir = new general_operations ();
						
						
						        //This checks if fields are filled out
								if (txthl1.getText().length() > 0){
									hl1 = true;
									}
								
								if (txthl2.getText().length() > 0){
									hl2 = true;
									}
								
								if (txthl3.getText().length() > 0){
									hl3 = true;
									}
								
								if (txthl4.getText().length() > 0){
									hl4 = true;
									}
								
								if (txthl5.getText().length() > 0){
									hl5 = true;
									}
								
								if (txthl6.getText().length() > 0){
									hl6 = true;
									}
								
								if (txtsl1.getText().length() > 0){
									sl1 = true;
									}
								
								if (txtsl2.getText().length() > 0){
									sl2 = true;
									}
								
								if (txtsl3.getText().length() > 0){
									sl3 = true;
									}
								
								if (txtsl4.getText().length() > 0){
									sl4 = true;
									}
								
								if (txtsl5.getText().length() > 0){
									sl5 = true;
									}
								
								if (txtsl6.getText().length() > 0){
									sl6 = true;
									}
								
								
								
								//This calls the create_dir class for any filled out fields
								if (hl1 = true){
									String hl1subj = txthl1.getText().toUpperCase() + " HL"; 
									newdir.new_dir(parentpath, hl1subj);
									}
								
								if (hl2 = true){
									String hl2subj = txthl1.getText().toUpperCase() + " HL"; 
									newdir.new_dir(parentpath, hl2subj);
									}
								
								if (hl3 = true){
									String hl3subj = txthl1.getText().toUpperCase() + " HL";
									newdir.new_dir(parentpath, hl3subj);
									}
								
								if (hl4 = true){
									String hl4subj = txthl1.getText().toUpperCase() + " HL";
									newdir.new_dir(parentpath,  hl4subj);
									}
								
								if (hl5 = true){
									String hl5subj = txthl1.getText().toUpperCase() + " HL"; 
									newdir.new_dir(parentpath, hl5subj);
									}
								
								if (hl6 = true){
									String hl6subj = txthl1.getText().toUpperCase() + " HL";
									newdir.new_dir(parentpath, hl6subj);
									}
								
								if (sl1 = true){
									String sl1subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl1subj);
									}
								
								if (sl2 = true){
									String sl2subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl2subj);
									}
								
								if (sl3 = true){
									String sl3subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl3subj);
									}
								
								if (sl4 = true){
									String sl4subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl4subj);
									}
								
								if (sl5 = true){
									String sl5subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl5subj);
									}
								
								if (sl6 = true){
									String sl6subj = txtsl1.getText().toUpperCase() + " SL";
									newdir.new_dir(parentpath, sl6subj);
									}
								
								
								
							JOptionPane.showMessageDialog(null, "Classes have been added!");
							
							dispose();						
						
					}
				});
				okButton.setToolTipText("This will create several child directories that will contain all your material");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						int optionreturn = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the operation?");	
						
						if(optionreturn == JOptionPane.YES_OPTION){
							dispose();
						}
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
