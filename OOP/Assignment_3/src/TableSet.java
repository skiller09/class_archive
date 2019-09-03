
public class TableSet {
	private Table[] tableSet;
	
	public TableSet() {
		tableSet = new Table[5];
		for(int i=0;i<5;i++) {
			tableSet[i] = new Table();
		}
	}
	
	public void addtoTable(int index, int TableNum, String name) {
		tableSet[index].getDishSet().add(new Dish(TableNum, name));
	}
	
	public Table[] getTableSet() {
		return tableSet;
	}
}
