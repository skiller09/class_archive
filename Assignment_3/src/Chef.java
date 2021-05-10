import java.util.*;
import java.text.*;

public class Chef extends Thread{
	private String name;
	private Kitchen kitchen;
	private ArrayList<Dish> dishes;
	
	public Chef(String name, Kitchen kitchen, ArrayList<Dish> dishes) {
		this.kitchen = kitchen;
		this.name = name;
		this.dishes = dishes;
	}
	
	public void run() {
		try {
			for(Dish it:dishes) {
				if(it.getTool().equals("pot")) kitchen.usePot();
				else if(it.getTool().equals("fryingpan")) kitchen.useFriedpan();
				else if(it.getTool().equals("oven")) kitchen.useOven();
				sleep(it.getTime());
				System.out.println("Table #"+(it.getTableNum())+" / "
						+it.getName()+" is completed by "+name+".   "
						+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis()));
				if(it.getTool().equals("pot")) kitchen.releasePot();
				else if(it.getTool().equals("fryingpan")) kitchen.releaseFriedpan();
				else if(it.getTool().equals("oven")) kitchen.releaseOven();
				
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
