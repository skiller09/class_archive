import java.util.*;

public class PriceListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int input;
		PriceList myList = new PriceList();
		int i=0;
		
		while(true) {
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a oil to price list");
			System.out.println("(2) View Region Information");
			System.out.println("(3) Print the entire price list");
			System.out.println("(4) Exit the program");
			System.out.println("=========================================");
			System.out.print("choose a menu : ");
			input = keyboard.nextInt();
			
			switch(input) {
			case 1:
				try {
					if(myList.isFull()) throw new FullArrayException();
				}catch(FullArrayException e) {
					System.out.println(e.getMessage());
					int amount = keyboard.nextInt();
					myList.extendList(amount);
					System.out.println("list extended.\n");
				}
				finally {
					System.out.print("company : ");
					String company = keyboard.next();
					System.out.print("supply price : ");
					int supply_p = keyboard.nextInt();
					myList.setPriceList(i, 0, new Gasoline(supply_p, company));
					System.out.println("gasoline added\n");
					
					System.out.print("company : ");
					company = keyboard.next();
					System.out.print("supply price : ");
					supply_p = keyboard.nextInt();
					myList.setPriceList(i++, 1, new Diesel(supply_p, company));
					System.out.println("diesel added\n");
				}
				break;
				
			case 2:
				System.out.print("region number to view : ");
				int a = keyboard.nextInt();
				System.out.println(myList.getRegionInfo(a-1)+"\n");
				break;
				
			case 3:
				myList.printList();
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
