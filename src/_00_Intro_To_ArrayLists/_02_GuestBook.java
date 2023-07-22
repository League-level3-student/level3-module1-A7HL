package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	JFrame frame;
	JPanel pane;
	JButton AddName;
	JButton ViewNames;
	
	ArrayList<String> GuestLog;
	
	public static void main(String[] args) {
		new _02_GuestBook().guestBook();
	}
	public void guestBook() {
		GuestLog = new ArrayList<String>();
		
		frame = new JFrame("Guest Book");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		pane = new JPanel();
		frame.add(pane);
		
		AddName = new JButton("Add Name");
		ViewNames = new JButton("View Names");
		
		pane.add(AddName);
		pane.add(ViewNames);
		
		AddName.addActionListener(this);
		ViewNames.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)arg0.getSource();
		
		if(buttonClicked.equals(AddName)) {
			String name = JOptionPane.showInputDialog("Enter a Name.");
			GuestLog.add(name);
			
		}
		if(buttonClicked.equals(ViewNames)) {
			
			String book = "";
			for(int i =0;i<GuestLog.size();i++) {
				int num =i+1;
				String guest = "Guest #"+num+": "+GuestLog.get(i)+"\n";
				book += guest;
			}
			JOptionPane.showMessageDialog(null, book);
		}
	}
}
