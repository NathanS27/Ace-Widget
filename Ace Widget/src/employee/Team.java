package employee;


import java.util.*;

public class Team {
int teamSize = 0;
	
	Employee[] team = new Employee[10];

	public int getTeamSize() {
		return teamSize;
	}
	
	//add error check for 11 members
	public void addMember(Employee employee) {
		team[teamSize++]=employee;
	}

	//index must be less than 11
	public Employee getMember(int index) {	
		return team[index];
	}
	
	public String toString() {

		String str = "";
		
		for(Employee emp : team){
			str += emp.getName()+ ", ";
		}
		return str;
	}
	
	public List getHighest() {
		// finds highest total
		List<Employee> topEmployees = new ArrayList<Employee>();
		int highest = team[0].getTotal();
		for(int i=1; i < teamSize; i++){
			if(team[i].getTotal()>highest) {
				highest = team[i].getTotal();
			}
		}
		
		// find all employees that have the highest total
		for(int i=0; i < teamSize; i++){
			if (team[i].getTotal()==highest) {
				topEmployees.add(team[i]);
			}
		}
		
		return topEmployees;
	}
	
	public List getLowest() {
		// finds lowest total
		List<Employee> bottomEmployees = new ArrayList<Employee>();
		int lowest = team[0].getTotal();
		for(int i=1; i < teamSize; i++){
			if(team[i].getTotal()<lowest) {
				lowest = team[i].getTotal();
			}
		}
		
		// find all employees that have the lowest total
		for(int i=0; i < teamSize; i++){
			if (team[i].getTotal()==lowest) {
				bottomEmployees.add(team[i]);
			}
		}
		
		return bottomEmployees;
	}

}


