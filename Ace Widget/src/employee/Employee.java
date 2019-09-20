package employee;

public class Employee {
	private int q1, q2, q3, q4;
	private String name;


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
	public int getTotal() {
		return q1+q2+q3+q4;
	}
	public int getSales(int num) {
		int q = num;
		if (q==1) {
			return q1;
		}
		else if (q==2) {
			return q2;
		}
		else if (q==3) {
			return q3;
		}
		else
			return q4;
	}
	
	public void setEmployee(String nm, int quarter1, int quarter2, int quarter3, int quarter4) {
		name = nm;
		q1 = quarter1;
		q2 = quarter2;
		q3 = quarter3;
		q4 = quarter4;
	}
	
	public int getQ1() {
		return q1;
	}
	public int getQ2() {
		return q2;
	}
	public int getQ3() {
		return q3;
	}
	public int getQ4() {
		return q4;
	}
}


