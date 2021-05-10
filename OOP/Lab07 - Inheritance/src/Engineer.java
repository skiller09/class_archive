
public class Engineer extends Employee{
	String workZone;
	String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name, employeeNum);
		department = "Engineering";
		this.workZone = workZone;
		this.project = project;
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Engineer other = (Engineer)obj;
			if(workZone.equals(other.workZone) && project.equals(other.project))
				return true;
		}
		return false;
	}
	
	public String toString() {
		String temp = super.toString();
		return (temp +"\nlocation : "+department+", zone : "+workZone);
	}
}