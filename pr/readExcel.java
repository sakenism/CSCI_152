import org.apache.poi.ss.usermodel.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.FileNotFoundException;
class readExcel{
static ArrayList<ArrayList<String>> wb = new ArrayList<ArrayList<String>>(); // <-- 2D ArrayList 




public static void printList(ArrayList<ArrayList<String>> al){
	int k = 0;                                                // Print
    for (ArrayList<String> lists: al) {                       //all elements
      System.out.print("\n" + k++ + " -> ");                     // of 2DArraylist
      for (String elements: lists)    System.out.print(elements + "\t");//using for loops  
    }
}


public static void addBook(ArrayList<ArrayList<String>> al, String number, String author, String title, String year, String ISBN, String publisher, String LLC, String stock ){
	al.add(new ArrayList<String>());
	int numRow = al.size();
	int rowww = numRow - 1;
	al.get(rowww).add(number);
	al.get(rowww).add(author);
	al.get(rowww).add(title);
	al.get(rowww).add(year);
	al.get(rowww).add(ISBN);
	al.get(rowww).add(publisher);
	al.get(rowww).add(LLC);
	al.get(rowww).add(stock);
}


public static void modifyBook(ArrayList<ArrayList<String>> al, int row, int cell, String newValue){
	 al.get(row-1).set(cell, newValue);
}


public static void deleteBook(ArrayList<ArrayList<String>> al, int row){
	
	al.remove(row-1);
	
	
}
public static void search(ArrayList<ArrayList<String>> aList, String string)
{

	for (int i = 0; i < aList.size(); i++)
	{
	    for (int j = 0; j < aList.get(i).size(); j++)
	    {
    if (aList.get(i).get(j).matches("(.*)"+string+"(.*)")  ) {
 
    System.out.println("found");
    System.out.println(aList.get(i));
    
        }
    }
}

}


public static String[][] toArray(ArrayList<ArrayList<String>> mainList){
	String[][] array = new String[mainList.size()][];
	for (int i = 0; i < mainList.size(); i++) {
	    ArrayList<String> row = mainList.get(i);
	    array[i] = row.toArray(new String[row.size()]);
	}
	return array;
	}

public static void printToArray(){
	for (String[] x : toArray(wb))
    {
       for (String y : x)
       {
            System.out.print(y + " ");
       }
       System.out.println();
    }
}

public static ArrayList<ArrayList<String>> createArrayList() throws IOException, InvalidFormatException, FileNotFoundException{
	
        File file = new File("/home/saken/Desktop/readXls/lmsdb.xls");

        //Create Workbook instance holding reference to .xls file
        Workbook workbook = WorkbookFactory.create(file);

        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // Obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            wb.add(new ArrayList<String>()); // <-- Add an element (another ArrayList of strings) corresponding to one row
            
            // Iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
            	int numRows = wb.size(); // <-- get current number of rows
            	int roww = numRows - 1; // <--and last index number we can use
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell); // <--  DataFormatter to format and get each cell’s value as String
                wb.get(roww).add(cellValue); 
            }
            
        }     
 return wb;


	}
}

/*public static void main(String[] args) throws IOException, InvalidFormatException, FileNotFoundException{
    try {
    	readExcel re = new readExcel();
        File file = new File("lmsdb.xls");

        //Create Workbook instance holding reference to .xls file
        Workbook workbook = WorkbookFactory.create(file);

        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // Obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            wb.add(new ArrayList<String>()); // <-- Add an element (another ArrayList of strings) corresponding to one row
            
            // Iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
            	int numRows = wb.size(); // <-- get current number of rows
            	int roww = numRows - 1; // <--and last index number we can use
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell); // <--  DataFormatter to format and get each cell’s value as String
                wb.get(roww).add(cellValue); 
            }
            
        }
        //System.out.print(wb.get(127).get(7)); //<-- elements of 2D ArrayList can be accessed this way. First index corresponds to the number of book, and second is for excel file's columns 
        deleteBook(wb, 1);
        search(wb, "780521827782");
        re.printList();
        //modifyBook(wb, 2, 1, "1");
       // addBook(wb, "1","1","1","1","1","1","1","1")
        }
    
    catch(FileNotFoundException ex){
 	   ex.printStackTrace();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
 
}
}*/