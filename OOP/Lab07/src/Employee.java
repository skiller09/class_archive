
public class Employee {
	String name;
	int employeeNum;
	String department;
	
	public Employee(String name, int employeeNum) {
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = "No Dept";
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else if(getClass() != obj.getClass()) return false;
		else {
			Employee other = (Employee)obj;
			return ((name == other.name)&&(employeeNum == other.employeeNum));
		}
	}
	
	public String toString() {
		return "Name : "+name+"\nEmp# : "+employeeNum;
	}
}
