
public class Manager extends Employee{
	double overtimeRate;
	double rate;
	int regularHrs;
	
	public Manager(String name, int employeeNum) {
		super(name, employeeNum);
		rate = 5.0;
		overtimeRate = 8.0;
		regularHrs = 40;
		department = "Management";
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(this.getClass()!=obj.getClass()) return false;
		Manager other = (Manager)obj;
		return name.equals(other.name) && employeeNum==other.employeeNum;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public double getPaid() {
		int overtimeHrs = workHrs - regularHrs;
		if(workHrs<40) return workHrs * rate;
		return regularHrs*rate + overtimeHrs*overtimeRate;
	}
}
