import java.util.Calendar;
import java.util.Random;

import kr.co.Lab05.Collection.*;

public class Program {

	/**
	 * main �Լ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee myself = new Employee("Kim",4500);
		int year = 1;
		int cnt = 0;
		
		Calendar cal = Calendar.getInstance();
		System.out.println("����� : "+cal.get(Calendar.YEAR)+"/"
				+(cal.get(Calendar.MONTH)+1)+"/"
				+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Name : "+myself.getName());
		System.out.println("���� : "+myself.getYearlySalary());
		System.out.println("���� : "+myself.getMonthlySalary());
		System.out.println("��� : "+myself.getBalance());
		
		Random rnd = new Random();
		int incentive = rnd.nextInt(12)+1;
		int month;
		
		while(myself.getBalance()<20000) {
			myself.receiveSalary();
			if(myself.getBalance()>=20000) break;
			month = cal.get(Calendar.MONTH)+1;
			if(month==incentive) {
				myself.receiveSalary();
				System.out.println(year+"���� "+month+"���� �μ�Ƽ�긦 �޾ҽ��ϴ�.");
				if(myself.getBalance()>=20000) break;
			}
			cnt++;
			cal.add(Calendar.MONTH, 1);
			if(cnt==12) {
				year++;
				cnt=0;
				int moremoney = rnd.nextInt(10);
				myself.increaseYearlySalary(moremoney);
				System.out.println(year+"���� ������ "+moremoney
						+"% �λ�Ǿ����ϴ�.");
				incentive = rnd.nextInt(12)+1;
			}
		}
		
		System.out.println("��¥ : "+cal.get(Calendar.YEAR)+"/"
				+(cal.get(Calendar.MONTH)+1)+"/"
				+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("�̸� : "+myself.getName());
		System.out.println("���� : "+myself.getYearlySalary());
		System.out.println("���� : "+myself.getMonthlySalary());
		System.out.println("��� : "+myself.getBalance());
	}

}
