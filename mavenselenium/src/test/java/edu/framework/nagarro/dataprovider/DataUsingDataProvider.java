package edu.framework.nagarro.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataUsingDataProvider {

	String projectRoot = System.getProperty("user.dir");
	String filePath = projectRoot + "\\src\\test\\resources\\testdata\\TestData.xlsx";
	FileInputStream fis;
	XSSFWorkbook wb;

	public LinkedList<LinkedList<String>> getDataFromExcel(final String sheetName) {
		LinkedList<LinkedList<String>> data = new LinkedList<LinkedList<String>>();
		try {
			fis = new FileInputStream(filePath);
			wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet(sheetName);
			Iterator<Row> ri = ws.rowIterator();
			Row rowHeading = ri.next(); //Ignoring Row Heading
			Row contentRow;
			Iterator<Cell> ci;
			while (ri.hasNext()) {
				contentRow = ri.next();
				ci = contentRow.cellIterator();
				ci.next();
				LinkedList<String> tempList = new LinkedList<String>();
				while (ci.hasNext()) {
					Cell currentCell = ci.next();
					String value = currentCell.getStringCellValue();
					System.out.println(currentCell.getStringCellValue());
					tempList.add(value);
				}
				data.add(tempList);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	@DataProvider(name = "myDataProvider")
	public String[][] getTestData(){
		String sheetName = "PersonalDetails";
		LinkedList<LinkedList<String>> temp = getDataFromExcel(sheetName);
		System.out.println(temp);
		int rc = temp.size(); //2 //rows
		System.out.println(temp.get(0));
		int cc = temp.get(0).size(); // 3 //cols
		String[][] testDataArr = new String[rc][cc];
		for(int i = 0;i < rc;i++) {
			for(int j = 0; j < cc; j++) {
				testDataArr[i][j] = temp.get(i).get(j);
			}
		}
		
		for(int i = 0;i < rc;i++) {
			for(int j = 0; j < cc; j++) {
				System.out.printf("[%d][%d] ==> %s ||", i, j, testDataArr[i][j]);
			}
			System.out.println();
		}
		
		return testDataArr;
	}

	public static void main(String[] args) {
		DataUsingDataProvider d = new DataUsingDataProvider();
		d.getTestData();
	}

}

/*
 * 1. Apache poi - to read, write data from and to excel sheet - done with this
 * by adding jar thru maven 2. Excel file from where the data needs to be read
 * is created 3. Identify the path of the Excel, we need to read from 4. To read
 * any file, we need FileInputStream.
 * 
 * Excel step 1. Open a workbook. 2. Identify number of Worksheets in the
 * WorkBook 3. Iterate thru it 4. Get the worksheet which matches with the
 * parameter sheet name 5. Get the Worksheet object 6. Get the RowIterator 7.
 * Get each Row from row Iterator 8. Ignore RowHeading 9. Get Cell Iterator for
 * each Row - ci 10. Ignore First Cell 11. Iterate Thru columns(Cells) using
 * ci.next 12. get the value is each Column(Cell)
 * 
 * 
 * List -- List of Objects - List of String List<String> -- we can represent a
 * row in an excel sheet
 * 
 * List<List<String>> -- Entire Excel
 * 
 * Iterator .next() - > next Object, Row .hasNext() -> next Object exists, Row
 * exists or not
 * 
 */