import java.util.*;
import java.io.*;

public class Restaurant {
	static TableSet tbset;
	static ArrayList<Dish> dishes_lee;
	static ArrayList<Dish> dishes_kang;
	
	public static void main(String[] args) throws InterruptedException{
		tbset = new TableSet();
		dishes_lee = new ArrayList<Dish>();
		dishes_kang = new ArrayList<Dish>();
		Kitchen kitchen = new Kitchen();
		Chef lee, kang;
		String line, dishName;
		int tbNum;
		
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("OrderSheet.txt"));
			
			for(int i=0;inputStream.hasNext();i++) {
				line = inputStream.nextLine();
				tbNum = Integer.parseInt(line.substring(7));
				while(!inputStream.hasNext("Table") && inputStream.hasNext()) {
					dishName = inputStream.nextLine();
					if(i%2==0) dishes_lee.add(new Dish(tbNum,dishName));
					else dishes_kang.add(new Dish(tbNum,dishName));
				}
			}
			
			lee = new Chef("Lee", kitchen, dishes_lee);
			kang = new Chef("Kang", kitchen, dishes_kang);
			
			lee.start();
			kang.start();
			
		} catch(FileNotFoundException e) {
			System.out.println("File OrderSheet.txt was not found");
			System.out.println("or could not be opened.");
			System.exit(0);
		}
	}
}
