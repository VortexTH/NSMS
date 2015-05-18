package TimeTable;

import java.awt.*;
import java.sql.*;
import java.util.Vector;

import javax.swing.JDialog;

import sqlcontrol.SQLite_login_connector;
import sqlcontrol.SQLite_tt_connector;

import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

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
	PreparedStatement statement = null;
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
		mntmTimeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Jtable_input_gui inputgui = new Jtable_input_gui();
				inputgui.setVisible(true);
								
			}
		});
		mnEdit.add(mntmTimeTable);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		menuBar.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 0,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ttconnection = SQLite_tt_connector.ttdb_connection();
				String query = "SELECT * from TimeTable;";
								
				try {
					statement = ttconnection.prepareStatement(query);
					ResultSet results = statement.executeQuery();
					ResultSetMetaData metaData = results.getMetaData();
					
					 // Names of columns
		            Vector<String> columnNames = new Vector<String>();
		            int columnCount = metaData.getColumnCount();
		             
		              for (int i = 1; i <= columnCount; i++) {
		                columnNames.add(metaData.getColumnName(i));
		              }
		              
		              
		              
		              // Data of the table
		              Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		             
		              while (results.next()) {
		                  Vector<Object> vector = new Vector<Object>();
		                    
		                    for (int i = 1; i <= columnCount; i++) {
		                      vector.add(results.getObject(i));
		                  }
		                  data.add(vector);
		              }
					 
				
			//http://stackoverflow.com/questions/10620448/most-simple-code-to-populate-jtable-from-resultset
				} catch (SQLException e) {
					e.printStackTrace();
			  }			
				
			}
		});
		menuBar.add(btnRefresh);
		getContentPane().setLayout(new MigLayout("", "[1884px]", "[998px]"));
		
			}
	
	
}
