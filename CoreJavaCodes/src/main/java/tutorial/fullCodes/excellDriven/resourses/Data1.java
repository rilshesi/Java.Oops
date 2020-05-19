package tutorial.fullCodes.excellDriven.resourses;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Data1 {

    public static void main (String[]arg ) throws IOException {
        ArrayList<String> a = new ArrayList<String>();

        String testCases= null;

        String path = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\resourses\\dataDrivenExcel.xlsx";
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        int sheets = workbook.getNumberOfSheets();
        for(int i = 0; i<sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);   // has sheet test data

                Iterator<Row> rows = sheet.iterator(); // has entire row
                Row firstRow = rows.next();            //move to ist row

                Iterator<Cell> cells = firstRow.cellIterator();   //has all cells is first row
                //System.out.println(cells.next().getStringCellValue());    //has the fist cell value in ist row (Testcases)
                int rowIndex = 0;
                int columnIndex = 0;
                int k = 0;
                while(cells.hasNext()) { // to right of testData
                    Cell rowCells = cells.next();  //loop to get all cell in row 0
                    System.out.println(rowCells.getStringCellValue());          // print all cell in row 0 ->

                    if(rowCells.getStringCellValue().equalsIgnoreCase("Testcases")) {
                        columnIndex=k;
                    }else if(rowCells.getStringCellValue().equalsIgnoreCase("Data1")) {
                        columnIndex = k;
                    }else if(rowCells.getStringCellValue().equalsIgnoreCase("Data2")){
                        columnIndex=k;
                    }else if(rowCells.getStringCellValue().equalsIgnoreCase("Data3")){
                        columnIndex=k;
                    }

                    rowIndex++;
                    k++;
                }
                System.out.println(columnIndex);




               /* while (rows.hasNext()){
                    Row row = rows.next();
                    if(row.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(testCases)){
                        Iterator <Cell> istColumn = row.cellIterator();     //iterate downward of ist rowIndex=0 ist columnIndex=0
                    }
                }*/
            }
        }
    }
}
