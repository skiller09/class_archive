
public class Dish {
	private int tableNum;
	private String name;
	private String tool;
	private int time;

	public Dish(int tableNum_, String name_) {
		tableNum = tableNum_;
		name = name_;
		setTool(name);
		setTime(tool);
	}
	
	public int getTableNum() {
		return tableNum;
	}
	public String getName() {
		return name;
	}
	public String getTool() {
		return tool;
	}
	public int getTime() {
		return time;
	}

	public void setTool(String name) {
		if(name.equals("ramen")||name.equals("stew"))
			tool = "pot";
		else if(name.equals("friedrice")) tool = "fryingpan";
		else if(name.equals("ovenroast")) tool = "oven";
	}
	
	public void setTime(String tool) {
		if(tool.equals("pot")) time = 350;
		else if(tool.equals("fryingpan")) time = 500;
		else if(tool.equals("oven")) time = 1300;
	}
}
