package employee;

import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class AceUI extends GBFrame {

	// Creates list display and data output area
	JLabel namesLB = addLabel				("Names", 				1, 1, 1, 1);
	JLabel detailedInfoLB = addLabel		("Detailed Information",1, 2, 1, 1);
	JList nameList = addList				(						2, 1, 1, 3);
	JTextArea detailedInfoField = addTextArea("", 					2, 2, 1, 6);

	// Employee modification menu items
	JMenuItem modify = addMenuItem("Employee", "Modify");
	JMenuItem delete = addMenuItem("Employee", "Delete");

	// output option menu items
	JMenuItem highSales = 	addMenuItem("Output", "Highest");
	JMenuItem lowSales 	= 	addMenuItem("Output", "Lowest");
	JMenuItem output 	= 	addMenuItem("Output", "ALL");

	JButton newEmployee = addButton("Add Employee", 4, 3, 1, 1);

	private Team team = new Team();

	public void menuItemSelected(JMenuItem menuItem) {
		if (menuItem == output) {
			messageBox("output all");
		} else if (menuItem == highSales) {
			messageBox("Highest sales:");
		} else if (menuItem == lowSales) {
			messageBox("Lowest Sales");
		} 
		else if (menuItem == modify) {
			messageBox("Modify");
		} else if (menuItem == delete) {
			messageBox("Delete");
		}

	}

	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == newEmployee) {
			EmployeeDialog dlg = new EmployeeDialog(this);
			dlg.setVisible(true);
			if (dlg.newEmp != null) {
				team.addMember(dlg.newEmp);
				DefaultListModel model = (DefaultListModel) nameList.getModel();
				model.addElement (dlg.newEmp.getName());
		        nameList.setSelectedIndex (nameList.getLastVisibleIndex()); //says which row to highlight
			}
		}
	}

	public void listItemSelected (JList listObj){
		int index = nameList.getSelectedIndex();
	      Employee selectedEmployee = team.getMember(index);
	      displayEmployee(selectedEmployee);
	}
	
	public void displayEmployees(List<Employee> employees ) {
		String str = "";
		for(Employee emp : employees) {
			str += emp.getName();
		}
		detailedInfoField.setText(str);
	}
	
	public void displayEmployee(Employee emp) {
		detailedInfoField.setText(emp.getName());
	}
	
	
	public static void main(String[] args) {
		JFrame frm = new AceUI();
		frm.setSize(600, 300);
		frm.setTitle("Employee Information");
		frm.setResizable(false);
		frm.setVisible(true);
	}
}
