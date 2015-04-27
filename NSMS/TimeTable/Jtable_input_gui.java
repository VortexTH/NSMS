package TimeTable;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jtable_input_gui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;

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
		
		textField = new JTextField();
		textField.setBounds(66, 8, 239, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnFree = new JButton("Free");
		btnFree.setBounds(310, 7, 89, 23);
		panel.add(btnFree);
		
		JLabel lblPeriod_1 = new JLabel("Period 2");
		lblPeriod_1.setBounds(10, 40, 46, 14);
		panel.add(lblPeriod_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 37, 239, 20);
		panel.add(textField_1);
		
		JButton button = new JButton("Free");
		button.setBounds(310, 36, 89, 23);
		panel.add(button);
		
		JLabel lblPeriod_2 = new JLabel("Period 3");
		lblPeriod_2.setBounds(10, 69, 46, 14);
		panel.add(lblPeriod_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 66, 239, 20);
		panel.add(textField_2);
		
		JButton button_1 = new JButton("Free");
		button_1.setBounds(310, 65, 89, 23);
		panel.add(button_1);
		
		JLabel lblPeriod_3 = new JLabel("Period 4");
		lblPeriod_3.setBounds(10, 98, 46, 14);
		panel.add(lblPeriod_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 95, 239, 20);
		panel.add(textField_3);
		
		JButton button_2 = new JButton("Free");
		button_2.setBounds(310, 94, 89, 23);
		panel.add(button_2);
		
		JLabel lblPeriod_4 = new JLabel("Period 5");
		lblPeriod_4.setBounds(10, 127, 46, 14);
		panel.add(lblPeriod_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(66, 124, 239, 20);
		panel.add(textField_4);
		
		JButton button_3 = new JButton("Free");
		button_3.setBounds(310, 123, 89, 23);
		panel.add(button_3);
		
		JLabel lblPeriod_5 = new JLabel("Period 6");
		lblPeriod_5.setBounds(10, 156, 46, 14);
		panel.add(lblPeriod_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 153, 239, 20);
		panel.add(textField_5);
		
		JButton button_4 = new JButton("Free");
		button_4.setBounds(310, 152, 89, 23);
		panel.add(button_4);
		
		JLabel lblPeriod_6 = new JLabel("Period 7");
		lblPeriod_6.setBounds(10, 185, 46, 14);
		panel.add(lblPeriod_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(66, 182, 239, 20);
		panel.add(textField_6);
		
		JButton button_5 = new JButton("Free");
		button_5.setBounds(310, 181, 89, 23);
		panel.add(button_5);
		
		JLabel lblPeriod_7 = new JLabel("Period 8");
		lblPeriod_7.setBounds(10, 214, 46, 14);
		panel.add(lblPeriod_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(66, 211, 239, 20);
		panel.add(textField_7);
		
		JButton button_6 = new JButton("Free");
		button_6.setBounds(310, 210, 89, 23);
		panel.add(button_6);
		
		JLabel lblPeriod_8 = new JLabel("Period 9");
		lblPeriod_8.setBounds(10, 243, 46, 14);
		panel.add(lblPeriod_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(66, 240, 239, 20);
		panel.add(textField_8);
		
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
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(66, 8, 239, 20);
		panel_7.add(textField_9);
		
		JButton button_8 = new JButton("Free");
		button_8.setBounds(310, 7, 89, 23);
		panel_7.add(button_8);
		
		JLabel label_1 = new JLabel("Period 2");
		label_1.setBounds(10, 40, 46, 14);
		panel_7.add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(66, 37, 239, 20);
		panel_7.add(textField_10);
		
		JButton button_9 = new JButton("Free");
		button_9.setBounds(310, 36, 89, 23);
		panel_7.add(button_9);
		
		JLabel label_2 = new JLabel("Period 3");
		label_2.setBounds(10, 69, 46, 14);
		panel_7.add(label_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(66, 66, 239, 20);
		panel_7.add(textField_11);
		
		JButton button_10 = new JButton("Free");
		button_10.setBounds(310, 65, 89, 23);
		panel_7.add(button_10);
		
		JLabel label_3 = new JLabel("Period 4");
		label_3.setBounds(10, 98, 46, 14);
		panel_7.add(label_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(66, 95, 239, 20);
		panel_7.add(textField_12);
		
		JButton button_11 = new JButton("Free");
		button_11.setBounds(310, 94, 89, 23);
		panel_7.add(button_11);
		
		JLabel label_4 = new JLabel("Period 5");
		label_4.setBounds(10, 127, 46, 14);
		panel_7.add(label_4);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(66, 124, 239, 20);
		panel_7.add(textField_13);
		
		JButton button_12 = new JButton("Free");
		button_12.setBounds(310, 123, 89, 23);
		panel_7.add(button_12);
		
		JLabel label_5 = new JLabel("Period 6");
		label_5.setBounds(10, 156, 46, 14);
		panel_7.add(label_5);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(66, 153, 239, 20);
		panel_7.add(textField_14);
		
		JButton button_13 = new JButton("Free");
		button_13.setBounds(310, 152, 89, 23);
		panel_7.add(button_13);
		
		JLabel label_6 = new JLabel("Period 7");
		label_6.setBounds(10, 185, 46, 14);
		panel_7.add(label_6);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(66, 182, 239, 20);
		panel_7.add(textField_15);
		
		JButton button_14 = new JButton("Free");
		button_14.setBounds(310, 181, 89, 23);
		panel_7.add(button_14);
		
		JLabel label_7 = new JLabel("Period 8");
		label_7.setBounds(10, 214, 46, 14);
		panel_7.add(label_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(66, 211, 239, 20);
		panel_7.add(textField_16);
		
		JButton button_15 = new JButton("Free");
		button_15.setBounds(310, 210, 89, 23);
		panel_7.add(button_15);
		
		JLabel label_8 = new JLabel("Period 9");
		label_8.setBounds(10, 243, 46, 14);
		panel_7.add(label_8);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(66, 240, 239, 20);
		panel_7.add(textField_17);
		
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
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(66, 8, 239, 20);
		panel_8.add(textField_18);
		
		JButton button_17 = new JButton("Free");
		button_17.setBounds(310, 7, 89, 23);
		panel_8.add(button_17);
		
		JLabel label_10 = new JLabel("Period 2");
		label_10.setBounds(10, 40, 46, 14);
		panel_8.add(label_10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(66, 37, 239, 20);
		panel_8.add(textField_19);
		
		JButton button_18 = new JButton("Free");
		button_18.setBounds(310, 36, 89, 23);
		panel_8.add(button_18);
		
		JLabel label_11 = new JLabel("Period 3");
		label_11.setBounds(10, 69, 46, 14);
		panel_8.add(label_11);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(66, 66, 239, 20);
		panel_8.add(textField_20);
		
		JButton button_19 = new JButton("Free");
		button_19.setBounds(310, 65, 89, 23);
		panel_8.add(button_19);
		
		JLabel label_12 = new JLabel("Period 4");
		label_12.setBounds(10, 98, 46, 14);
		panel_8.add(label_12);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(66, 95, 239, 20);
		panel_8.add(textField_21);
		
		JButton button_20 = new JButton("Free");
		button_20.setBounds(310, 94, 89, 23);
		panel_8.add(button_20);
		
		JLabel label_13 = new JLabel("Period 5");
		label_13.setBounds(10, 127, 46, 14);
		panel_8.add(label_13);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(66, 124, 239, 20);
		panel_8.add(textField_22);
		
		JButton button_21 = new JButton("Free");
		button_21.setBounds(310, 123, 89, 23);
		panel_8.add(button_21);
		
		JLabel label_14 = new JLabel("Period 6");
		label_14.setBounds(10, 156, 46, 14);
		panel_8.add(label_14);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(66, 153, 239, 20);
		panel_8.add(textField_23);
		
		JButton button_22 = new JButton("Free");
		button_22.setBounds(310, 152, 89, 23);
		panel_8.add(button_22);
		
		JLabel label_15 = new JLabel("Period 7");
		label_15.setBounds(10, 185, 46, 14);
		panel_8.add(label_15);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(66, 182, 239, 20);
		panel_8.add(textField_24);
		
		JButton button_23 = new JButton("Free");
		button_23.setBounds(310, 181, 89, 23);
		panel_8.add(button_23);
		
		JLabel label_16 = new JLabel("Period 8");
		label_16.setBounds(10, 214, 46, 14);
		panel_8.add(label_16);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(66, 211, 239, 20);
		panel_8.add(textField_25);
		
		JButton button_24 = new JButton("Free");
		button_24.setBounds(310, 210, 89, 23);
		panel_8.add(button_24);
		
		JLabel label_17 = new JLabel("Period 9");
		label_17.setBounds(10, 243, 46, 14);
		panel_8.add(label_17);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(66, 240, 239, 20);
		panel_8.add(textField_26);
		
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
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(66, 8, 239, 20);
		panel_9.add(textField_27);
		
		JButton button_26 = new JButton("Free");
		button_26.setBounds(310, 7, 89, 23);
		panel_9.add(button_26);
		
		JLabel label_19 = new JLabel("Period 2");
		label_19.setBounds(10, 40, 46, 14);
		panel_9.add(label_19);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(66, 37, 239, 20);
		panel_9.add(textField_28);
		
		JButton button_27 = new JButton("Free");
		button_27.setBounds(310, 36, 89, 23);
		panel_9.add(button_27);
		
		JLabel label_20 = new JLabel("Period 3");
		label_20.setBounds(10, 69, 46, 14);
		panel_9.add(label_20);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(66, 66, 239, 20);
		panel_9.add(textField_29);
		
		JButton button_28 = new JButton("Free");
		button_28.setBounds(310, 65, 89, 23);
		panel_9.add(button_28);
		
		JLabel label_21 = new JLabel("Period 4");
		label_21.setBounds(10, 98, 46, 14);
		panel_9.add(label_21);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(66, 95, 239, 20);
		panel_9.add(textField_30);
		
		JButton button_29 = new JButton("Free");
		button_29.setBounds(310, 94, 89, 23);
		panel_9.add(button_29);
		
		JLabel label_22 = new JLabel("Period 5");
		label_22.setBounds(10, 127, 46, 14);
		panel_9.add(label_22);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(66, 124, 239, 20);
		panel_9.add(textField_31);
		
		JButton button_30 = new JButton("Free");
		button_30.setBounds(310, 123, 89, 23);
		panel_9.add(button_30);
		
		JLabel label_23 = new JLabel("Period 6");
		label_23.setBounds(10, 156, 46, 14);
		panel_9.add(label_23);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(66, 153, 239, 20);
		panel_9.add(textField_32);
		
		JButton button_31 = new JButton("Free");
		button_31.setBounds(310, 152, 89, 23);
		panel_9.add(button_31);
		
		JLabel label_24 = new JLabel("Period 7");
		label_24.setBounds(10, 185, 46, 14);
		panel_9.add(label_24);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(66, 182, 239, 20);
		panel_9.add(textField_33);
		
		JButton button_32 = new JButton("Free");
		button_32.setBounds(310, 181, 89, 23);
		panel_9.add(button_32);
		
		JLabel label_25 = new JLabel("Period 8");
		label_25.setBounds(10, 214, 46, 14);
		panel_9.add(label_25);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(66, 211, 239, 20);
		panel_9.add(textField_34);
		
		JButton button_33 = new JButton("Free");
		button_33.setBounds(310, 210, 89, 23);
		panel_9.add(button_33);
		
		JLabel label_26 = new JLabel("Period 9");
		label_26.setBounds(10, 243, 46, 14);
		panel_9.add(label_26);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(66, 240, 239, 20);
		panel_9.add(textField_35);
		
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
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(66, 8, 239, 20);
		panel_10.add(textField_36);
		
		JButton button_35 = new JButton("Free");
		button_35.setBounds(310, 7, 89, 23);
		panel_10.add(button_35);
		
		JLabel label_28 = new JLabel("Period 2");
		label_28.setBounds(10, 40, 46, 14);
		panel_10.add(label_28);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(66, 37, 239, 20);
		panel_10.add(textField_37);
		
		JButton button_36 = new JButton("Free");
		button_36.setBounds(310, 36, 89, 23);
		panel_10.add(button_36);
		
		JLabel label_29 = new JLabel("Period 3");
		label_29.setBounds(10, 69, 46, 14);
		panel_10.add(label_29);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(66, 66, 239, 20);
		panel_10.add(textField_38);
		
		JButton button_37 = new JButton("Free");
		button_37.setBounds(310, 65, 89, 23);
		panel_10.add(button_37);
		
		JLabel label_30 = new JLabel("Period 4");
		label_30.setBounds(10, 98, 46, 14);
		panel_10.add(label_30);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(66, 95, 239, 20);
		panel_10.add(textField_39);
		
		JButton button_38 = new JButton("Free");
		button_38.setBounds(310, 94, 89, 23);
		panel_10.add(button_38);
		
		JLabel label_31 = new JLabel("Period 5");
		label_31.setBounds(10, 127, 46, 14);
		panel_10.add(label_31);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(66, 124, 239, 20);
		panel_10.add(textField_40);
		
		JButton button_39 = new JButton("Free");
		button_39.setBounds(310, 123, 89, 23);
		panel_10.add(button_39);
		
		JLabel label_32 = new JLabel("Period 6");
		label_32.setBounds(10, 156, 46, 14);
		panel_10.add(label_32);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(66, 153, 239, 20);
		panel_10.add(textField_41);
		
		JButton button_40 = new JButton("Free");
		button_40.setBounds(310, 152, 89, 23);
		panel_10.add(button_40);
		
		JLabel label_33 = new JLabel("Period 7");
		label_33.setBounds(10, 185, 46, 14);
		panel_10.add(label_33);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(66, 182, 239, 20);
		panel_10.add(textField_42);
		
		JButton button_41 = new JButton("Free");
		button_41.setBounds(310, 181, 89, 23);
		panel_10.add(button_41);
		
		JLabel label_34 = new JLabel("Period 8");
		label_34.setBounds(10, 214, 46, 14);
		panel_10.add(label_34);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(66, 211, 239, 20);
		panel_10.add(textField_43);
		
		JButton button_42 = new JButton("Free");
		button_42.setBounds(310, 210, 89, 23);
		panel_10.add(button_42);
		
		JLabel label_35 = new JLabel("Period 9");
		label_35.setBounds(10, 243, 46, 14);
		panel_10.add(label_35);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(66, 240, 239, 20);
		panel_10.add(textField_44);
		
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
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(66, 8, 239, 20);
		panel_11.add(textField_45);
		
		JButton button_44 = new JButton("Free");
		button_44.setBounds(310, 7, 89, 23);
		panel_11.add(button_44);
		
		JLabel label_37 = new JLabel("Period 2");
		label_37.setBounds(10, 40, 46, 14);
		panel_11.add(label_37);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(66, 37, 239, 20);
		panel_11.add(textField_46);
		
		JButton button_45 = new JButton("Free");
		button_45.setBounds(310, 36, 89, 23);
		panel_11.add(button_45);
		
		JLabel label_38 = new JLabel("Period 3");
		label_38.setBounds(10, 69, 46, 14);
		panel_11.add(label_38);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(66, 66, 239, 20);
		panel_11.add(textField_47);
		
		JButton button_46 = new JButton("Free");
		button_46.setBounds(310, 65, 89, 23);
		panel_11.add(button_46);
		
		JLabel label_39 = new JLabel("Period 4");
		label_39.setBounds(10, 98, 46, 14);
		panel_11.add(label_39);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(66, 95, 239, 20);
		panel_11.add(textField_48);
		
		JButton button_47 = new JButton("Free");
		button_47.setBounds(310, 94, 89, 23);
		panel_11.add(button_47);
		
		JLabel label_40 = new JLabel("Period 5");
		label_40.setBounds(10, 127, 46, 14);
		panel_11.add(label_40);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(66, 124, 239, 20);
		panel_11.add(textField_49);
		
		JButton button_48 = new JButton("Free");
		button_48.setBounds(310, 123, 89, 23);
		panel_11.add(button_48);
		
		JLabel label_41 = new JLabel("Period 6");
		label_41.setBounds(10, 156, 46, 14);
		panel_11.add(label_41);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(66, 153, 239, 20);
		panel_11.add(textField_50);
		
		JButton button_49 = new JButton("Free");
		button_49.setBounds(310, 152, 89, 23);
		panel_11.add(button_49);
		
		JLabel label_42 = new JLabel("Period 7");
		label_42.setBounds(10, 185, 46, 14);
		panel_11.add(label_42);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(66, 182, 239, 20);
		panel_11.add(textField_51);
		
		JButton button_50 = new JButton("Free");
		button_50.setBounds(310, 181, 89, 23);
		panel_11.add(button_50);
		
		JLabel label_43 = new JLabel("Period 8");
		label_43.setBounds(10, 214, 46, 14);
		panel_11.add(label_43);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(66, 211, 239, 20);
		panel_11.add(textField_52);
		
		JButton button_51 = new JButton("Free");
		button_51.setBounds(310, 210, 89, 23);
		panel_11.add(button_51);
		
		JLabel label_44 = new JLabel("Period 9");
		label_44.setBounds(10, 243, 46, 14);
		panel_11.add(label_44);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(66, 240, 239, 20);
		panel_11.add(textField_53);
		
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
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(66, 8, 239, 20);
		panel_12.add(textField_54);
		
		JButton button_53 = new JButton("Free");
		button_53.setBounds(310, 7, 89, 23);
		panel_12.add(button_53);
		
		JLabel label_46 = new JLabel("Period 2");
		label_46.setBounds(10, 40, 46, 14);
		panel_12.add(label_46);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(66, 37, 239, 20);
		panel_12.add(textField_55);
		
		JButton button_54 = new JButton("Free");
		button_54.setBounds(310, 36, 89, 23);
		panel_12.add(button_54);
		
		JLabel label_47 = new JLabel("Period 3");
		label_47.setBounds(10, 69, 46, 14);
		panel_12.add(label_47);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(66, 66, 239, 20);
		panel_12.add(textField_56);
		
		JButton button_55 = new JButton("Free");
		button_55.setBounds(310, 65, 89, 23);
		panel_12.add(button_55);
		
		JLabel label_48 = new JLabel("Period 4");
		label_48.setBounds(10, 98, 46, 14);
		panel_12.add(label_48);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(66, 95, 239, 20);
		panel_12.add(textField_57);
		
		JButton button_56 = new JButton("Free");
		button_56.setBounds(310, 94, 89, 23);
		panel_12.add(button_56);
		
		JLabel label_49 = new JLabel("Period 5");
		label_49.setBounds(10, 127, 46, 14);
		panel_12.add(label_49);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(66, 124, 239, 20);
		panel_12.add(textField_58);
		
		JButton button_57 = new JButton("Free");
		button_57.setBounds(310, 123, 89, 23);
		panel_12.add(button_57);
		
		JLabel label_50 = new JLabel("Period 6");
		label_50.setBounds(10, 156, 46, 14);
		panel_12.add(label_50);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(66, 153, 239, 20);
		panel_12.add(textField_59);
		
		JButton button_58 = new JButton("Free");
		button_58.setBounds(310, 152, 89, 23);
		panel_12.add(button_58);
		
		JLabel label_51 = new JLabel("Period 7");
		label_51.setBounds(10, 185, 46, 14);
		panel_12.add(label_51);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(66, 182, 239, 20);
		panel_12.add(textField_60);
		
		JButton button_59 = new JButton("Free");
		button_59.setBounds(310, 181, 89, 23);
		panel_12.add(button_59);
		
		JLabel label_52 = new JLabel("Period 8");
		label_52.setBounds(10, 214, 46, 14);
		panel_12.add(label_52);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(66, 211, 239, 20);
		panel_12.add(textField_61);
		
		JButton button_60 = new JButton("Free");
		button_60.setBounds(310, 210, 89, 23);
		panel_12.add(button_60);
		
		JLabel label_53 = new JLabel("Period 9");
		label_53.setBounds(10, 243, 46, 14);
		panel_12.add(label_53);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(66, 240, 239, 20);
		panel_12.add(textField_62);
		
		JButton button_61 = new JButton("Free");
		button_61.setBounds(310, 239, 89, 23);
		panel_12.add(button_61);
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
