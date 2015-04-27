package TimeTable;

import java.awt.*;
import java.sql.*;

import javax.swing.JDialog;

import sqlcontrol.SQLite_tt_connector;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class timetable_main_gui extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timetable_main_gui dialog = new timetable_main_gui();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
					dialog.setResizable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	
	
	Connection ttconnection = null;
	private JTable table;
	
	public timetable_main_gui() {
		//   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		//Sets Jdialog to fullscreen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width, screenSize.height);	
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmTimeTable = new JMenuItem("Time Table");
		mnEdit.add(mntmTimeTable);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		menuBar.add(btnExit);
		getContentPane().setLayout(new MigLayout("", "[1884px]", "[998px]"));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ttconnection = SQLite_tt_connector.ttdb_connection();
		
		
		
		
		
		
		
		
		
		

	}
}
