package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary;
	private double monthly_salary;
	private double balance;
	
	/** 
	 * Employee class 생성자
	 * @param name 직원 이름
	 * @param yearly_salary 직원 연봉
	 */
	public Employee(String name, double yearly_salary) {
		this.name = name;
		this.yearly_salary = yearly_salary;
		this.monthly_salary = this.yearly_salary/12;
		this.balance = 0;
	}
	
	/**
	 * 직원 이름 getter
	 * @return 직원 이름
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 직원 연봉 getter
	 * @return 직원 연봉
	 */
	public double getYearlySalary() {
		return this.yearly_salary;
	}
	
	/**
	 * 직원 월급 getter
	 * @return 직원 월급
	 */
	public double getMonthlySalary() {
		return this.monthly_salary;
	}
	
	/**
	 * 재산 getter
	 * @return 직원 재산
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * 연봉 인상
	 * @param byPercent 몇% 인상해주는지
	 * 연봉에 맞춰 월급도 올린다
	 */
	public void increaseYearlySalary(double byPercent) {
		this.yearly_salary += this.yearly_salary * byPercent / 100;
		this.monthly_salary = this.yearly_salary/12;
	}
	
	/**
	 * 월급 받을 때마다 재산 증가시켜주는 함수
	 */
	public void receiveSalary() {
		this.balance += this.monthly_salary;
	}
}
