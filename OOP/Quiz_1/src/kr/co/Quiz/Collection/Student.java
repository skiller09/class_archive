package kr.co.Quiz.Collection;
import java.util.Random;

public class Student {
	private String name;
	private int StudentNumber;
	private int Korean;
	private int Math;
	private int English;
	private double Avg;
	
	public Student(String name, int Korean, int Math, int English) {
		this.name = name;
		Random rnd = new Random();
		this.StudentNumber = rnd.nextInt(9999)+2018000001;
		this.Korean = Korean;
		this.Math = Math;
		this.English = English;
		this.Avg = (double)(Korean+Math+English)/3;
	}
	
	public Student(Student other) {
		this.name = other.name;
		this.StudentNumber = other.StudentNumber;
		this.Korean = other.Korean;
		this.Math = other.Math;
		this.English = other.English;
		this.Avg = other.Avg;	
	}
	
	public static void makeRank(Student[] list) {
		Student temp;
		int l = list.length;
		
		for(int i = l-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(list[j].StudentNumber>list[j+1].StudentNumber) {
					temp = new Student(list[j]);
					list[j] = new Student(list[j+1]);
					list[j+1] = new Student(temp);
				}
			}
		}
	}
	
	public String Grade(int grade) {
		if(grade>=90) return "A";
		else if(grade>=80) return "B";
		else if(grade>=70) return "C";
		else if(grade>=60) return "D";
		else return "F";
	}
	
	public String toString() {
		return ("�̸� : " + this.name + " �й� : " + this.StudentNumber + "\n"
				+ "���� : " + this.Grade(this.Korean) + " ���� : " + this.Grade(this.Math)
				+ " ���� : " + this.Grade(this.English) + "\n" + "��� : " + this.Avg + "\n");
	}
}
