package sqlcontrol;

import java.sql.*;

import javax.swing.*;

public class SQLite_tt_connector {
	//Initializes global connection variable (unused until now!)
	Connection conn_tt = null;
	
	public static Connection ttdb_connection(){
		
		//Simple try catch block that prints error trace log in a JOptionPane if runtime error occurs.
		
		try{
			Class.forName("org.sqlite.JDBC");
			
			Connection conn_tt = DriverManager.getConnection("jdbc:sqlite:SQLite/NSMStt.sqlite");
			
			//JOptionPane.showMessageDialog(null, "Database Connection Successful!");
			
			return conn_tt;
			
		}	catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
	

}
