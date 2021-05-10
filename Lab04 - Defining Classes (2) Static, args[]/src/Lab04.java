
public class Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City[] cities = new City[4];
		cities[0] = new City("Soeul",23,45);
		System.out.println(cities[0].toString());
		cities[1] = new City("Paris",123,41);
		System.out.println(cities[1].toString());
		cities[2] = new City("Racoon City");
		System.out.println(cities[2].toString());
		cities[3] = new City("Mega City");
		System.out.println(cities[3].toString());
		
		System.out.println(cities[0].getName() + "-" + cities[1].getName()
				+ " : " + City.getDistance(cities[0],cities[1]));
		System.out.println(cities[0].getName() + "-" + cities[2].getName()
				+ " : " + City.getDistance(cities[0],cities[2]));
		System.out.println(cities[1].getName() + "-" + cities[3].getName()
				+ " : " + City.getDistance(cities[1],cities[3]));
	}

}
