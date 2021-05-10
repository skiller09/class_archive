
public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacation;
	
	//Costructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.vacation = 20;
	}
	public Employee(String name, int age, String position, int salary) {
		this(name, age);
		this.position = position;
		this.salary = salary;
		this.vacation = 20;
	}
	public Employee(String name, int age, String position, int salary, int vacation) {
		this(name, age, position, salary);
		this.vacation = vacation;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPosition() {
		return position;
	}
	public int getSalary() {
		return salary;
	}
	public int getVacation() {
		return vacation;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setVacation(int vacation) {
		this.vacation = vacation;
	}
	
	//같은 직원인지 판단
	public boolean equals(Employee another) {
		if(this.name.equals(another) && this.age==another.age && this.position.equals(another))
			return true;
		return false;
	}
	
	//print info
	public String toString() {
		return "Name : "+this.name+", Age : "+this.age
				+", Position : "+this.position+", Salary : "+this.salary
				+", VacationDays : "+this.vacation;
	}
	
	public boolean vacation(int n) {
		if(n>this.vacation) {
			System.out.println("남은 휴가 일수가 부족합니다.");
			return false;
		}
		setVacation(this.vacation-n);
		System.out.printf("휴가를 사용하였습니다. 남은 휴가 일수 : %d%n",getVacation());
		return true;
	}
}
