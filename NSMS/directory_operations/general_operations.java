//package directory_operations;

package directory_operations;

import java.io.File;

import javax.swing.JOptionPane;

public class general_operations {
	
	//public String name;
	public String finalpath;
	
	
	
	
	
	//creates a new directory of name "name" at path "finalpath"
	public void new_dir (String inputpath, String name){
		
		finalpath = inputpath + "\\" + name;		
		File dir = new File(finalpath);				
		
		if (!dir.exists()){				
		  dir.mkdir();
		  }
		
		else{
		  JOptionPane.showMessageDialog(null, "Such a directory already exists in this location!");
		  }
	}
	
	
	
	
	
	
	
	//Deletes a directory at path "inputpath" of name "name"
	public void delete_dir (String inputpath, String name){
		
		finalpath = inputpath + "\\" + name;
		File dir = new File(finalpath);
		
		if (dir.exists()){
		  dir.delete();
		  }
		
		else{
		   JOptionPane.showMessageDialog(null, "This folder does not exist");
		   }		
	 }
	
	
	
	

	

}


