package dir_operations;

import java.io.File;

import javax.swing.JOptionPane;

public class create_dir {
	
	public String finalpath;
	public String name;
	
	public create_dir (String inputpath, String name){
		
		finalpath = inputpath + "\\" + name;	
		
		File dir = new File(finalpath);
				
		
		if (!dir.exists()){				
		  dir.mkdir();
		  }
		
		else{
			JOptionPane.showMessageDialog(null, "A directory already exists at this location, it will be imported!");
		    }
		 
		
	
	

	

	}

}
