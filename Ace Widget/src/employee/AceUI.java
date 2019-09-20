package employee;

import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class AceUI extends GBFrame {

	// Creates list display and data output area
	JLabel namesLB = addLabel				("Names", 	1, 1, 1, 1);
	JList nameList = addList				(			2, 1, 1, 3);
	GBPanel table = addPanel				(			2, 2, 1, 6);

	// Employee modification menu items
	JMenuItem newEmployee = addMenuItem("Employee", "Add");
	JMenuItem populate = addMenuItem("Employee", "populate");

	// output option menu items
	JMenuItem highSales = 	addMenuItem("Output", "Highest");
	JMenuItem lowSales 	= 	addMenuItem("Output", "Lowest");
	JMenuItem output 	= 	addMenuItem("Output", "ALL");

	private Team team = new Team();
	
	public AceUI() {
		addDetailLabel();
	}
	
	public void menuItemSelected(JMenuItem menuItem) {
		if (menuItem == output) {
			//displayEmployees(team);
		} 
		else if (menuItem == highSales) {
			messageBox(team.getHighest());
		} 
		else if (menuItem == lowSales) {
			messageBox(team.getLowest());
		} 
		else if (menuItem == populate) {
			addNewEmployee(new Employee("bob", 1, 2, 3, 4));
			addNewEmployee(new Employee("frank", 5, 25, 3, 4));
			addNewEmployee(new Employee("roger", 1, 22, 33, 4));
			addNewEmployee(new Employee("matt", -7, 2, -10, 4));
		} 
		else if (menuItem == newEmployee) {
			EmployeeDialog dlg = new EmployeeDialog(this);
			dlg.setVisible(true);
			if (dlg.newEmp != null) {
				addNewEmployee(dlg.newEmp);
			}
		}
	}

	public void listItemSelected (JList listObj){
		int index = nameList.getSelectedIndex();
	     Employee selectedEmployee = team.getMember(index);
	      displayEmployee(selectedEmployee);
	      
	}
	
	private void addDetailLabel() {
		table.addLabel("NAME", 	1, 1, 1, 1);
		table.addLabel("Q1", 	1, 2, 1, 1);
		table.addLabel("Q2",	1, 3, 1, 1);
		table.addLabel("Q3", 	1, 4, 1, 1);
		table.addLabel("Q4", 	1, 5, 1, 1);
		table.addLabel("TOTAL", 1, 6, 1, 1);
	}
	
	public void displayEmployees(Team team) {
		String str = "";
		int index = team.getTeamSize();
		for(int i=0; i <index; i++) {
			
			//str+= emp.toString();
		}
		//table.add(str);
	}
	
	public void displayEmployee(Employee emp) {
		table.addLabel(emp.getName(), 						2, 1, 1, 1);
		table.addLabel(String.format("%d", emp.getQ1()), 	2, 2, 1, 1);
		table.addLabel(String.format("%d", emp.getQ2()),	2, 3, 1, 1);
		table.addLabel(String.format("%d", emp.getQ3()), 	2, 4, 1, 1);
		table.addLabel(String.format("%d", emp.getQ4()), 	2, 5, 1, 1);
		table.addLabel(String.format("%d", emp.getTotal()), 2, 6, 1, 1);
		table.invalidate();
	}
	
	public void addNewEmployee(Employee emp) {
		team.addMember(emp);
		DefaultListModel model = (DefaultListModel) nameList.getModel();
		model.addElement (emp.getName());
        nameList.setSelectedIndex (nameList.getLastVisibleIndex()); //says which row to highlight
	}
	
	public static void main(String[] args) {
		JFrame frm = new AceUI();
		frm.setSize(750, 300);
		frm.setTitle("Employee Information");
		frm.setResizable(true);
		frm.setVisible(true);
	}
}


