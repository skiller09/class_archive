
public class Engineer extends Employee {
	double rate;
	
	public Engineer(String name, int employeeNum) {
		super(name,employeeNum);
		rate = 4.0;
		department = "Engineering";
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Engineer other = (Engineer)obj;
			return name.equals(other.name) && employeeNum==other.employeeNum;
		}
		return false;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public double getPaid() {
		return workHrs*rate;
	}
}
