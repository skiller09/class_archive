
public class FullArrayException extends Exception {
	public FullArrayException(){
		super("list is full!\ntry to expand...\nHow much will it expand?");
	}
	public FullArrayException(String arg) {
		super(arg);
	}
}
