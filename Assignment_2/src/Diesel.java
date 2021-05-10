import java.util.*;

public class Diesel extends Oil{
	private int price;
	private double VAT;
	private double envTax;
	
	public Diesel(int price, String company) {
		super(company, "diesel");
		this.price = price;
		Random rand = new Random();
		VAT = (double)(rand.nextInt(30)+1)/100;
		envTax = 500;
	}
	
	public double getOilPrice() {
		return price+envTax+price*VAT;
	}
	
	public String toString() {
		return (super.toString()+"\nSupply Price : "+price);
	}
}
