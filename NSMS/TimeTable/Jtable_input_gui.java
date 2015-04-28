package TimeTable;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import sqlcontrol.SQLite_tt_connector;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Jtable_input_gui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtmon1;
	private JTextField txtmon2;
	private JTextField txtmon3;
	private JTextField txtmon4;
	private JTextField txtmon5;
	private JTextField txtmon6;
	private JTextField txtmon7;
	private JTextField txtmon8;
	private JTextField txtmon9;
	private JTextField txttue1;
	private JTextField txttue2;
	private JTextField txttue3;
	private JTextField txttue4;
	private JTextField txttue5;
	private JTextField txttue6;
	private JTextField txttue7;
	private JTextField txttue8;
	private JTextField txttue9;
	private JTextField txtwed1;
	private JTextField txtwed2;
	private JTextField txtwed3;
	private JTextField txtwed4;
	private JTextField txtwed5;
	private JTextField txtwed6;
	private JTextField txtwed7;
	private JTextField txtwed8;
	private JTextField txtwed9;
	private JTextField txtthu1;
	private JTextField txtthu2;
	private JTextField txtthu3;
	private JTextField txtthu4;
	private JTextField txtthu5;
	private JTextField txtthu6;
	private JTextField txtthu7;
	private JTextField txtthu8;
	private JTextField txtthu9;
	private JTextField txtfr1;
	private JTextField txtfr2;
	private JTextField txtfr3;
	private JTextField txtfr4;
	private JTextField txtfr5;
	private JTextField txtfr6;
	private JTextField txtfr7;
	private JTextField txtfr8;
	private JTextField txtfr9;
	private JTextField txtsat1;
	private JTextField txtsat2;
	private JTextField txtsat3;
	private JTextField txtsat4;
	private JTextField txtsat5;
	private JTextField txtsat6;
	private JTextField txtsat7;
	private JTextField txtsat8;
	private JTextField txtsat9;
	private JTextField txtsun1;
	private JTextField txtsun2;
	private JTextField txtsun3;
	private JTextField txtsun4;
	private JTextField txtsun5;
	private JTextField txtsun6;
	private JTextField txtsun7;
	private JTextField txtsun8;
	private JTextField txtsun9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Jtable_input_gui dialog = new Jtable_input_gui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	Connection ttconnection = null;
	
	
	public Jtable_input_gui() {
		setBounds(100, 100, 450, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblEnterYourClasses = new JLabel("Enter Your Classes Below:");
		lblEnterYourClasses.setBounds(10, 11, 351, 14);
		contentPanel.add(lblEnterYourClasses);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 414, 2);
		contentPanel.add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 44, 414, 409);
		contentPanel.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Monday", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPeriod = new JLabel("Period 1");
		lblPeriod.setBounds(10, 11, 46, 14);
		panel.add(lblPeriod);
		
		txtmon1 = new JTextField();
		txtmon1.setBounds(66, 8, 239, 20);
		panel.add(txtmon1);
		txtmon1.setColumns(10);
		
		JButton btnFree = new JButton("Free");
		btnFree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmon1.setText("FREE");
			}
		});
		btnFree.setBounds(310, 7, 89, 23);
		panel.add(btnFree);
		
		JLabel lblPeriod_1 = new JLabel("Period 2");
		lblPeriod_1.setBounds(10, 40, 46, 14);
		panel.add(lblPeriod_1);
		
		txtmon2 = new JTextField();
		txtmon2.setColumns(10);
		txtmon2.setBounds(66, 37, 239, 20);
		panel.add(txtmon2);
		
		JButton button = new JButton("Free");
		button.setBounds(310, 36, 89, 23);
		panel.add(button);
		
		JLabel lblPeriod_2 = new JLabel("Period 3");
		lblPeriod_2.setBounds(10, 69, 46, 14);
		panel.add(lblPeriod_2);
		
		txtmon3 = new JTextField();
		txtmon3.setColumns(10);
		txtmon3.setBounds(66, 66, 239, 20);
		panel.add(txtmon3);
		
		JButton button_1 = new JButton("Free");
		button_1.setBounds(310, 65, 89, 23);
		panel.add(button_1);
		
		JLabel lblPeriod_3 = new JLabel("Period 4");
		lblPeriod_3.setBounds(10, 98, 46, 14);
		panel.add(lblPeriod_3);
		
		txtmon4 = new JTextField();
		txtmon4.setColumns(10);
		txtmon4.setBounds(66, 95, 239, 20);
		panel.add(txtmon4);
		
		JButton button_2 = new JButton("Free");
		button_2.setBounds(310, 94, 89, 23);
		panel.add(button_2);
		
		JLabel lblPeriod_4 = new JLabel("Period 5");
		lblPeriod_4.setBounds(10, 127, 46, 14);
		panel.add(lblPeriod_4);
		
		txtmon5 = new JTextField();
		txtmon5.setColumns(10);
		txtmon5.setBounds(66, 124, 239, 20);
		panel.add(txtmon5);
		
		JButton button_3 = new JButton("Free");
		button_3.setBounds(310, 123, 89, 23);
		panel.add(button_3);
		
		JLabel lblPeriod_5 = new JLabel("Period 6");
		lblPeriod_5.setBounds(10, 156, 46, 14);
		panel.add(lblPeriod_5);
		
		txtmon6 = new JTextField();
		txtmon6.setColumns(10);
		txtmon6.setBounds(66, 153, 239, 20);
		panel.add(txtmon6);
		
		JButton button_4 = new JButton("Free");
		button_4.setBounds(310, 152, 89, 23);
		panel.add(button_4);
		
		JLabel lblPeriod_6 = new JLabel("Period 7");
		lblPeriod_6.setBounds(10, 185, 46, 14);
		panel.add(lblPeriod_6);
		
		txtmon7 = new JTextField();
		txtmon7.setColumns(10);
		txtmon7.setBounds(66, 182, 239, 20);
		panel.add(txtmon7);
		
		JButton button_5 = new JButton("Free");
		button_5.setBounds(310, 181, 89, 23);
		panel.add(button_5);
		
		JLabel lblPeriod_7 = new JLabel("Period 8");
		lblPeriod_7.setBounds(10, 214, 46, 14);
		panel.add(lblPeriod_7);
		
		txtmon8 = new JTextField();
		txtmon8.setColumns(10);
		txtmon8.setBounds(66, 211, 239, 20);
		panel.add(txtmon8);
		
		JButton button_6 = new JButton("Free");
		button_6.setBounds(310, 210, 89, 23);
		panel.add(button_6);
		
		JLabel lblPeriod_8 = new JLabel("Period 9");
		lblPeriod_8.setBounds(10, 243, 46, 14);
		panel.add(lblPeriod_8);
		
		txtmon9 = new JTextField();
		txtmon9.setColumns(10);
		txtmon9.setBounds(66, 240, 239, 20);
		panel.add(txtmon9);
		
		JButton button_7 = new JButton("Free");
		button_7.setBounds(310, 239, 89, 23);
		panel.add(button_7);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tuesday", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 409, 381);
		panel_1.add(panel_7);
		
		JLabel label = new JLabel("Period 1");
		label.setBounds(10, 11, 46, 14);
		panel_7.add(label);
		
		txttue1 = new JTextField();
		txttue1.setColumns(10);
		txttue1.setBounds(66, 8, 239, 20);
		panel_7.add(txttue1);
		
		JButton button_8 = new JButton("Free");
		button_8.setBounds(310, 7, 89, 23);
		panel_7.add(button_8);
		
		JLabel label_1 = new JLabel("Period 2");
		label_1.setBounds(10, 40, 46, 14);
		panel_7.add(label_1);
		
		txttue2 = new JTextField();
		txttue2.setColumns(10);
		txttue2.setBounds(66, 37, 239, 20);
		panel_7.add(txttue2);
		
		JButton button_9 = new JButton("Free");
		button_9.setBounds(310, 36, 89, 23);
		panel_7.add(button_9);
		
		JLabel label_2 = new JLabel("Period 3");
		label_2.setBounds(10, 69, 46, 14);
		panel_7.add(label_2);
		
		txttue3 = new JTextField();
		txttue3.setColumns(10);
		txttue3.setBounds(66, 66, 239, 20);
		panel_7.add(txttue3);
		
		JButton button_10 = new JButton("Free");
		button_10.setBounds(310, 65, 89, 23);
		panel_7.add(button_10);
		
		JLabel label_3 = new JLabel("Period 4");
		label_3.setBounds(10, 98, 46, 14);
		panel_7.add(label_3);
		
		txttue4 = new JTextField();
		txttue4.setColumns(10);
		txttue4.setBounds(66, 95, 239, 20);
		panel_7.add(txttue4);
		
		JButton button_11 = new JButton("Free");
		button_11.setBounds(310, 94, 89, 23);
		panel_7.add(button_11);
		
		JLabel label_4 = new JLabel("Period 5");
		label_4.setBounds(10, 127, 46, 14);
		panel_7.add(label_4);
		
		txttue5 = new JTextField();
		txttue5.setColumns(10);
		txttue5.setBounds(66, 124, 239, 20);
		panel_7.add(txttue5);
		
		JButton button_12 = new JButton("Free");
		button_12.setBounds(310, 123, 89, 23);
		panel_7.add(button_12);
		
		JLabel label_5 = new JLabel("Period 6");
		label_5.setBounds(10, 156, 46, 14);
		panel_7.add(label_5);
		
		txttue6 = new JTextField();
		txttue6.setColumns(10);
		txttue6.setBounds(66, 153, 239, 20);
		panel_7.add(txttue6);
		
		JButton button_13 = new JButton("Free");
		button_13.setBounds(310, 152, 89, 23);
		panel_7.add(button_13);
		
		JLabel label_6 = new JLabel("Period 7");
		label_6.setBounds(10, 185, 46, 14);
		panel_7.add(label_6);
		
		txttue7 = new JTextField();
		txttue7.setColumns(10);
		txttue7.setBounds(66, 182, 239, 20);
		panel_7.add(txttue7);
		
		JButton button_14 = new JButton("Free");
		button_14.setBounds(310, 181, 89, 23);
		panel_7.add(button_14);
		
		JLabel label_7 = new JLabel("Period 8");
		label_7.setBounds(10, 214, 46, 14);
		panel_7.add(label_7);
		
		txttue8 = new JTextField();
		txttue8.setColumns(10);
		txttue8.setBounds(66, 211, 239, 20);
		panel_7.add(txttue8);
		
		JButton button_15 = new JButton("Free");
		button_15.setBounds(310, 210, 89, 23);
		panel_7.add(button_15);
		
		JLabel label_8 = new JLabel("Period 9");
		label_8.setBounds(10, 243, 46, 14);
		panel_7.add(label_8);
		
		txttue9 = new JTextField();
		txttue9.setColumns(10);
		txttue9.setBounds(66, 240, 239, 20);
		panel_7.add(txttue9);
		
		JButton button_16 = new JButton("Free");
		button_16.setBounds(310, 239, 89, 23);
		panel_7.add(button_16);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Wednesday", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 409, 381);
		panel_2.add(panel_8);
		
		JLabel label_9 = new JLabel("Period 1");
		label_9.setBounds(10, 11, 46, 14);
		panel_8.add(label_9);
		
		txtwed1 = new JTextField();
		txtwed1.setColumns(10);
		txtwed1.setBounds(66, 8, 239, 20);
		panel_8.add(txtwed1);
		
		JButton button_17 = new JButton("Free");
		button_17.setBounds(310, 7, 89, 23);
		panel_8.add(button_17);
		
		JLabel label_10 = new JLabel("Period 2");
		label_10.setBounds(10, 40, 46, 14);
		panel_8.add(label_10);
		
		txtwed2 = new JTextField();
		txtwed2.setColumns(10);
		txtwed2.setBounds(66, 37, 239, 20);
		panel_8.add(txtwed2);
		
		JButton button_18 = new JButton("Free");
		button_18.setBounds(310, 36, 89, 23);
		panel_8.add(button_18);
		
		JLabel label_11 = new JLabel("Period 3");
		label_11.setBounds(10, 69, 46, 14);
		panel_8.add(label_11);
		
		txtwed3 = new JTextField();
		txtwed3.setColumns(10);
		txtwed3.setBounds(66, 66, 239, 20);
		panel_8.add(txtwed3);
		
		JButton button_19 = new JButton("Free");
		button_19.setBounds(310, 65, 89, 23);
		panel_8.add(button_19);
		
		JLabel label_12 = new JLabel("Period 4");
		label_12.setBounds(10, 98, 46, 14);
		panel_8.add(label_12);
		
		txtwed4 = new JTextField();
		txtwed4.setColumns(10);
		txtwed4.setBounds(66, 95, 239, 20);
		panel_8.add(txtwed4);
		
		JButton button_20 = new JButton("Free");
		button_20.setBounds(310, 94, 89, 23);
		panel_8.add(button_20);
		
		JLabel label_13 = new JLabel("Period 5");
		label_13.setBounds(10, 127, 46, 14);
		panel_8.add(label_13);
		
		txtwed5 = new JTextField();
		txtwed5.setColumns(10);
		txtwed5.setBounds(66, 124, 239, 20);
		panel_8.add(txtwed5);
		
		JButton button_21 = new JButton("Free");
		button_21.setBounds(310, 123, 89, 23);
		panel_8.add(button_21);
		
		JLabel label_14 = new JLabel("Period 6");
		label_14.setBounds(10, 156, 46, 14);
		panel_8.add(label_14);
		
		txtwed6 = new JTextField();
		txtwed6.setColumns(10);
		txtwed6.setBounds(66, 153, 239, 20);
		panel_8.add(txtwed6);
		
		JButton button_22 = new JButton("Free");
		button_22.setBounds(310, 152, 89, 23);
		panel_8.add(button_22);
		
		JLabel label_15 = new JLabel("Period 7");
		label_15.setBounds(10, 185, 46, 14);
		panel_8.add(label_15);
		
		txtwed7 = new JTextField();
		txtwed7.setColumns(10);
		txtwed7.setBounds(66, 182, 239, 20);
		panel_8.add(txtwed7);
		
		JButton button_23 = new JButton("Free");
		button_23.setBounds(310, 181, 89, 23);
		panel_8.add(button_23);
		
		JLabel label_16 = new JLabel("Period 8");
		label_16.setBounds(10, 214, 46, 14);
		panel_8.add(label_16);
		
		txtwed8 = new JTextField();
		txtwed8.setColumns(10);
		txtwed8.setBounds(66, 211, 239, 20);
		panel_8.add(txtwed8);
		
		JButton button_24 = new JButton("Free");
		button_24.setBounds(310, 210, 89, 23);
		panel_8.add(button_24);
		
		JLabel label_17 = new JLabel("Period 9");
		label_17.setBounds(10, 243, 46, 14);
		panel_8.add(label_17);
		
		txtwed9 = new JTextField();
		txtwed9.setColumns(10);
		txtwed9.setBounds(66, 240, 239, 20);
		panel_8.add(txtwed9);
		
		JButton button_25 = new JButton("Free");
		button_25.setBounds(310, 239, 89, 23);
		panel_8.add(button_25);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Thursday", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 409, 381);
		panel_3.add(panel_9);
		
		JLabel label_18 = new JLabel("Period 1");
		label_18.setBounds(10, 11, 46, 14);
		panel_9.add(label_18);
		
		txtthu1 = new JTextField();
		txtthu1.setColumns(10);
		txtthu1.setBounds(66, 8, 239, 20);
		panel_9.add(txtthu1);
		
		JButton button_26 = new JButton("Free");
		button_26.setBounds(310, 7, 89, 23);
		panel_9.add(button_26);
		
		JLabel label_19 = new JLabel("Period 2");
		label_19.setBounds(10, 40, 46, 14);
		panel_9.add(label_19);
		
		txtthu2 = new JTextField();
		txtthu2.setColumns(10);
		txtthu2.setBounds(66, 37, 239, 20);
		panel_9.add(txtthu2);
		
		JButton button_27 = new JButton("Free");
		button_27.setBounds(310, 36, 89, 23);
		panel_9.add(button_27);
		
		JLabel label_20 = new JLabel("Period 3");
		label_20.setBounds(10, 69, 46, 14);
		panel_9.add(label_20);
		
		txtthu3 = new JTextField();
		txtthu3.setColumns(10);
		txtthu3.setBounds(66, 66, 239, 20);
		panel_9.add(txtthu3);
		
		JButton button_28 = new JButton("Free");
		button_28.setBounds(310, 65, 89, 23);
		panel_9.add(button_28);
		
		JLabel label_21 = new JLabel("Period 4");
		label_21.setBounds(10, 98, 46, 14);
		panel_9.add(label_21);
		
		txtthu4 = new JTextField();
		txtthu4.setColumns(10);
		txtthu4.setBounds(66, 95, 239, 20);
		panel_9.add(txtthu4);
		
		JButton button_29 = new JButton("Free");
		button_29.setBounds(310, 94, 89, 23);
		panel_9.add(button_29);
		
		JLabel label_22 = new JLabel("Period 5");
		label_22.setBounds(10, 127, 46, 14);
		panel_9.add(label_22);
		
		txtthu5 = new JTextField();
		txtthu5.setColumns(10);
		txtthu5.setBounds(66, 124, 239, 20);
		panel_9.add(txtthu5);
		
		JButton button_30 = new JButton("Free");
		button_30.setBounds(310, 123, 89, 23);
		panel_9.add(button_30);
		
		JLabel label_23 = new JLabel("Period 6");
		label_23.setBounds(10, 156, 46, 14);
		panel_9.add(label_23);
		
		txtthu6 = new JTextField();
		txtthu6.setColumns(10);
		txtthu6.setBounds(66, 153, 239, 20);
		panel_9.add(txtthu6);
		
		JButton button_31 = new JButton("Free");
		button_31.setBounds(310, 152, 89, 23);
		panel_9.add(button_31);
		
		JLabel label_24 = new JLabel("Period 7");
		label_24.setBounds(10, 185, 46, 14);
		panel_9.add(label_24);
		
		txtthu7 = new JTextField();
		txtthu7.setColumns(10);
		txtthu7.setBounds(66, 182, 239, 20);
		panel_9.add(txtthu7);
		
		JButton button_32 = new JButton("Free");
		button_32.setBounds(310, 181, 89, 23);
		panel_9.add(button_32);
		
		JLabel label_25 = new JLabel("Period 8");
		label_25.setBounds(10, 214, 46, 14);
		panel_9.add(label_25);
		
		txtthu8 = new JTextField();
		txtthu8.setColumns(10);
		txtthu8.setBounds(66, 211, 239, 20);
		panel_9.add(txtthu8);
		
		JButton button_33 = new JButton("Free");
		button_33.setBounds(310, 210, 89, 23);
		panel_9.add(button_33);
		
		JLabel label_26 = new JLabel("Period 9");
		label_26.setBounds(10, 243, 46, 14);
		panel_9.add(label_26);
		
		txtthu9 = new JTextField();
		txtthu9.setColumns(10);
		txtthu9.setBounds(66, 240, 239, 20);
		panel_9.add(txtthu9);
		
		JButton button_34 = new JButton("Free");
		button_34.setBounds(310, 239, 89, 23);
		panel_9.add(button_34);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Friday", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, 409, 381);
		panel_4.add(panel_10);
		
		JLabel label_27 = new JLabel("Period 1");
		label_27.setBounds(10, 11, 46, 14);
		panel_10.add(label_27);
		
		txtfr1 = new JTextField();
		txtfr1.setColumns(10);
		txtfr1.setBounds(66, 8, 239, 20);
		panel_10.add(txtfr1);
		
		JButton button_35 = new JButton("Free");
		button_35.setBounds(310, 7, 89, 23);
		panel_10.add(button_35);
		
		JLabel label_28 = new JLabel("Period 2");
		label_28.setBounds(10, 40, 46, 14);
		panel_10.add(label_28);
		
		txtfr2 = new JTextField();
		txtfr2.setColumns(10);
		txtfr2.setBounds(66, 37, 239, 20);
		panel_10.add(txtfr2);
		
		JButton button_36 = new JButton("Free");
		button_36.setBounds(310, 36, 89, 23);
		panel_10.add(button_36);
		
		JLabel label_29 = new JLabel("Period 3");
		label_29.setBounds(10, 69, 46, 14);
		panel_10.add(label_29);
		
		txtfr3 = new JTextField();
		txtfr3.setColumns(10);
		txtfr3.setBounds(66, 66, 239, 20);
		panel_10.add(txtfr3);
		
		JButton button_37 = new JButton("Free");
		button_37.setBounds(310, 65, 89, 23);
		panel_10.add(button_37);
		
		JLabel label_30 = new JLabel("Period 4");
		label_30.setBounds(10, 98, 46, 14);
		panel_10.add(label_30);
		
		txtfr4 = new JTextField();
		txtfr4.setColumns(10);
		txtfr4.setBounds(66, 95, 239, 20);
		panel_10.add(txtfr4);
		
		JButton button_38 = new JButton("Free");
		button_38.setBounds(310, 94, 89, 23);
		panel_10.add(button_38);
		
		JLabel label_31 = new JLabel("Period 5");
		label_31.setBounds(10, 127, 46, 14);
		panel_10.add(label_31);
		
		txtfr5 = new JTextField();
		txtfr5.setColumns(10);
		txtfr5.setBounds(66, 124, 239, 20);
		panel_10.add(txtfr5);
		
		JButton button_39 = new JButton("Free");
		button_39.setBounds(310, 123, 89, 23);
		panel_10.add(button_39);
		
		JLabel label_32 = new JLabel("Period 6");
		label_32.setBounds(10, 156, 46, 14);
		panel_10.add(label_32);
		
		txtfr6 = new JTextField();
		txtfr6.setColumns(10);
		txtfr6.setBounds(66, 153, 239, 20);
		panel_10.add(txtfr6);
		
		JButton button_40 = new JButton("Free");
		button_40.setBounds(310, 152, 89, 23);
		panel_10.add(button_40);
		
		JLabel label_33 = new JLabel("Period 7");
		label_33.setBounds(10, 185, 46, 14);
		panel_10.add(label_33);
		
		txtfr7 = new JTextField();
		txtfr7.setColumns(10);
		txtfr7.setBounds(66, 182, 239, 20);
		panel_10.add(txtfr7);
		
		JButton button_41 = new JButton("Free");
		button_41.setBounds(310, 181, 89, 23);
		panel_10.add(button_41);
		
		JLabel label_34 = new JLabel("Period 8");
		label_34.setBounds(10, 214, 46, 14);
		panel_10.add(label_34);
		
		txtfr8 = new JTextField();
		txtfr8.setColumns(10);
		txtfr8.setBounds(66, 211, 239, 20);
		panel_10.add(txtfr8);
		
		JButton button_42 = new JButton("Free");
		button_42.setBounds(310, 210, 89, 23);
		panel_10.add(button_42);
		
		JLabel label_35 = new JLabel("Period 9");
		label_35.setBounds(10, 243, 46, 14);
		panel_10.add(label_35);
		
		txtfr9 = new JTextField();
		txtfr9.setColumns(10);
		txtfr9.setBounds(66, 240, 239, 20);
		panel_10.add(txtfr9);
		
		JButton button_43 = new JButton("Free");
		button_43.setBounds(310, 239, 89, 23);
		panel_10.add(button_43);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Saturday", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 409, 381);
		panel_5.add(panel_11);
		
		JLabel label_36 = new JLabel("Period 1");
		label_36.setBounds(10, 11, 46, 14);
		panel_11.add(label_36);
		
		txtsat1 = new JTextField();
		txtsat1.setColumns(10);
		txtsat1.setBounds(66, 8, 239, 20);
		panel_11.add(txtsat1);
		
		JButton button_44 = new JButton("Free");
		button_44.setBounds(310, 7, 89, 23);
		panel_11.add(button_44);
		
		JLabel label_37 = new JLabel("Period 2");
		label_37.setBounds(10, 40, 46, 14);
		panel_11.add(label_37);
		
		txtsat2 = new JTextField();
		txtsat2.setColumns(10);
		txtsat2.setBounds(66, 37, 239, 20);
		panel_11.add(txtsat2);
		
		JButton button_45 = new JButton("Free");
		button_45.setBounds(310, 36, 89, 23);
		panel_11.add(button_45);
		
		JLabel label_38 = new JLabel("Period 3");
		label_38.setBounds(10, 69, 46, 14);
		panel_11.add(label_38);
		
		txtsat3 = new JTextField();
		txtsat3.setColumns(10);
		txtsat3.setBounds(66, 66, 239, 20);
		panel_11.add(txtsat3);
		
		JButton button_46 = new JButton("Free");
		button_46.setBounds(310, 65, 89, 23);
		panel_11.add(button_46);
		
		JLabel label_39 = new JLabel("Period 4");
		label_39.setBounds(10, 98, 46, 14);
		panel_11.add(label_39);
		
		txtsat4 = new JTextField();
		txtsat4.setColumns(10);
		txtsat4.setBounds(66, 95, 239, 20);
		panel_11.add(txtsat4);
		
		JButton button_47 = new JButton("Free");
		button_47.setBounds(310, 94, 89, 23);
		panel_11.add(button_47);
		
		JLabel label_40 = new JLabel("Period 5");
		label_40.setBounds(10, 127, 46, 14);
		panel_11.add(label_40);
		
		txtsat5 = new JTextField();
		txtsat5.setColumns(10);
		txtsat5.setBounds(66, 124, 239, 20);
		panel_11.add(txtsat5);
		
		JButton button_48 = new JButton("Free");
		button_48.setBounds(310, 123, 89, 23);
		panel_11.add(button_48);
		
		JLabel label_41 = new JLabel("Period 6");
		label_41.setBounds(10, 156, 46, 14);
		panel_11.add(label_41);
		
		txtsat6 = new JTextField();
		txtsat6.setColumns(10);
		txtsat6.setBounds(66, 153, 239, 20);
		panel_11.add(txtsat6);
		
		JButton button_49 = new JButton("Free");
		button_49.setBounds(310, 152, 89, 23);
		panel_11.add(button_49);
		
		JLabel label_42 = new JLabel("Period 7");
		label_42.setBounds(10, 185, 46, 14);
		panel_11.add(label_42);
		
		txtsat7 = new JTextField();
		txtsat7.setColumns(10);
		txtsat7.setBounds(66, 182, 239, 20);
		panel_11.add(txtsat7);
		
		JButton button_50 = new JButton("Free");
		button_50.setBounds(310, 181, 89, 23);
		panel_11.add(button_50);
		
		JLabel label_43 = new JLabel("Period 8");
		label_43.setBounds(10, 214, 46, 14);
		panel_11.add(label_43);
		
		txtsat8 = new JTextField();
		txtsat8.setColumns(10);
		txtsat8.setBounds(66, 211, 239, 20);
		panel_11.add(txtsat8);
		
		JButton button_51 = new JButton("Free");
		button_51.setBounds(310, 210, 89, 23);
		panel_11.add(button_51);
		
		JLabel label_44 = new JLabel("Period 9");
		label_44.setBounds(10, 243, 46, 14);
		panel_11.add(label_44);
		
		txtsat9 = new JTextField();
		txtsat9.setColumns(10);
		txtsat9.setBounds(66, 240, 239, 20);
		panel_11.add(txtsat9);
		
		JButton button_52 = new JButton("Free");
		button_52.setBounds(310, 239, 89, 23);
		panel_11.add(button_52);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Sunday", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 409, 381);
		panel_6.add(panel_12);
		
		JLabel label_45 = new JLabel("Period 1");
		label_45.setBounds(10, 11, 46, 14);
		panel_12.add(label_45);
		
		txtsun1 = new JTextField();
		txtsun1.setColumns(10);
		txtsun1.setBounds(66, 8, 239, 20);
		panel_12.add(txtsun1);
		
		JButton button_53 = new JButton("Free");
		button_53.setBounds(310, 7, 89, 23);
		panel_12.add(button_53);
		
		JLabel label_46 = new JLabel("Period 2");
		label_46.setBounds(10, 40, 46, 14);
		panel_12.add(label_46);
		
		txtsun2 = new JTextField();
		txtsun2.setColumns(10);
		txtsun2.setBounds(66, 37, 239, 20);
		panel_12.add(txtsun2);
		
		JButton button_54 = new JButton("Free");
		button_54.setBounds(310, 36, 89, 23);
		panel_12.add(button_54);
		
		JLabel label_47 = new JLabel("Period 3");
		label_47.setBounds(10, 69, 46, 14);
		panel_12.add(label_47);
		
		txtsun3 = new JTextField();
		txtsun3.setColumns(10);
		txtsun3.setBounds(66, 66, 239, 20);
		panel_12.add(txtsun3);
		
		JButton button_55 = new JButton("Free");
		button_55.setBounds(310, 65, 89, 23);
		panel_12.add(button_55);
		
		JLabel label_48 = new JLabel("Period 4");
		label_48.setBounds(10, 98, 46, 14);
		panel_12.add(label_48);
		
		txtsun4 = new JTextField();
		txtsun4.setColumns(10);
		txtsun4.setBounds(66, 95, 239, 20);
		panel_12.add(txtsun4);
		
		JButton button_56 = new JButton("Free");
		button_56.setBounds(310, 94, 89, 23);
		panel_12.add(button_56);
		
		JLabel label_49 = new JLabel("Period 5");
		label_49.setBounds(10, 127, 46, 14);
		panel_12.add(label_49);
		
		txtsun5 = new JTextField();
		txtsun5.setColumns(10);
		txtsun5.setBounds(66, 124, 239, 20);
		panel_12.add(txtsun5);
		
		JButton button_57 = new JButton("Free");
		button_57.setBounds(310, 123, 89, 23);
		panel_12.add(button_57);
		
		JLabel label_50 = new JLabel("Period 6");
		label_50.setBounds(10, 156, 46, 14);
		panel_12.add(label_50);
		
		txtsun6 = new JTextField();
		txtsun6.setColumns(10);
		txtsun6.setBounds(66, 153, 239, 20);
		panel_12.add(txtsun6);
		
		JButton button_58 = new JButton("Free");
		button_58.setBounds(310, 152, 89, 23);
		panel_12.add(button_58);
		
		JLabel label_51 = new JLabel("Period 7");
		label_51.setBounds(10, 185, 46, 14);
		panel_12.add(label_51);
		
		txtsun7 = new JTextField();
		txtsun7.setColumns(10);
		txtsun7.setBounds(66, 182, 239, 20);
		panel_12.add(txtsun7);
		
		JButton button_59 = new JButton("Free");
		button_59.setBounds(310, 181, 89, 23);
		panel_12.add(button_59);
		
		JLabel label_52 = new JLabel("Period 8");
		label_52.setBounds(10, 214, 46, 14);
		panel_12.add(label_52);
		
		txtsun8 = new JTextField();
		txtsun8.setColumns(10);
		txtsun8.setBounds(66, 211, 239, 20);
		panel_12.add(txtsun8);
		
		JButton button_60 = new JButton("Free");
		button_60.setBounds(310, 210, 89, 23);
		panel_12.add(button_60);
		
		JLabel label_53 = new JLabel("Period 9");
		label_53.setBounds(10, 243, 46, 14);
		panel_12.add(label_53);
		
		txtsun9 = new JTextField();
		txtsun9.setColumns(10);
		txtsun9.setBounds(66, 240, 239, 20);
		panel_12.add(txtsun9);
		
		//opens connection to proprietary SQLite db
		ttconnection = SQLite_tt_connector.ttdb_connection();
		
		JButton button_61 = new JButton("Free");
		button_61.setBounds(310, 239, 89, 23);
		panel_12.add(button_61);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//Monday
						String mon1 = txtmon1.getText();
						String mon2 = txtmon2.getText();
						String mon3 = txtmon3.getText();
						String mon4 = txtmon4.getText();
						String mon5 = txtmon5.getText();
						String mon6 = txtmon6.getText();
						String mon7 = txtmon7.getText();
						String mon8 = txtmon8.getText();
						String mon9 = txtmon9.getText();
						
						//Tuesday
						String tue1 = txttue1.getText();
						String tue2 = txttue2.getText();
						String tue3 = txttue3.getText();
						String tue4 = txttue4.getText();
						String tue5 = txttue5.getText();
						String tue6 = txttue6.getText();
						String tue7 = txttue7.getText();
						String tue8 = txttue8.getText();
						String tue9 = txttue9.getText();
						
						//Wednesday
						String wed1 = txtwed1.getText();
						String wed2 = txtwed2.getText();
						String wed3 = txtwed3.getText();
						String wed4 = txtwed4.getText();
						String wed5 = txtwed5.getText();
						String wed6 = txtwed6.getText();
						String wed7 = txtwed7.getText();
						String wed8 = txtwed8.getText();
						String wed9 = txtwed9.getText();
						
						//Thursday
						String thu1 = txtthu1.getText();
						String thu2 = txtthu2.getText();
						String thu3 = txtthu3.getText();
						String thu4 = txtthu4.getText();
						String thu5 = txtthu5.getText();
						String thu6 = txtthu6.getText();
						String thu7 = txtthu7.getText();
						String thu8 = txtthu8.getText();
						String thu9 = txtthu9.getText();
						
						//Friday
						String fr1 = txtfr1.getText();
						String fr2 = txtfr2.getText();
						String fr3 = txtfr3.getText();
						String fr4 = txtfr4.getText();
						String fr5 = txtfr5.getText();
						String fr6 = txtfr6.getText();
						String fr7 = txtfr7.getText();
						String fr8 = txtfr8.getText();
						String fr9 = txtfr9.getText();
						
						//Saturday
						String sat1 = txtsat1.getText();
						String sat2 = txtsat2.getText();
						String sat3 = txtsat3.getText();
						String sat4 = txtsat4.getText();
						String sat5 = txtsat5.getText();
						String sat6 = txtsat6.getText();
						String sat7 = txtsat7.getText();
						String sat8 = txtsat8.getText();
						String sat9 = txtsat9.getText();
						
						//Sunday
						String sun1 = txtsun1.getText();
						String sun2 = txtsun2.getText();
						String sun3 = txtsun3.getText();
						String sun4 = txtsun4.getText();
						String sun5 = txtsun5.getText();
						String sun6 = txtsun6.getText();
						String sun7 = txtsun7.getText();
						String sun8 = txtsun8.getText();
						String sun9 = txtsun9.getText();
						
					try{
						
						String queryadd = "insert into TimeTable (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday) values (?,?,?,?,?,?,?) "; //adds entries to sqlite table for timetable info!
		    			PreparedStatement pst_add = ttconnection.prepareStatement(queryadd);
		    			
		    			
		    			
		    			
		    			int day;
		    			int period;
		    			int d;
		    			int p;
		    			String mon;
		    			String tue;
		    			String wed;
		    			String thu;
		    			String fr;
		    			String sat;
		    			String sun;
		    			
		    			for (period = 1; period < 10; period ++){
		    				
		    				p = period;		    			
		    			  
		    			      for (day = 1; day < 8; day++){		    				    
		    			    	//TODO think of something real intelligent to get this shit to work.... (creates appropriate String and adds it to the prepared statement)		    			    			    	
		    			    	pst_add.setString(1, mon);
		  		    			pst_add.setString(2, tue);
		  		    			pst_add.setString(3, wed);
		  		    			pst_add.setString(4, thu);
		  		    			pst_add.setString(5, fr);
		  		    			pst_add.setString(6, sat);
		  		    			pst_add.setString(7, sun);		    			   
		    			      }
		    			      
		    			   //Executes prepared Statement
		    			   pst_add.execute();
		    			      
		    			}	
		    		
		    			JOptionPane.showMessageDialog(null, "Data saved!");   
		    			
		    			dispose();
		    			
		    		    pst_add.close();
						
					}
				catch (Exception g){
					JOptionPane.showMessageDialog(null, g);
				}
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {						
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
