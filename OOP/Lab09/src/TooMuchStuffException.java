
public class TooMuchStuffException extends Exception{
	private int inputNum;
	
	public TooMuchStuffException(){
		super("Too much stuff!");
	}
	
	public TooMuchStuffException(int num) {
		this();
		inputNum = num;
	}
	
	public int getInputNum() {
		return inputNum;
	}
	
}
