package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.JDesktopPane;

import chat.*;
//import TimeTable;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import net.miginfocom.swing.MigLayout;

import javax.swing.JRadioButton;
import javax.swing.JSpinner;

//import directory_operations.new_parent_directory;
import directory_operations.*;
import javax.swing.JLabel;


//import GUI.gui_main_landing;
//import chat.chat_gui;

public class gui_main_landing {

	private JFrame frmNsms;

	/**
	 * Launch the application.
	 */
	public static void penismain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					gui_main_landing window = new gui_main_landing();
					window.frmNsms.setVisible(true);
					
					//   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					window.frmNsms.setBounds(0,0,screenSize.width, screenSize.height);				
					
					window.frmNsms.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					window.frmNsms.setVisible(true);
					window.frmNsms.setResizable(true);
					
					//window.frame.setExtendedState( window.frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );   Maximizes Window upon paint, but messes up layout cu					
					
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
		frmNsms = new JFrame();
		frmNsms.setTitle("NSMS");
		
		frmNsms.getContentPane().setLayout(new MigLayout("", "[1896px]", "[30px][996px]"));
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmNsms.setBounds(0,0,screenSize.width, screenSize.height);
		frmNsms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon cheap_logo = new ImageIcon("graphicss_resources/cheap_logo.png");
		ImageIcon new_icon = new ImageIcon("graphics_resources/new.png");
		ImageIcon entry_icon = new ImageIcon("graphics_resources/new_entry.png");
		ImageIcon refresh_icon = new ImageIcon("graphics_resources/refresh.png");
		
		JMenuBar menuBar = new JMenuBar();
		frmNsms.getContentPane().add(menuBar, "cell 0 0,grow");
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnImport = new JMenu("Import");
		mnImport.setIcon(new_icon);
		mnFile.add(mnImport);
		
		JMenuItem mntmImportTextDocument = new JMenuItem("Text File      ");
		mntmImportTextDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				add_documents_menu documentsmenu = new add_documents_menu();
				documentsmenu.setVisible(true);
				
			}
		});
		mntmImportTextDocument.setIcon(entry_icon);
		mnImport.add(mntmImportTextDocument);
		
		JMenuItem mntmImportPicture = new JMenuItem("Graphics File");
		mntmImportPicture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				add_graphics_menu graphicsmenu = new add_graphics_menu();
				graphicsmenu.setVisible(true);				
				
			}
		});
		mnImport.add(mntmImportPicture);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("PDF File");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				add_pdf_menu pdf = new add_pdf_menu();
				pdf.setVisible(true);
				
			}
		});
		mnImport.add(mntmNewMenuItem);
		
		JMenuItem mntmSpreadsheetFile = new JMenuItem("Spreadsheet File");
		mntmSpreadsheetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				add_spreadsheet_menu spreadsheet = new add_spreadsheet_menu();
				spreadsheet.setVisible(true);
				
			}
		});
		mnImport.add(mntmSpreadsheetFile);
		
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
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmClasses = new JMenuItem("Classes");
		mnEdit.add(mntmClasses);
		
		JMenuItem mntmFileStructure = new JMenuItem("File Structure");
		mnEdit.add(mntmFileStructure);
		
		JSeparator separator_4 = new JSeparator();
		mnEdit.add(separator_4);
				
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmImportOptions = new JMenuItem("Import          ");
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
		btnSaveAll.setToolTipText("Refresh resources");
		btnSaveAll.setForeground(Color.WHITE);
		btnSaveAll.setBackground(Color.DARK_GRAY);
		menuBar.add(btnSaveAll);
		/*
		JButton btnChat = new JButton("Chat");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChat.setToolTipText("Open NSMS Chat");
		  btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TODO check if necessary!!
								
				chat_gui chat = new chat_gui();
				chat.setVisible(true);
				chat.setAlwaysOnTop(true);
				chat.setAutoRequestFocus(true);
				chat.setResizable(false);
				
			}
		});
		btnChat.setForeground(Color.WHITE);
		btnChat.setBackground(Color.DARK_GRAY);
		menuBar.add(btnChat); */
						
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit the application");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.DARK_GRAY);
		menuBar.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmNsms.dispose();
				
			}
		});
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		frmNsms.getContentPane().add(desktopPane, "cell 0 1,grow");
		desktopPane.setLayout(new MigLayout("", "[407px][1470.00px]", "[651px][13px][308.00px]"));
		
		JInternalFrame internalFrameBrowser = new JInternalFrame("Browser");		
		internalFrameBrowser.setToolTipText("Your Main File Browser");
		internalFrameBrowser.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.WHITE));
		internalFrameBrowser.setResizable(true);
		internalFrameBrowser.setFrameIcon(cheap_logo);
		internalFrameBrowser.setVisible(true);
		desktopPane.add(internalFrameBrowser, "cell 0 0 1 3,grow");
		
		JLabel lblItAppearsThere = new JLabel("<html>It appears there is no local NSMS directory set up yet. Press the button below to do so.</html>");
		lblItAppearsThere.setBounds(10, 11, 114, 159);
		internalFrameBrowser.getContentPane().add(lblItAppearsThere);
						
		JButton btnCreateANew = new JButton("Create Local Dir");
		btnCreateANew.setBounds(0, 181, 124, 23);
		btnCreateANew.setToolTipText("Creates a Local directory to store all files, at a specific location on your system.");
		btnCreateANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//removes the dialog and new Dir button
				internalFrameBrowser.remove(lblItAppearsThere);
				internalFrameBrowser.remove(btnCreateANew);
				internalFrameBrowser.repaint();
				
				new_parent_directory newparentdir = new new_parent_directory();
				newparentdir.setVisible(true);
				
			}
		});
		internalFrameBrowser.getContentPane().setLayout(null);
		internalFrameBrowser.getContentPane().add(btnCreateANew);
		
		JMenuItem mntmCreateNewDir = new JMenuItem("Create New Dir");
		mntmCreateNewDir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                
				//removes the dialog and new Dir button
				internalFrameBrowser.remove(lblItAppearsThere);
				internalFrameBrowser.remove(btnCreateANew);
				internalFrameBrowser.repaint();
				
				new_parent_directory newparentdir = new new_parent_directory();
				newparentdir.setVisible(true);		
								
			}
		});
		mnEdit.add(mntmCreateNewDir);
		
		JButton btnTimeTable = new JButton("Time Table");
		btnTimeTable.setBackground(Color.DARK_GRAY);
		btnTimeTable.setForeground(Color.WHITE);
		menuBar.add(btnTimeTable);
		
		JButton btnCalendar = new JButton("Calendar");
		btnCalendar.setForeground(Color.WHITE);
		btnCalendar.setBackground(Color.DARK_GRAY);
		menuBar.add(btnCalendar);
						
		JInternalFrame internalFrameMain = new JInternalFrame("Main");
		internalFrameMain.setToolTipText("Your Viewing area");
		internalFrameMain.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.WHITE));
		internalFrameMain.setResizable(true);
		internalFrameMain.setFrameIcon(cheap_logo);
		internalFrameMain.setVisible(true);
		desktopPane.add(internalFrameMain, "cell 1 0 1 3,grow");
		internalFrameMain.getContentPane().setLayout(new MigLayout("", "[]", "[]"));
	}
}