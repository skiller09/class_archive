import java.util.*;

public class TimeTable {
	private Subject[][] timeTable;
	
	public TimeTable() {
		initialize();
	}
	
	private void initialize() {
		timeTable = new Subject[10][5];
		for(int i=0;i<10;i++) {
			if(i==2) for(int j=0;j<5;j++) timeTable[i][j] = new Subject("BREAK");
			else if(i==6) for(int j=0;j<5;j++) timeTable[i][j] = new Subject("LUNCH");
			else for(int j=0;j<5;j++) timeTable[i][j] = new Subject("----");
		}
	}
	
	private int getNumByDay(String day) {
		if(day.equalsIgnoreCase("Mon")) return 0;
		else if(day.equalsIgnoreCase("Tue")) return 1;
		else if(day.equalsIgnoreCase("Wed")) return 2;
		else if(day.equalsIgnoreCase("Thu")) return 3;
		else if(day.equalsIgnoreCase("Fri")) return 4;
		else return -1;
	}
	
	public Subject getSchedule(String day, int period) {
		if(period>9||period<0) return null;
		return timeTable[period][this.getNumByDay(day)];
	}
	
	public Subject[] getAllSubjects() {
			Subject[] tables = new Subject[50];
			
			int k=0;
			for(int i=0;i<10;i++) {
				for(int j=0;j<5;j++) {
					if(!(timeTable[i][j].getName().equals("----")
							||timeTable[i][j].getName().equals("BREAK")
							||timeTable[i][j].getName().equals("LUNCH")))
						tables[k++] = timeTable[i][j];
				}
			}
			
			return tables;
	}
	
	public Subject getSubjectByTitle(String title) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(title.equals(timeTable[i][j].getName())){
					return new Subject(timeTable[i][j]);
				}
			}
		}
		return null;
	}
	
	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
		if(period==2||period==6||period>9||period<0) return false;
		int weekday = getNumByDay(day);
		if(weekday!=-1) {
			timeTable[period][weekday] = new Subject(name,tutor,room);
			return true;
		}
		return false;
	}
	
	public void printTimeTable() {
		System.out.println("         MON     TUE     WED     THU     FRI");
		for(int i=0;i<10;i++) {
			System.out.printf("%-9d", i+1);
			for(int j=0;j<5;j++) {
				System.out.printf("%-8s", timeTable[i][j].getName());
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TimeTable mySchedule = new TimeTable();
		
		int input;
		
		while(true) {
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a class to my time table");
			System.out.println("(2) View the class");
			System.out.println("(3) Print the entire time table");
			System.out.println("(4) Exit the program");
			input = keyboard.nextInt();
			
			String day, name;
			int period;
			
			switch(input) {
			case 1:
				String tutor, room;
				System.out.print("Day : ");
				day = keyboard.next();
				day = day.toUpperCase();
				System.out.print("Period : ");
				period = keyboard.nextInt()-1;
				System.out.print("Name : ");
				name = keyboard.next();
				System.out.print("Tutor : ");
				tutor = keyboard.next();
				System.out.print("Room : ");
				room = keyboard.next();
				
				if(mySchedule.setSchedule(day, period, name, tutor, room))
					System.out.println("Class successfully added");
				else System.out.println("Class was NOT successfully added");
				break;
				
			case 2:
				System.out.println("==============View the Class=============");
				System.out.println("(1) At a specific period");
				System.out.println("(2) By subject title");
				int secondInput = keyboard.nextInt();
				Subject mySubject;
				switch(secondInput) {
				case 1:
					System.out.print("Day : ");
					day = keyboard.next();
					day = day.toUpperCase();
					System.out.print("Period : ");
					period = keyboard.nextInt()-1;
					mySubject = mySchedule.getSchedule(day, period);
					if(mySubject!=null) {
						System.out.println("At that time you have");
						System.out.println(mySubject.getDetails());
					}
					break;
					
				case 2:
					System.out.println("=============By subject title============");
					System.out.println("(1) Specific title");
					System.out.println("(2) View all subjects");
					int thirdInput = keyboard.nextInt();
					switch(thirdInput) {
					case 1:
						System.out.print("Title : ");
						name = keyboard.next();
						mySubject = mySchedule.getSubjectByTitle(name);
						if(mySubject!=null) System.out.println(mySubject.getDetails());
						else System.out.println("It doesn't exist");
						break;
						
					case 2:
						Subject[] alltables = new Subject[50];
						alltables = mySchedule.getAllSubjects();
						for(int i=0;alltables[i]!=null;i++) {
							System.out.println("------------");
							System.out.println(alltables[i].getDetails());
							System.out.println("------------");
						}
						break;
						
					default:
						System.out.println("Insert 1 ~ 2");
						break;
					}
					break;
					
				default:
					System.out.println("Insert 1 ~ 2");
					break;
					
				}
				break;
				
			case 3:
				mySchedule.printTimeTable();
				break;
				
			case 4:
				System.out.println("Exit the application");
				keyboard.close();
				return;
				
			default:
				System.out.println("Insert 1 ~ 4");
				break;
			}
		}
	}
}
