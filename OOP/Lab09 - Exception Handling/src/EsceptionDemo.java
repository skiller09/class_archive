import java.util.*;

public class EsceptionDemo {

	public static void main(String[] args) throws Exception {
		Scanner key = new Scanner(System.in);
		Employee emp = new Employee("Lee");
		while(true) {
			try {
				System.out.print(emp.getWorkDay()+"일차 근무시간을 입력하세요 : ");
				int input = key.nextInt();
				
				if(input<0) throw new NegativeException();
				else if(input==0) throw new Exception("Program Exit");
				else if(input>24) throw new TooMuchStuffException(input);
				
				emp.addWorkDay();
				emp.addWorkHrs(input);
				System.out.println("이름 : "+emp.getName());
				System.out.println("누적 근무 시간 : "+emp.getWorkHrs());
				System.out.println("No Exception has been occurred");
				
			} catch (NegativeException e) {
				System.out.println(e.getMessage());
			} catch (TooMuchStuffException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getInputNum()+" occurs TooMuchStuffException");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				key.close();
				System.exit(0);
			} finally {
				System.out.println("End of try-catch statement");
			}
			
		}
		
	}

}
