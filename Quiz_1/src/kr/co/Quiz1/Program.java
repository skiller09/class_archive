package kr.co.Quiz1;
import java.util.Scanner;
import kr.co.Quiz.Collection.*;

public class Program {
	public static void main(String[] args) {
		System.out.print("학생 수를 입력 하세요 : ");
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		Student[] StudentList = new Student[size];
		for(int i=0 ; i<size;i++) {
			System.out.print("학생 이름을 입력하세요 : ");
			String name = keyboard.next();
			System.out.print("국어 성적을 입력 하세요 : ");
			int Korean = keyboard.nextInt();
			System.out.print("수학 성적을 입력 하세요 : ");
			int Math = keyboard.nextInt();
			System.out.print("영어 성적을 입력 하세요 : ");
			int English = keyboard.nextInt();
			StudentList[i] = new Student(name, Korean, Math, English);
		}
		
		Student.makeRank(StudentList);
		
		for(int i=0;i<size;i++)
			System.out.print((i+1)+". "+StudentList[i].toString());

		keyboard.close();
	}
}
