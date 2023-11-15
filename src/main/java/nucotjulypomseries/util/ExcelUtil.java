package nucotjulypomseries.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/*public class ExcelUtil {
	
	private static final String TEST_DATA_SHEET_PATH = "./src/test/resource/testdata/logintestdata.xlsx";
	private static Workbook book;
	private static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {

		System.out.println("reading data from sheet: " + sheetName);

		Object data[][] = null;

		try {
			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
			book = WorkbookFactory.create(ip);
			sheet = book.getSheet(sheetName);

			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;

	}

	}
*/	
public class ExcelUtil {
	
	private static final String TEST_DATA_SHEET_PATH = "./src/test/resource/testdata/logintestdata.xlsx";
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;

	public static void getTestData(String sheetName) throws IOException {

	
		//Create an object of File class to open xlsx file
		File file = new File("./src/test/resource/testdata/logintestdata.xlsx");

		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		//creating workbook instance that refers to .xls file
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);

		//creating a Sheet object
		XSSFSheet sheet=wb.getSheet("STUDENT_DATA");

		//get all rows in the sheet
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

		//iterate over all the row to print the data present in each cell.
		for(int i=0;i<=rowCount;i++){
    
			//get cell count in a row
			int cellcount=sheet.getRow(i).getLastCellNum();
    
			//iterate over each cell to print its value
			System.out.println("Row"+ i+" data is :");
    
			for(int j=0;j<cellcount;j++){
        System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
			}
			System.out.println();
		}
		}
}
	
	
	
