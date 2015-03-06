package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.EtchedBorder;
import net.miginfocom.swing.MigLayout;

//import GUI.gui_main_landing;
//import chat.chat_gui;


public class gui_main_landing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					gui_main_landing window = new gui_main_landing();
					window.frame.setVisible(true);
					
					
					
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					window.frame.setBounds(0,0,screenSize.width, screenSize.height);
					
					
					window.frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					window.frame.setVisible(true);
					window.frame.setResizable(true);
					
					//window.frame.setExtendedState( window.frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );   Maximizes Window upon paint, but messes up layout currently.
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui_main_landing() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0,0,screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon cheap_logo = new ImageIcon("graphicss_resources/cheap_logo.png");
		ImageIcon new_icon = new ImageIcon("graphics_resources/new.png");
		ImageIcon entry_icon = new ImageIcon("graphics_resources/new_entry.png");
		ImageIcon refresh_icon = new ImageIcon("graphics_resources/refresh.png");
		frame.getContentPane().setLayout(new MigLayout("", "[195px][1px]", "[28px]"));
		frame.getContentPane().setLayout(new MigLayout("", "[195px][1px]", "[28px]"));
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, "cell 0 0,growx,aligny top");
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnImport = new JMenu("Import");
		mnImport.setIcon(new_icon);
		mnFile.add(mnImport);
		
		JMenuItem mntmImportTextDocument = new JMenuItem("Text Document          ");
		mntmImportTextDocument.setIcon(entry_icon);
		mnImport.add(mntmImportTextDocument);
		
		JMenuItem mntmImportPicture = new JMenuItem("Picture");
		mnImport.add(mntmImportPicture);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setIcon(new ImageIcon(gui_main_landing.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
		mnFile.add(mntmOpen);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.setIcon(new ImageIcon(gui_main_landing.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		mnFile.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo"               );
		mntmRedo.setIcon(new ImageIcon(gui_main_landing.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		mnFile.add(mntmRedo);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mntmSaveAs.setIcon(new ImageIcon(gui_main_landing.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon(gui_main_landing.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		mnFile.add(mntmSave);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmRefreshAll = new JMenuItem("Refresh All");
		mntmRefreshAll.setIcon(refresh_icon);
		mnFile.add(mntmRefreshAll);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmImportOptions = new JMenuItem("Import               ");
		mnOptions.add(mntmImportOptions);
		
		JSeparator separator_3 = new JSeparator();
		mnOptions.add(separator_3);
		
		JMenuItem mntmNetworkOptions = new JMenuItem("Network Settings");
		mnOptions.add(mntmNetworkOptions);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JButton btnSaveAll = new JButton("Refresh");
		btnSaveAll.setForeground(Color.WHITE);
		btnSaveAll.setBackground(Color.DARK_GRAY);
		menuBar.add(btnSaveAll);
		
		JButton btnChat = new JButton("Chat");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//chat_gui chat = new chat_gui();
				//chat.setVisible(true);
				//chat.setAlwaysOnTop(true);
				//chat.setAutoRequestFocus(true);
				//chat.setResizable(false);
				
			}
		});
		btnChat.setForeground(Color.WHITE);
		btnChat.setBackground(Color.DARK_GRAY);
		menuBar.add(btnChat);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.DARK_GRAY);
		menuBar.add(btnExit);		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				
			}
		});
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(143, 188, 143));
		frame.getContentPane().add(desktopPane, "cell 1 0,grow");
		desktopPane.setLayout(new MigLayout("", "[407px][1470.00px]", "[651px][13px][308.00px]"));
		
		JInternalFrame internalFrame = new JInternalFrame("Browser");		
		internalFrame.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.WHITE));
		internalFrame.setResizable(true);
		internalFrame.setFrameIcon(cheap_logo);
		internalFrame.setVisible(true);
		desktopPane.add(internalFrame, "cell 0 0 1 3,grow");
		internalFrame.getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		
		JInternalFrame internalFrame_1 = new JInternalFrame("Main");
		internalFrame_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.WHITE));
		internalFrame_1.setResizable(true);
		internalFrame_1.setFrameIcon(cheap_logo);
		internalFrame_1.setVisible(true);
		desktopPane.add(internalFrame_1, "cell 1 0,grow");
		internalFrame_1.getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		
		JInternalFrame internalFrame_2 = new JInternalFrame("Quick Access");
		internalFrame_2.setAutoscrolls(true);
		internalFrame_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, new Color(255, 255, 255)));
		internalFrame_2.setResizable(true);
		internalFrame_2.setFrameIcon(cheap_logo);
		internalFrame_2.setVisible(true);
		desktopPane.add(internalFrame_2, "cell 1 1 1 2,grow");
		internalFrame_2.getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		
		
	}
}
