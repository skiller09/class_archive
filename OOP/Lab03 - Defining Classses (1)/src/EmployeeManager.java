
public class EmployeeManager {

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		employees[0]=new Employee("James Wright",42,"Manager",20000);
		System.out.println(employees[0].toString());
		employees[1]=new Employee("Amy Smith",27,"Design Coordinator",8000,15);
		System.out.println(employees[1].toString());
		employees[2]=new Employee("Peter Coolidge",32,"Assistant",12000,7);
		System.out.println(employees[2].toString());
		employees[3]=new Employee("John Doe",22,"Engineer",10000,10);
		System.out.println(employees[3].toString());
		
		Employee another = new Employee("K",17,"Intern",1000000,1000);
		
		if(employees[1].equals(another)) System.out.println("Amy 맞아요.");
		else System.out.println("Amy 아니에요.");
		
		employees[0].vacation(10);
		employees[2].vacation(10);
		
		for(int i=0;i<4;i++) {
			System.out.println(employees[i].toString());
		}
	}

}
