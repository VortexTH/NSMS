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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import sqlcontrol.SQLite_tt_connector;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class update_tt extends JDialog {

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
			update_tt dialog = new update_tt();
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
	
	
	public update_tt() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setBounds(100, 100, 450, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblEnterYourClasses = new JLabel("Edit Your Classes Below. For a Free period, enter FREE:");
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
		txtmon1.setBounds(66, 8, 333, 20);
		panel.add(txtmon1);
		txtmon1.setColumns(10);
		
		JLabel lblPeriod_1 = new JLabel("Period 2");
		lblPeriod_1.setBounds(10, 40, 46, 14);
		panel.add(lblPeriod_1);
		
		txtmon2 = new JTextField();
		txtmon2.setColumns(10);
		txtmon2.setBounds(66, 37, 333, 20);
		panel.add(txtmon2);
		
		JLabel lblPeriod_2 = new JLabel("Period 3");
		lblPeriod_2.setBounds(10, 69, 46, 14);
		panel.add(lblPeriod_2);
		
		txtmon3 = new JTextField();
		txtmon3.setColumns(10);
		txtmon3.setBounds(66, 66, 333, 20);
		panel.add(txtmon3);
		
		JLabel lblPeriod_3 = new JLabel("Period 4");
		lblPeriod_3.setBounds(10, 98, 46, 14);
		panel.add(lblPeriod_3);
		
		txtmon4 = new JTextField();
		txtmon4.setColumns(10);
		txtmon4.setBounds(66, 95, 333, 20);
		panel.add(txtmon4);
		
		JLabel lblPeriod_4 = new JLabel("Period 5");
		lblPeriod_4.setBounds(10, 127, 46, 14);
		panel.add(lblPeriod_4);
		
		txtmon5 = new JTextField();
		txtmon5.setColumns(10);
		txtmon5.setBounds(66, 124, 333, 20);
		panel.add(txtmon5);
		
		JLabel lblPeriod_5 = new JLabel("Period 6");
		lblPeriod_5.setBounds(10, 156, 46, 14);
		panel.add(lblPeriod_5);
		
		txtmon6 = new JTextField();
		txtmon6.setColumns(10);
		txtmon6.setBounds(66, 153, 333, 20);
		panel.add(txtmon6);
		
		JLabel lblPeriod_6 = new JLabel("Period 7");
		lblPeriod_6.setBounds(10, 185, 46, 14);
		panel.add(lblPeriod_6);
		
		txtmon7 = new JTextField();
		txtmon7.setColumns(10);
		txtmon7.setBounds(66, 182, 333, 20);
		panel.add(txtmon7);
		
		JLabel lblPeriod_7 = new JLabel("Period 8");
		lblPeriod_7.setBounds(10, 214, 46, 14);
		panel.add(lblPeriod_7);
		
		txtmon8 = new JTextField();
		txtmon8.setColumns(10);
		txtmon8.setBounds(66, 211, 333, 20);
		panel.add(txtmon8);
		
		JLabel lblPeriod_8 = new JLabel("Period 9");
		lblPeriod_8.setBounds(10, 243, 46, 14);
		panel.add(lblPeriod_8);
		
		txtmon9 = new JTextField();
		txtmon9.setColumns(10);
		txtmon9.setBounds(66, 240, 333, 20);
		panel.add(txtmon9);
		
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
		txttue1.setBounds(66, 8, 333, 20);
		panel_7.add(txttue1);
		
		JLabel label_1 = new JLabel("Period 2");
		label_1.setBounds(10, 40, 46, 14);
		panel_7.add(label_1);
		
		txttue2 = new JTextField();
		txttue2.setColumns(10);
		txttue2.setBounds(66, 37, 333, 20);
		panel_7.add(txttue2);
		
		JLabel label_2 = new JLabel("Period 3");
		label_2.setBounds(10, 69, 46, 14);
		panel_7.add(label_2);
		
		txttue3 = new JTextField();
		txttue3.setColumns(10);
		txttue3.setBounds(66, 66, 333, 20);
		panel_7.add(txttue3);
		
		JLabel label_3 = new JLabel("Period 4");
		label_3.setBounds(10, 98, 46, 14);
		panel_7.add(label_3);
		
		txttue4 = new JTextField();
		txttue4.setColumns(10);
		txttue4.setBounds(66, 95, 333, 20);
		panel_7.add(txttue4);
		
		JLabel label_4 = new JLabel("Period 5");
		label_4.setBounds(10, 127, 46, 14);
		panel_7.add(label_4);
		
		txttue5 = new JTextField();
		txttue5.setColumns(10);
		txttue5.setBounds(66, 124, 333, 20);
		panel_7.add(txttue5);
		
		JLabel label_5 = new JLabel("Period 6");
		label_5.setBounds(10, 156, 46, 14);
		panel_7.add(label_5);
		
		txttue6 = new JTextField();
		txttue6.setColumns(10);
		txttue6.setBounds(66, 153, 333, 20);
		panel_7.add(txttue6);
		
		JLabel label_6 = new JLabel("Period 7");
		label_6.setBounds(10, 185, 46, 14);
		panel_7.add(label_6);
		
		txttue7 = new JTextField();
		txttue7.setColumns(10);
		txttue7.setBounds(66, 182, 333, 20);
		panel_7.add(txttue7);
		
		JLabel label_7 = new JLabel("Period 8");
		label_7.setBounds(10, 214, 46, 14);
		panel_7.add(label_7);
		
		txttue8 = new JTextField();
		txttue8.setColumns(10);
		txttue8.setBounds(66, 211, 333, 20);
		panel_7.add(txttue8);
		
		JLabel label_8 = new JLabel("Period 9");
		label_8.setBounds(10, 243, 46, 14);
		panel_7.add(label_8);
		
		txttue9 = new JTextField();
		txttue9.setColumns(10);
		txttue9.setBounds(66, 240, 333, 20);
		panel_7.add(txttue9);
		
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
		txtwed1.setBounds(66, 8, 333, 20);
		panel_8.add(txtwed1);
		
		JLabel label_10 = new JLabel("Period 2");
		label_10.setBounds(10, 40, 46, 14);
		panel_8.add(label_10);
		
		txtwed2 = new JTextField();
		txtwed2.setColumns(10);
		txtwed2.setBounds(66, 37, 333, 20);
		panel_8.add(txtwed2);
		
		JLabel label_11 = new JLabel("Period 3");
		label_11.setBounds(10, 69, 46, 14);
		panel_8.add(label_11);
		
		txtwed3 = new JTextField();
		txtwed3.setColumns(10);
		txtwed3.setBounds(66, 66, 333, 20);
		panel_8.add(txtwed3);
		
		JLabel label_12 = new JLabel("Period 4");
		label_12.setBounds(10, 98, 46, 14);
		panel_8.add(label_12);
		
		txtwed4 = new JTextField();
		txtwed4.setColumns(10);
		txtwed4.setBounds(66, 95, 333, 20);
		panel_8.add(txtwed4);
		
		JLabel label_13 = new JLabel("Period 5");
		label_13.setBounds(10, 127, 46, 14);
		panel_8.add(label_13);
		
		txtwed5 = new JTextField();
		txtwed5.setColumns(10);
		txtwed5.setBounds(66, 124, 333, 20);
		panel_8.add(txtwed5);
		
		JLabel label_14 = new JLabel("Period 6");
		label_14.setBounds(10, 156, 46, 14);
		panel_8.add(label_14);
		
		txtwed6 = new JTextField();
		txtwed6.setColumns(10);
		txtwed6.setBounds(66, 153, 333, 20);
		panel_8.add(txtwed6);
		
		JLabel label_15 = new JLabel("Period 7");
		label_15.setBounds(10, 185, 46, 14);
		panel_8.add(label_15);
		
		txtwed7 = new JTextField();
		txtwed7.setColumns(10);
		txtwed7.setBounds(66, 182, 333, 20);
		panel_8.add(txtwed7);
		
		JLabel label_16 = new JLabel("Period 8");
		label_16.setBounds(10, 214, 46, 14);
		panel_8.add(label_16);
		
		txtwed8 = new JTextField();
		txtwed8.setColumns(10);
		txtwed8.setBounds(66, 211, 333, 20);
		panel_8.add(txtwed8);
		
		JLabel label_17 = new JLabel("Period 9");
		label_17.setBounds(10, 243, 46, 14);
		panel_8.add(label_17);
		
		txtwed9 = new JTextField();
		txtwed9.setColumns(10);
		txtwed9.setBounds(66, 240, 333, 20);
		panel_8.add(txtwed9);
		
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
		txtthu1.setBounds(66, 8, 333, 20);
		panel_9.add(txtthu1);
		
		JLabel label_19 = new JLabel("Period 2");
		label_19.setBounds(10, 40, 46, 14);
		panel_9.add(label_19);
		
		txtthu2 = new JTextField();
		txtthu2.setColumns(10);
		txtthu2.setBounds(66, 37, 333, 20);
		panel_9.add(txtthu2);
		
		JLabel label_20 = new JLabel("Period 3");
		label_20.setBounds(10, 69, 46, 14);
		panel_9.add(label_20);
		
		txtthu3 = new JTextField();
		txtthu3.setColumns(10);
		txtthu3.setBounds(66, 66, 333, 20);
		panel_9.add(txtthu3);
		
		JLabel label_21 = new JLabel("Period 4");
		label_21.setBounds(10, 98, 46, 14);
		panel_9.add(label_21);
		
		txtthu4 = new JTextField();
		txtthu4.setColumns(10);
		txtthu4.setBounds(66, 95, 333, 20);
		panel_9.add(txtthu4);
		
		JLabel label_22 = new JLabel("Period 5");
		label_22.setBounds(10, 127, 46, 14);
		panel_9.add(label_22);
		
		txtthu5 = new JTextField();
		txtthu5.setColumns(10);
		txtthu5.setBounds(66, 124, 333, 20);
		panel_9.add(txtthu5);
		
		JLabel label_23 = new JLabel("Period 6");
		label_23.setBounds(10, 156, 46, 14);
		panel_9.add(label_23);
		
		txtthu6 = new JTextField();
		txtthu6.setColumns(10);
		txtthu6.setBounds(66, 153, 333, 20);
		panel_9.add(txtthu6);
		
		JLabel label_24 = new JLabel("Period 7");
		label_24.setBounds(10, 185, 46, 14);
		panel_9.add(label_24);
		
		txtthu7 = new JTextField();
		txtthu7.setColumns(10);
		txtthu7.setBounds(66, 182, 333, 20);
		panel_9.add(txtthu7);
		
		JLabel label_25 = new JLabel("Period 8");
		label_25.setBounds(10, 214, 46, 14);
		panel_9.add(label_25);
		
		txtthu8 = new JTextField();
		txtthu8.setColumns(10);
		txtthu8.setBounds(66, 211, 333, 20);
		panel_9.add(txtthu8);
		
		JLabel label_26 = new JLabel("Period 9");
		label_26.setBounds(10, 243, 46, 14);
		panel_9.add(label_26);
		
		txtthu9 = new JTextField();
		txtthu9.setColumns(10);
		txtthu9.setBounds(66, 240, 333, 20);
		panel_9.add(txtthu9);
		
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
		txtfr1.setBounds(66, 8, 333, 20);
		panel_10.add(txtfr1);
		
		JLabel label_28 = new JLabel("Period 2");
		label_28.setBounds(10, 40, 46, 14);
		panel_10.add(label_28);
		
		txtfr2 = new JTextField();
		txtfr2.setColumns(10);
		txtfr2.setBounds(66, 37, 333, 20);
		panel_10.add(txtfr2);
		
		JLabel label_29 = new JLabel("Period 3");
		label_29.setBounds(10, 69, 46, 14);
		panel_10.add(label_29);
		
		txtfr3 = new JTextField();
		txtfr3.setColumns(10);
		txtfr3.setBounds(66, 66, 333, 20);
		panel_10.add(txtfr3);
		
		JLabel label_30 = new JLabel("Period 4");
		label_30.setBounds(10, 98, 46, 14);
		panel_10.add(label_30);
		
		txtfr4 = new JTextField();
		txtfr4.setColumns(10);
		txtfr4.setBounds(66, 95, 333, 20);
		panel_10.add(txtfr4);
		
		JLabel label_31 = new JLabel("Period 5");
		label_31.setBounds(10, 127, 46, 14);
		panel_10.add(label_31);
		
		txtfr5 = new JTextField();
		txtfr5.setColumns(10);
		txtfr5.setBounds(66, 124, 333, 20);
		panel_10.add(txtfr5);
		
		JLabel label_32 = new JLabel("Period 6");
		label_32.setBounds(10, 156, 46, 14);
		panel_10.add(label_32);
		
		txtfr6 = new JTextField();
		txtfr6.setColumns(10);
		txtfr6.setBounds(66, 153, 333, 20);
		panel_10.add(txtfr6);
		
		JLabel label_33 = new JLabel("Period 7");
		label_33.setBounds(10, 185, 46, 14);
		panel_10.add(label_33);
		
		txtfr7 = new JTextField();
		txtfr7.setColumns(10);
		txtfr7.setBounds(66, 182, 333, 20);
		panel_10.add(txtfr7);
		
		JLabel label_34 = new JLabel("Period 8");
		label_34.setBounds(10, 214, 46, 14);
		panel_10.add(label_34);
		
		txtfr8 = new JTextField();
		txtfr8.setColumns(10);
		txtfr8.setBounds(66, 211, 333, 20);
		panel_10.add(txtfr8);
		
		JLabel label_35 = new JLabel("Period 9");
		label_35.setBounds(10, 243, 46, 14);
		panel_10.add(label_35);
		
		txtfr9 = new JTextField();
		txtfr9.setColumns(10);
		txtfr9.setBounds(66, 240, 333, 20);
		panel_10.add(txtfr9);
		
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
		txtsat1.setBounds(66, 8, 333, 20);
		panel_11.add(txtsat1);
		
		JLabel label_37 = new JLabel("Period 2");
		label_37.setBounds(10, 40, 46, 14);
		panel_11.add(label_37);
		
		txtsat2 = new JTextField();
		txtsat2.setColumns(10);
		txtsat2.setBounds(66, 37, 333, 20);
		panel_11.add(txtsat2);
		
		JLabel label_38 = new JLabel("Period 3");
		label_38.setBounds(10, 69, 46, 14);
		panel_11.add(label_38);
		
		txtsat3 = new JTextField();
		txtsat3.setColumns(10);
		txtsat3.setBounds(66, 66, 333, 20);
		panel_11.add(txtsat3);
		
		JLabel label_39 = new JLabel("Period 4");
		label_39.setBounds(10, 98, 46, 14);
		panel_11.add(label_39);
		
		txtsat4 = new JTextField();
		txtsat4.setColumns(10);
		txtsat4.setBounds(66, 95, 333, 20);
		panel_11.add(txtsat4);
		
		JLabel label_40 = new JLabel("Period 5");
		label_40.setBounds(10, 127, 46, 14);
		panel_11.add(label_40);
		
		txtsat5 = new JTextField();
		txtsat5.setColumns(10);
		txtsat5.setBounds(66, 124, 333, 20);
		panel_11.add(txtsat5);
		
		JLabel label_41 = new JLabel("Period 6");
		label_41.setBounds(10, 156, 46, 14);
		panel_11.add(label_41);
		
		txtsat6 = new JTextField();
		txtsat6.setColumns(10);
		txtsat6.setBounds(66, 153, 333, 20);
		panel_11.add(txtsat6);
		
		JLabel label_42 = new JLabel("Period 7");
		label_42.setBounds(10, 185, 46, 14);
		panel_11.add(label_42);
		
		txtsat7 = new JTextField();
		txtsat7.setColumns(10);
		txtsat7.setBounds(66, 182, 333, 20);
		panel_11.add(txtsat7);
		
		JLabel label_43 = new JLabel("Period 8");
		label_43.setBounds(10, 214, 46, 14);
		panel_11.add(label_43);
		
		txtsat8 = new JTextField();
		txtsat8.setColumns(10);
		txtsat8.setBounds(66, 211, 333, 20);
		panel_11.add(txtsat8);
		
		JLabel label_44 = new JLabel("Period 9");
		label_44.setBounds(10, 243, 46, 14);
		panel_11.add(label_44);
		
		txtsat9 = new JTextField();
		txtsat9.setColumns(10);
		txtsat9.setBounds(66, 240, 333, 20);
		panel_11.add(txtsat9);
		
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
		txtsun1.setBounds(66, 8, 333, 20);
		panel_12.add(txtsun1);
		
		JLabel label_46 = new JLabel("Period 2");
		label_46.setBounds(10, 40, 46, 14);
		panel_12.add(label_46);
		
		txtsun2 = new JTextField();
		txtsun2.setColumns(10);
		txtsun2.setBounds(66, 37, 333, 20);
		panel_12.add(txtsun2);
		
		JLabel label_47 = new JLabel("Period 3");
		label_47.setBounds(10, 69, 46, 14);
		panel_12.add(label_47);
		
		txtsun3 = new JTextField();
		txtsun3.setColumns(10);
		txtsun3.setBounds(66, 66, 333, 20);
		panel_12.add(txtsun3);
		
		JLabel label_48 = new JLabel("Period 4");
		label_48.setBounds(10, 98, 46, 14);
		panel_12.add(label_48);
		
		txtsun4 = new JTextField();
		txtsun4.setColumns(10);
		txtsun4.setBounds(66, 95, 333, 20);
		panel_12.add(txtsun4);
		
		JLabel label_49 = new JLabel("Period 5");
		label_49.setBounds(10, 127, 46, 14);
		panel_12.add(label_49);
		
		txtsun5 = new JTextField();
		txtsun5.setColumns(10);
		txtsun5.setBounds(66, 124, 333, 20);
		panel_12.add(txtsun5);
		
		JLabel label_50 = new JLabel("Period 6");
		label_50.setBounds(10, 156, 46, 14);
		panel_12.add(label_50);
		
		txtsun6 = new JTextField();
		txtsun6.setColumns(10);
		txtsun6.setBounds(66, 153, 333, 20);
		panel_12.add(txtsun6);
		
		JLabel label_51 = new JLabel("Period 7");
		label_51.setBounds(10, 185, 46, 14);
		panel_12.add(label_51);
		
		txtsun7 = new JTextField();
		txtsun7.setColumns(10);
		txtsun7.setBounds(66, 182, 333, 20);
		panel_12.add(txtsun7);
		
		JLabel label_52 = new JLabel("Period 8");
		label_52.setBounds(10, 214, 46, 14);
		panel_12.add(label_52);
		
		txtsun8 = new JTextField();
		txtsun8.setColumns(10);
		txtsun8.setBounds(66, 211, 333, 20);
		panel_12.add(txtsun8);
		
		JLabel label_53 = new JLabel("Period 9");
		label_53.setBounds(10, 243, 46, 14);
		panel_12.add(label_53);
		
		txtsun9 = new JTextField();
		txtsun9.setColumns(10);
		txtsun9.setBounds(66, 240, 333, 20);
		panel_12.add(txtsun9);
		
		//opens connection to proprietary SQLite db
		ttconnection = SQLite_tt_connector.ttdb_connection();
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//Monday
						String mon1 = txtmon1.getText().toUpperCase();
						String mon2 = txtmon2.getText().toUpperCase();
						String mon3 = txtmon3.getText().toUpperCase();
						String mon4 = txtmon4.getText().toUpperCase();
						String mon5 = txtmon5.getText().toUpperCase();
						String mon6 = txtmon6.getText().toUpperCase();
						String mon7 = txtmon7.getText().toUpperCase();
						String mon8 = txtmon8.getText().toUpperCase();
						String mon9 = txtmon9.getText().toUpperCase();
						
						//Tuesday
						String tue1 = txttue1.getText().toUpperCase();
						String tue2 = txttue2.getText().toUpperCase();
						String tue3 = txttue3.getText().toUpperCase();
						String tue4 = txttue4.getText().toUpperCase();
						String tue5 = txttue5.getText().toUpperCase();
						String tue6 = txttue6.getText().toUpperCase();
						String tue7 = txttue7.getText().toUpperCase();
						String tue8 = txttue8.getText().toUpperCase();
						String tue9 = txttue9.getText().toUpperCase();
						
						//Wednesday
						String wed1 = txtwed1.getText().toUpperCase();
						String wed2 = txtwed2.getText().toUpperCase();
						String wed3 = txtwed3.getText().toUpperCase();
						String wed4 = txtwed4.getText().toUpperCase();
						String wed5 = txtwed5.getText().toUpperCase();
						String wed6 = txtwed6.getText().toUpperCase();
						String wed7 = txtwed7.getText().toUpperCase();
						String wed8 = txtwed8.getText().toUpperCase();
						String wed9 = txtwed9.getText().toUpperCase();
						
						//Thursday
						String thu1 = txtthu1.getText().toUpperCase();
						String thu2 = txtthu2.getText().toUpperCase();
						String thu3 = txtthu3.getText().toUpperCase();
						String thu4 = txtthu4.getText().toUpperCase();
						String thu5 = txtthu5.getText().toUpperCase();
						String thu6 = txtthu6.getText().toUpperCase();
						String thu7 = txtthu7.getText().toUpperCase();
						String thu8 = txtthu8.getText().toUpperCase();
						String thu9 = txtthu9.getText().toUpperCase();
						
						//Friday
						String fri1 = txtfr1.getText().toUpperCase();
						String fri2 = txtfr2.getText().toUpperCase();
						String fri3 = txtfr3.getText().toUpperCase();
						String fri4 = txtfr4.getText().toUpperCase();
						String fri5 = txtfr5.getText().toUpperCase();
						String fri6 = txtfr6.getText().toUpperCase();
						String fri7 = txtfr7.getText().toUpperCase();
						String fri8 = txtfr8.getText().toUpperCase();
						String fri9 = txtfr9.getText().toUpperCase();
						
						//Saturday
						String sat1 = txtsat1.getText().toUpperCase();
						String sat2 = txtsat2.getText().toUpperCase();
						String sat3 = txtsat3.getText().toUpperCase();
						String sat4 = txtsat4.getText().toUpperCase();
						String sat5 = txtsat5.getText().toUpperCase();
						String sat6 = txtsat6.getText().toUpperCase();
						String sat7 = txtsat7.getText().toUpperCase();
						String sat8 = txtsat8.getText().toUpperCase();
						String sat9 = txtsat9.getText().toUpperCase();
						
						//Sunday
						String sun1 = txtsun1.getText().toUpperCase();
						String sun2 = txtsun2.getText().toUpperCase();
						String sun3 = txtsun3.getText().toUpperCase();
						String sun4 = txtsun4.getText().toUpperCase();
						String sun5 = txtsun5.getText().toUpperCase();
						String sun6 = txtsun6.getText().toUpperCase();
						String sun7 = txtsun7.getText().toUpperCase();
						String sun8 = txtsun8.getText().toUpperCase();
						String sun9 = txtsun9.getText().toUpperCase();
						
					try{
						
						String queryadd = "Update TimeTable SET (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Period)"; //SQLite Query
		    			PreparedStatement pst_add = ttconnection.prepareStatement(queryadd);
		    			
		    			
		    			//Period 1
		    			pst_add.setString(1, mon1);
		    			pst_add.setString(2, tue1);
		    			pst_add.setString(3, wed1);
		    			pst_add.setString(4, thu1);
		    			pst_add.setString(5, fri1);
		    			pst_add.setString(6, sat1);
		    			pst_add.setString(7, sun1);
		    			pst_add.setString(8, "1");
		    			pst_add.addBatch();
		    			
		    			//Period2
		    			pst_add.setString(1, mon2);
		    			pst_add.setString(2, tue2);
		    			pst_add.setString(3, wed2);
		    			pst_add.setString(4, thu2);
		    			pst_add.setString(5, fri2);
		    			pst_add.setString(6, sat2);
		    			pst_add.setString(7, sun2);
		    			pst_add.setString(8, "2");
		    			pst_add.addBatch();
		    			
		    			//Period 3
		    			pst_add.setString(1, mon3);
		    			pst_add.setString(2, tue3);
		    			pst_add.setString(3, wed3);
		    			pst_add.setString(4, thu3);
		    			pst_add.setString(5, fri3);
		    			pst_add.setString(6, sat3);
		    			pst_add.setString(7, sun3);
		    			pst_add.setString(8, "3");
		    			pst_add.addBatch();
		    			
		    			//Period 4
		    			pst_add.setString(1, mon4);
		    			pst_add.setString(2, tue4);
		    			pst_add.setString(3, wed4);
		    			pst_add.setString(4, thu4);
		    			pst_add.setString(5, fri4);
		    			pst_add.setString(6, sat4);
		    			pst_add.setString(7, sun4);
		    			pst_add.setString(8, "4");
		    			pst_add.addBatch();
		    			
		    			//Period 5
		    			pst_add.setString(1, mon5);
		    			pst_add.setString(2, tue5);
		    			pst_add.setString(3, wed5);
		    			pst_add.setString(4, thu5);
		    			pst_add.setString(5, fri5);
		    			pst_add.setString(6, sat5);
		    			pst_add.setString(7, sun5);
		    			pst_add.setString(8, "5");
		    			pst_add.addBatch();
		    			
		    			//Period 6
		    			pst_add.setString(1, mon6);
		    			pst_add.setString(2, tue6);
		    			pst_add.setString(3, wed6);
		    			pst_add.setString(4, thu6);
		    			pst_add.setString(5, fri6);
		    			pst_add.setString(6, sat6);
		    			pst_add.setString(7, sun6);
		    			pst_add.setString(8, "6");
		    			pst_add.addBatch();
		    			
		    			//Period 7
		    			pst_add.setString(1, mon7);
		    			pst_add.setString(2, tue7);
		    			pst_add.setString(3, wed7);
		    			pst_add.setString(4, thu7);
		    			pst_add.setString(5, fri7);
		    			pst_add.setString(6, sat7);
		    			pst_add.setString(7, sun7);
		    			pst_add.setString(8, "7");
		    			pst_add.addBatch();
		    			
		    			//Period 8
		    			pst_add.setString(1, mon8);
		    			pst_add.setString(2, tue8);
		    			pst_add.setString(3, wed8);
		    			pst_add.setString(4, thu8);
		    			pst_add.setString(5, fri8);
		    			pst_add.setString(6, sat8);
		    			pst_add.setString(7, sun8);
		    			pst_add.setString(8, "8");
		    			pst_add.addBatch();
		    			
		    			//Period 9
		    			pst_add.setString(1, mon9);
		    			pst_add.setString(2, tue9);
		    			pst_add.setString(3, wed9);
		    			pst_add.setString(4, thu9);
		    			pst_add.setString(5, fri9);
		    			pst_add.setString(6, sat9);
		    			pst_add.setString(7, sun9);
		    			pst_add.setString(8, "9");
		    			pst_add.addBatch();	    			
		    			
		    			//Executes Prepared statement batch
		    			pst_add.executeBatch();	    			
		    		
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
