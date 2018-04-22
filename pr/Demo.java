import java.util.ArrayList;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.FileNotFoundException;
public class Demo {
	
	public static void main(String[] args){
		try {
			ArrayList<ArrayList<String>> aList = readExcel.createArrayList();
			readExcel.search(aList, "Ben");
			readExcel.deleteBook(aList, 1);
			readExcel.deleteBook(aList, 127);
			readExcel.deleteBook(aList, 1);
			
			readExcel.addBook(aList, "1", "1","1", "1","1", "1","1", "1");
			readExcel.printList(aList);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}

	

	