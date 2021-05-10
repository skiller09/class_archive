import java.util.Calendar;
import java.util.Random;

import kr.co.Lab05.Collection.*;

public class Program {

	/**
	 * main 함수
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee myself = new Employee("Kim",4500);
		int year = 1;
		int cnt = 0;
		
		Calendar cal = Calendar.getInstance();
		System.out.println("계약일 : "+cal.get(Calendar.YEAR)+"/"
				+(cal.get(Calendar.MONTH)+1)+"/"
				+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Name : "+myself.getName());
		System.out.println("연봉 : "+myself.getYearlySalary());
		System.out.println("월급 : "+myself.getMonthlySalary());
		System.out.println("재산 : "+myself.getBalance());
		
		Random rnd = new Random();
		int incentive = rnd.nextInt(12)+1;
		int month;
		
		while(myself.getBalance()<20000) {
			myself.receiveSalary();
			if(myself.getBalance()>=20000) break;
			month = cal.get(Calendar.MONTH)+1;
			if(month==incentive) {
				myself.receiveSalary();
				System.out.println(year+"년차 "+month+"월에 인센티브를 받았습니다.");
				if(myself.getBalance()>=20000) break;
			}
			cnt++;
			cal.add(Calendar.MONTH, 1);
			if(cnt==12) {
				year++;
				cnt=0;
				int moremoney = rnd.nextInt(10);
				myself.increaseYearlySalary(moremoney);
				System.out.println(year+"년차 연봉이 "+moremoney
						+"% 인상되었습니다.");
				incentive = rnd.nextInt(12)+1;
			}
		}
		
		System.out.println("날짜 : "+cal.get(Calendar.YEAR)+"/"
				+(cal.get(Calendar.MONTH)+1)+"/"
				+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("이름 : "+myself.getName());
		System.out.println("연봉 : "+myself.getYearlySalary());
		System.out.println("월급 : "+myself.getMonthlySalary());
		System.out.println("재산 : "+myself.getBalance());
	}

}
