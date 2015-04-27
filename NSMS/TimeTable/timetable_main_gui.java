package TimeTable;
import sqlcontrol.*;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;

public class timetable_main_gui extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timetable_main_gui dialog = new timetable_main_gui();
							
					//   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					//Sets Jdialog to fullscreen
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					dialog.setBounds(0,0,screenSize.width, screenSize.height);					
																			
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
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
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		getContentPane().setLayout(new MigLayout("", "[414px]", "[218px]"));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		//Creates a connection to the included SQLite db for the Time Table.
		ttconnection = SQLite_tt_connector.ttdb_connection();
		
		
		


	}
}
