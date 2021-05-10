
public abstract class Employee {
	String name;
	int employeeNum;
	String department;
	int workHrs;
	double salary;
	
	public Employee(String _name, int _employeeNum) {
		name = _name;
		employeeNum = _employeeNum;
		workHrs = 0;
		salary = 0;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String _department) {
		department = _department;
	}
	
	public int getWorkHrs() {
		return workHrs;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(this.getClass()!=obj.getClass()) return false;
		Employee other = (Employee)obj;
		return (this.name.equals(other.name))&&(this.employeeNum==other.employeeNum);
	}
	
	public String toString() {
		return "Name : "+name+"\nEmp# : "+employeeNum+"\nDept : "+department+"\n";
	}
	
	public void doWork(int hrs) {
		workHrs+=hrs;
		salary = getPaid();
	}
	
	public abstract double getPaid();
	
	public boolean equalPay(Employee emp) {
		return salary==emp.salary;
	}
}
