package kr.co.Quiz1;
import java.util.Scanner;
import kr.co.Quiz.Collection.*;

public class Program {
	public static void main(String[] args) {
		System.out.print("�л� ���� �Է� �ϼ��� : ");
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		Student[] StudentList = new Student[size];
		for(int i=0 ; i<size;i++) {
			System.out.print("�л� �̸��� �Է��ϼ��� : ");
			String name = keyboard.next();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int Korean = keyboard.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int Math = keyboard.nextInt();
			System.out.print("���� ������ �Է� �ϼ��� : ");
			int English = keyboard.nextInt();
			StudentList[i] = new Student(name, Korean, Math, English);
		}
		
		Student.makeRank(StudentList);
		
		for(int i=0;i<size;i++)
			System.out.print((i+1)+". "+StudentList[i].toString());

		keyboard.close();
	}
}
