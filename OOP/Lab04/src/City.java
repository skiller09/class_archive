import java.util.Random;

public class City {
	private String name;
	private int location_x;
	private int location_y;
	
	//constructor
	public City(String name, int x, int y) {
		this.name = name;
		this.location_x = x;
		this.location_y = y;
	}
	public City(String name) {
		this.name = name;
		Random rnd = new Random();
		int i = rnd.nextInt(360);
		int j = rnd.nextInt(360);
		location_x = i;
		location_y = j;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getLocation_x() {
		return location_x;
	}
	public int getLocation_y() {
		return location_y;
	}
	
	public boolean equals(City another) {
		if(this.name.equals(another) && this.location_x == another.location_x && this.location_y == another.location_y)
			return true;
		return false;
	}
	
	public String toString() {
		return name+", " + Integer.toString(location_x) + ", " + Integer.toString(location_y);
	}
	
	public static double getDistance(City a, City b) {
		double tmp1 = Math.pow(a.location_x-b.location_x, 2);
		double tmp2 = Math.pow(a.location_y-b.location_y, 2);
		
		double ans = Math.sqrt(tmp1+tmp2);
		return ans;
	}
	
	
}
