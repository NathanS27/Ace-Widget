package employee;

public class Employee {
	public int q1, q2, q3, q4;
	public String name;


	public Employee(String nm, int quarter1, int quarter2, int quarter3, int quarter4) {
		name = nm;
		q1 = quarter1;
		q2 = quarter2;
		q3 = quarter3;
		q4 = quarter4;
	}
	public Employee() {
		name = "";
		q1 = 0;
		q2 = 0;
		q3 = 0;
		q4 = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setEmployee(String nm, int quarter1, int quarter2, int quarter3, int quarter4) {
		name = nm;
		q1 = quarter1;
		q2 = quarter2;
		q3 = quarter3;
		q4 = quarter4;
	}
}
