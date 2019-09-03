import java.util.*;
import java.io.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DictionaryArray mine = new DictionaryArray();
		
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a word to dictionary");
			System.out.println("(2) Show definition of word");
			System.out.println("(3) Show word list");
			System.out.println("(4) Remove word");
			System.out.println("(5) print all contents");
			System.out.println("(6) Exit Program");
			System.out.println("=========================================");
			System.out.print("choose a menu : ");
			input = keyboard.nextInt();
			
			switch(input) {
			case 1:
				try {
					System.out.println("word : ");
					String word = keyboard.next();
					System.out.println("definition : ");
					String definition = keyboard.next();
					mine.insertEntry(word, definition);
				}catch(AlreadyExistInDicException e){
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				try {
					System.out.println("word for searching : ");
					String word = keyboard.next();
					mine.getDefinition(word);
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 3:
				try {
					mine.printWords();
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
				try {
					System.out.print("word to remove : ");
					String word = keyboard.next();
					mine.removeWord(word);
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 5:
				try {
					mine.printAll();
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				try {
					System.out.println("\nEnter a file name : ");
					String file = keyboard.next();
					PrintWriter outputStream = new PrintWriter(new FileOutputStream(file));
					for(int i=0;i<mine.getDicList().size();i++) {
						outputStream.println((i+1)+". word : "+mine.getDicList().get(i).getWord());
						outputStream.println("   definition : "+mine.getDicList().get(i).getDefinition());
					}
					System.out.println("saved as "+file);
					System.out.println("exit program");
					outputStream.close();
					
				}catch(Exception e){
					System.out.println(e.getMessage());
				}finally {
					keyboard.close();
					System.exit(0);
				}
				break;	
			default:
				System.out.println("Insert 1 ~ 6");
				break;
			}
				
		}
	}

}
	
