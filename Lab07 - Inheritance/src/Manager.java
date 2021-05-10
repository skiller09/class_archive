
public class Manager extends Employee{
	int officeNum;
	String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name,employeeNum);
		this.department = "Management";
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public String toString() {
		String temp = super.toString();
		return temp	+"\nlocation : "+department
				+", office : "+officeNum;
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Manager other = (Manager)obj;
			if(officeNum == other.officeNum && team.equals(other.team))
				return true;
		}
		return false;
	}
}
