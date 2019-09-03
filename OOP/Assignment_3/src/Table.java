import java.util.*;

public class Table {
	private int TableNum;
	private ArrayList<Dish> dishSet;
	
	public Table() {
		dishSet = new ArrayList<Dish>(4);
	}
	
	public int getTableNum() {
		return TableNum;
	}
	
	public void setTableNum(int number) {
		TableNum = number;
	}
	
	public ArrayList<Dish> getDishSet(){
		return dishSet;
	}
}
