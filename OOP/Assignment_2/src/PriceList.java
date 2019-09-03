
public class PriceList {
	private Oil[][] priceList;
	private int vertical;
	
	public PriceList() {
		vertical = 2;
		priceList = new Oil[2][2];
	}
	
	public int getVertical() {
		return vertical;
	}
	
	public boolean isFull() {
		return priceList[vertical-1][1]!=null;
	}
	
	public void setPriceList(int i, int j, Oil oil) {
		priceList[i][j] = oil;
		priceList[i][j].setOilPrice();
	}
	
	public void extendList(int amount) {
		Oil[][] temp = priceList;
		priceList = new Oil[amount+vertical][2];
		for(int i=0;i<vertical;i++) {
			priceList[i][0] = temp[i][0];
			priceList[i][1] = temp[i][1];
		}
		vertical+=amount;
	}
	
	public String getRegionInfo(int i) {
		return priceList[i][0].toString()+"\n\n"+priceList[i][1].toString();
	}
	
	public void printList() {
		System.out.println("                Gasoline        Diesel");
		System.out.println("================================================");
		for(int i=0;priceList[i][0]!=null;i++) {
			System.out.print("Region #"+(i+1)+"        ");
			for(int j=0;j<2;j++)
				System.out.print(priceList[i][j].getPriceInStore()+"        ");
			System.out.println("\n");
		}
	}
}
