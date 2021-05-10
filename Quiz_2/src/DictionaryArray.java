import java.util.*;

public class DictionaryArray implements Dictionary{
	private ArrayList<WordDefinitionPair> DicList;
	
	public DictionaryArray() {
		DicList = new ArrayList<WordDefinitionPair>();
	}
	
	public ArrayList<WordDefinitionPair> getDicList() {
		return DicList;
	}
	
	public boolean isEmpty() {
		return DicList.isEmpty();
	}
	
	public void insertEntry(String word, String definition) throws AlreadyExistInDicException {
		for(WordDefinitionPair itger:DicList) {
			if(itger.getWord().equals(word)) throw new AlreadyExistInDicException();
		}
		DicList.add(new WordDefinitionPair(word,definition));
	}
	
	public void getDefinition(String word) throws EmptyException, NotInDicException {
		if(this.isEmpty()) throw new EmptyException();
		for(WordDefinitionPair it:DicList) {
			if(it.getWord().equals(word)) {
				System.out.println(word+" mean : "+it.getDefinition());
				return;
			}
		}
		throw new NotInDicException();
	}
	
	public void removeWord(String word) throws EmptyException, NotInDicException{
		if(this.isEmpty()) throw new EmptyException();
		for(WordDefinitionPair it:DicList) {
			if(it.getWord().equals(word)) {
				DicList.remove(it);
				return;
			}
		}
		throw new NotInDicException();
	}
	
	public void printWords() throws EmptyException{
		if(this.isEmpty()) throw new EmptyException();
		for(int i=0;i<DicList.size();i++) {
			System.out.println((i+1)+". "+DicList.get(i).getWord());
		}
	}
	
	public void printAll() throws EmptyException{
		if(this.isEmpty()) throw new EmptyException();
		for(WordDefinitionPair it:DicList) {
			System.out.println("*****************************************");
			System.out.println("Word : "+it.getWord());
			System.out.println("Definition : "+it.getDefinition());
		}
	}
}
