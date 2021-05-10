package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary;
	private double monthly_salary;
	private double balance;
	
	/** 
	 * Employee class ������
	 * @param name ���� �̸�
	 * @param yearly_salary ���� ����
	 */
	public Employee(String name, double yearly_salary) {
		this.name = name;
		this.yearly_salary = yearly_salary;
		this.monthly_salary = this.yearly_salary/12;
		this.balance = 0;
	}
	
	/**
	 * ���� �̸� getter
	 * @return ���� �̸�
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * ���� ���� getter
	 * @return ���� ����
	 */
	public double getYearlySalary() {
		return this.yearly_salary;
	}
	
	/**
	 * ���� ���� getter
	 * @return ���� ����
	 */
	public double getMonthlySalary() {
		return this.monthly_salary;
	}
	
	/**
	 * ��� getter
	 * @return ���� ���
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * ���� �λ�
	 * @param byPercent ��% �λ����ִ���
	 * ������ ���� ���޵� �ø���
	 */
	public void increaseYearlySalary(double byPercent) {
		this.yearly_salary += this.yearly_salary * byPercent / 100;
		this.monthly_salary = this.yearly_salary/12;
	}
	
	/**
	 * ���� ���� ������ ��� ���������ִ� �Լ�
	 */
	public void receiveSalary() {
		this.balance += this.monthly_salary;
	}
}
