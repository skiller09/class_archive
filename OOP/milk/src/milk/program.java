package milk;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();

		if(n%8==1) System.out.println(1);
		else if(n%8==5) System.out.println(5);
		else if(n%4==3) System.out.println(3);
		else {
			if(n%8==0||n%8==2) System.out.println(2);
			else System.out.println(4);
		}
		
	}

}
