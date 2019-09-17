package employee;

import javax.swing.*;
import BreezySwing.*;

public class aceUI extends GBFrame {
	
	
		JTextArea outputArea = addTextArea("", 1,1,3,5);
	
		JButton newEmployee = addButton							("New Employee",		 10, 1, 1, 1);
		JButton output = addButton								("Output",				 10, 2, 1, 1);
		JButton topSales = addButton							("Top Sales",			 10, 3, 1, 1);
		JButton bottomSales = addButton							("Bottom Sales",		 10, 4, 1, 1);

		private Employee emp;
		
		public aceUI(JFrame parent) {
	        emp = new Employee ();
	        outputArea.setText (emp.toString());
	        outputArea.setEditable (false);

	    }
		
		public void buttonClicked(JButton buttonObj) {
			if(buttonObj == newEmployee) {
				aceUI dlg = new aceUI();
				if (dlg.getDlgCloseIndicator().equals("OK"))
	                outputArea.setText(emp.toString());
			}
		}
		
		
		
		
		
	public static void main(String[] args) {
		JFrame frm = new aceUI();
		frm.setTitle("Home");
		frm.setResizable (false);
		frm.setSize(1000, 600);
		frm.setVisible(true);
	}

}