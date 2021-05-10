
public abstract class Oil {
	private String company;
	private String oilType;
	private double priceInStore;
	
	public Oil(String company, String oilType) {
		this.company = company;
		this.oilType = oilType;
		priceInStore = 0;
	}
	
	public double getPriceInStore() {
		return priceInStore;
	}
	
	public void setOilPrice() {
		priceInStore = getOilPrice();
	}
	
	public String toString() {
		return ("company : "+company+"\noilType : "+oilType);
	}
	
	public abstract double getOilPrice();
}
