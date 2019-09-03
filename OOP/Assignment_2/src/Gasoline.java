import java.util.*;

public class Gasoline extends Oil {
	private int price;
	private double VAT;
	
	public Gasoline(int price, String company) {
		super(company,"gasoline");
		this.price = price;
		Random rand = new Random();
		VAT = (double)(rand.nextInt(30)+1)/100;
	}
	
	public double getOilPrice() {
		return price+price*VAT;
	}
	
	public String toString() {
		return (super.toString()+"\nSupply Price : "+price);
	}
}
