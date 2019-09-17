package employee;

import java.util.*;

public class Team {

	List <Employee> employees= new ArrayList<Employee>(); 

	public void collection(Employee emp) {
		employees.add(emp);
	}
	
	public String toString() {
		
		String str = "";
		
		Iterator<Employee> itr=employees.iterator();  
		
		while(itr.hasNext()){  
		str += (itr.next()); 
		
		return str;
		}
	}
}
