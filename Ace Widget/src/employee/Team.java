package employee;


import java.util.*;

public class Team {

	private Employee emp;
	
	List<Employee> team = new ArrayList<Employee>();


		
	public void addMember(Employee employee) {
		emp = employee;
		team.add(emp);
	}
	
	public Employee getMember(int index) {	
		return team.get(index);
	}
	
	public String toString() {

		String str = "";
		
		for(Employee emp : team){
			str += emp.name + ", ";
		}
		return str;
	}
	
}

