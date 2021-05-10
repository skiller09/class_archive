package week1;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.nextLine();
			String[] name=input.split(" ");
			int cnt=name.length -1;
			String output="";
			for(int i=1;i<cnt;i++) {
				output+=name[i].charAt(0);
				output+=".";
			}
			
			output=output.toUpperCase();
			String familyName=name[0].substring(0,1).toUpperCase()+name[0].substring(1).toLowerCase();
			output+=familyName;
			
			System.out.printf("Name Length(Korean) : %d%n",cnt);
			System.out.printf("%s submitted Homework.pdf%n",output);
	}

}